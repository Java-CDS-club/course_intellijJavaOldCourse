package challenge;

import java.util.ArrayList;

public class MobilePhone
{
    private String myNumber ;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber)
    {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact)
    {
        if (findContact(contact.getName()) >= 0 )
        {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact , Contact newContact)
    {
        if (myContacts.contains(oldContact) && !myContacts.contains(newContact))
        {
            int p = myContacts.indexOf(oldContact);
            myContacts.set(p , newContact);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact)
    {
        if (myContacts.contains(contact))
        {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }
    private int findContact(Contact contact)
    {
        return myContacts.indexOf(contact);
    }
    private int findContact(String contact)
    {
        for (int i= 0 ; i < myContacts.size() ; i++)
        {
            if (myContacts.get(i).getName().equals(contact))
                return i;
        }
        return -1;
    }
    public Contact queryContact(String contact)
    {
        for (int i= 0 ; i < myContacts.size() ; i++)
        {
            if (myContacts.get(i).getName().equals(contact))
                return myContacts.get(i);
        }
        return null;
    }
    public void printContacts()
    {
        System.out.println("Contact List");
        for (int i= 0 ; i < myContacts.size() ; i++ )
        {
            System.out.println((i+1)+". " +myContacts.get(i).getName() +" -> "+myContacts.get(i).getPhoneNumber());
            System.out.println((i+1)+" . "+this.myContacts.get(i).getName() + " -> "+this.myContacts.get(i).getPhoneNumber());

        }
    }
}
