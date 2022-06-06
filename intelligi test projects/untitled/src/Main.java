import java.util.Scanner;

public class Main
{
    private static Scanner scanner =  new Scanner(System.in);
    private static MobilePhone mobilePhone =  new MobilePhone("01122786504");
    public static void main(String[] args)
    {
        boolean quit = false;
        startPhone();
        printAction();
        while (!quit)
        {
            System.out.println("\n Enter action : (6 to show available actions)");
            int action  = scanner.nextInt();
            scanner.nextLine();
            switch (action)
            {
                case 0:
                    System.out.println("\n Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2 :
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4 :
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }
    }
    private static void addNewContact()
    {
        System.out.println("Enter new Contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone Number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name , phone);
        if (mobilePhone.addNewContact(newContact))
        {
            System.out.println("New Contact added "+name + " phone : "+phone);
        }
        else
            System.out.println("Cannot add "+name +" already in file");
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existiongContactRecord = mobilePhone.queryContact(name);
        if (existiongContactRecord == null) {
            System.out.println("Contact Not found");
            return;
        }
       if (mobilePhone.removeContact(existiongContactRecord))
           System.out.println("Successfully deleted");
       else
           System.out.println("Error deleting contact");
    }
    private static void queryContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existiongContactRecord = mobilePhone.queryContact(name);
        if (existiongContactRecord == null) {
            System.out.println("Contact Not found");
            return;
        }
        System.out.println("Name "+existiongContactRecord.getName() + "phone number is "+existiongContactRecord.getPhoneNumber());
        if (mobilePhone.removeContact(existiongContactRecord))
            System.out.println("Successfully deleted");
        else
            System.out.println("Error deleting contact");
    }
    private static void updateContact()
    {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existiongContactRecord =  mobilePhone.queryContact(name);
        if (existiongContactRecord == null)
        {
            System.out.println("Contact Not found");
            return;
        }
        System.out.print("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName , newNumber);
        if (mobilePhone.updateContact(existiongContactRecord , newContact))
            System.out.println("Successfully updating record");
        else
            System.out.println("Error updating record");

    }
    private static void startPhone()
    {
        System.out.println("Starting phone...");
    }
    private static void printAction()
    {
        System.out.println("\n Available actions : \n press");
        System.out.println("0 - to shutdown \n 1 - to print contacts \n 2 - to add a new contact \n 3 - to update existing contact \n 4 - to remove existing contact \n 5 - quary if an existion contact exists \n 6 - to print a list of available actions  ");
        System.out.println("Choose your action :");
    }
}

