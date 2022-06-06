package sample;

import dataModel.ToDoData;
import dataModel.ToDoItem;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Controller
{
    @FXML
    private ListView<ToDoItem> todoListView;
    private List<ToDoItem> toDoItems;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;
    @FXML
    private BorderPane mainBorderPain;
    @FXML
    private ContextMenu listContextMenu;
    @FXML
    private ToggleButton filterToggleButton;
    private FilteredList<ToDoItem>filteredList;
    private Predicate<ToDoItem> wantAllItems;
    private Predicate<ToDoItem> wantTodayItems;
    public void initialize()
    {
       /* ToDoItem item1 = new ToDoItem("Mail birthday card", "Buy a 30th birthday card for john" , LocalDate.of(2016 , Month.APRIL , 25));
        ToDoItem item2 = new ToDoItem("Doctors Appointment", "See Dr.Smith at 1223 Main Street . Bring paperwork" , LocalDate.of(2016 , Month.MAY , 23));
        ToDoItem item3 = new ToDoItem("Finish design proposal for client", "I promise Mike I'd email website mockups by Friday 22nd April" , LocalDate.of(2016 , Month.APRIL , 22));
        ToDoItem item4 = new ToDoItem("Pickup Doug at the train station", "Doug's arriving on March 23 on the 5:00 train" , LocalDate.of(2016 , Month.MARCH , 23));
        ToDoItem item5 = new ToDoItem("Pick up dry cleaning ", "the clothes should be ready by wednesday" , LocalDate.of(2016 , Month.APRIL , 20));
        toDoItems = new ArrayList<ToDoItem>();
        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
        toDoItems.add(item5);
        ToDoData.getInstance().setToDoItems(toDoItems);*/
        listContextMenu = new ContextMenu();
        MenuItem deleteMenItem = new MenuItem("Delete");
        deleteMenItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
                deleteItem(item);
            }
        });
        listContextMenu.getItems().addAll(deleteMenItem);
        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observable, ToDoItem oldValue, ToDoItem newValue) {
                if (newValue != null)
                {
                    ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });
        wantAllItems = new Predicate<ToDoItem>() {
            @Override
            public boolean test(ToDoItem item) {
                return true;
            }
        };
        wantTodayItems = new Predicate<ToDoItem>() {
            @Override
            public boolean test(ToDoItem item) {
                return (item.getDeadline().equals(LocalDate.now()));
            }
        };

        filteredList = new FilteredList<>(ToDoData.getInstance().getToDoItems(), wantAllItems );
        SortedList<ToDoItem> sortedList = new SortedList<>(filteredList, new Comparator<ToDoItem>() {
            @Override
            public int compare(ToDoItem o1, ToDoItem o2) {
                return o1.getDeadline().compareTo(o2.getDeadline());
            }
        });
       // todoListView.setItems(ToDoData.getInstance().getToDoItems());
        todoListView.setItems(sortedList);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
        todoListView.setCellFactory(new Callback<ListView<ToDoItem>, ListCell<ToDoItem>>() {
            @Override
            public ListCell<ToDoItem> call(ListView<ToDoItem> param) {
                ListCell<ToDoItem> cell = new ListCell<>()
                {
                    @Override
                    protected void updateItem(ToDoItem item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty)
                        {
                            setText(null);
                        }
                        else
                        {
                            setText(item.getShortDescription());
                            if (item.getDeadline().isBefore(LocalDate.now().plusDays(1)))
                            {
                                setTextFill(Color.RED);
                            }
                            else if (item.getDeadline().equals(LocalDate.now().plusDays(1)))
                            {
                                setTextFill(Color.BROWN);
                            }

                        }
                    }
                };
                cell.emptyProperty().addListener(
                        (obs , wasEmpty , isNowEmpty)->
                        {
                            if (isNowEmpty)
                            {
                                cell.setContextMenu(null);
                            }
                            else
                            {
                                cell.setContextMenu(listContextMenu);
                            }
                        }
                );
                return cell;
            }
        });
    }
    @FXML
    public void handleKeyPressed(KeyEvent keyEvent)
    {
        ToDoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (selectedItem!= null)
        {
            if (keyEvent.getCode().equals(KeyCode.DELETE))
            {
                deleteItem(selectedItem);
            }
        }
    }
    @FXML
    public void handleClickListView()
    {
       /* ToDoItem item =  todoListView.getSelectionModel().getSelectedItem();
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due :");
        sb.append(item.getDeadline().toString());
        itemDetailsTextArea.setText(sb.toString());*/
        ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
    }
    @FXML
    public void showNewItemDialog()
    {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPain.getScene().getWindow());
        dialog.setTitle("Add new ToDo item");
        dialog.setHeaderText("Use this dialog to create a new ");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoItemDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        }catch (IOException e)
        {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK)
        {
            DialogController controller = fxmlLoader.getController();
            ToDoItem newItem = controller.processResults();
           // todoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());
            todoListView.getSelectionModel().select(newItem);
        }
    }
    public void deleteItem(ToDoItem item)
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Delete Item "  + item.getShortDescription());
        alert.setTitle("Delete Todo Item");
        alert.setContentText("Are you sure ? Press OK to confirm or cancel to Back out");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK)
        {
            ToDoData.getInstance().deleteToDoItem(item);
        }
    }
    @FXML
    public void handleFilterButton()
    {
        ToDoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (filterToggleButton.isSelected())
        {
            filteredList.setPredicate(wantTodayItems);
            if (filteredList.isEmpty())
            {
                itemDetailsTextArea.clear();
                deadlineLabel.setText("");
            }
            else if (filteredList.contains(selectedItem))
            {
                todoListView.getSelectionModel().select(selectedItem);
            }
            else
            {
                todoListView.getSelectionModel().selectFirst();
            }
        }
        else
        {
            filteredList.setPredicate(wantAllItems);
            todoListView.getSelectionModel().select(selectedItem);
        }
    }
    @FXML
    public void handleExit()
    {
        Platform.exit();
    }
}
