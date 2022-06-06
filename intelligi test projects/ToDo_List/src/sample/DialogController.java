package sample;

import dataModel.ToDoData;
import dataModel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController
{
    @FXML
    private TextField shortDescription;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;
    public ToDoItem processResults()
    {
        String shortDescription = this.shortDescription.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();
        ToDoItem newItem = new ToDoItem(shortDescription , details , deadlineValue);

        ToDoData.getInstance().addToDoItem(newItem);
        return newItem;
    }
}
