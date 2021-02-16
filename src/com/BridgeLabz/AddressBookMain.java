package com.BridgeLabz;

import java.util.*;
class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);
    private static AddressBook addressBook = new AddressBook();


    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Management System using Java Stream");
        AddressBookMain addBookMain = new AddressBookMain();
        boolean flag = true;

        while(flag) {

            System.out.println("1.Add Contact");
            System.out.println("2.Edit Contact");
            System.out.println("3.Exit");
            System.out.println("Enter Choice: ");

            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    addressBook.addContactDetails();
                    break;

                case 2:
                    System.out.println("Enter the Person First name to edit details: ");
                    String person_name = sc.next();

                    boolean b = addressBook.editContactDetails(person_name);
                    if (b == true) {
                        System.out.println("Details Updated");
                    } else {
                        System.out.println("Contact Not Found");
                    }
                    break;

                case 3:
                    flag =false;
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }

    }
}

