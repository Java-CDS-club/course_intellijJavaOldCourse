package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0 ;
        printInstruction();
        while (!quit)
        {
            System.out.println("Enter your coice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 0:
                    printInstruction();
                    break;
                case 1 :
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3 :
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstruction()
    {
        System.out.println("\n press ");
        System.out.println("\t 0 - to print choice options ");
        System.out.println("\t 1 - to print the list of grocery Items");
        System.out.println("\t 2 - to add an item to the list ");
        System.out.println("\t 3 - to modify an item in the list ");
        System.out.println("\t 4 - to remove an item from the list ");
        System.out.println("\t 5 - to search an item in the list");
        System.out.println("\t 6 - to quit the application");
    }
    public static void addItem()
    {
        System.out.print("please enter the grocery Item");
        groceryList.addGroceryItem(scanner.nextLine());

    }
    public static void modifyItem()
    {
        System.out.print("Current item number : ");
        String itemNumber =  scanner.nextLine();
        System.out.println("Enter replacement item");
        String  newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber , newItem );
    }
    public static void removeItem()
    {
        System.out.print("enter item number : ");
        String itemNumber = scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }
    public static void searchForItem()
    {
        System.out.println("Item to search for :");
        String searchItem =scanner.nextLine();
        if (groceryList.onFile(searchItem))
            System.out.println("Found "+searchItem + " in our grocery list");
        else
            System.out.println(searchItem + " is not in the shopping list");
    }
    public static void processArrayList()
    {
        ArrayList<String > newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String> nextArray =  new ArrayList<String>(groceryList.getGroceryList());
        String [] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
