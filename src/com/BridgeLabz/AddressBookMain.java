package com.BridgeLabz;

import java.util.*;
class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Management System using Java Stream ");
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter the contact details:");
        System.out.println("enter the first name");
        String firstName = sc.next();
        System.out.println("enter the last name");
        String lastName = sc.next();
        System.out.println("enter the address name");
        String address = sc.next();
        System.out.println("enter the city name");
        String city = sc.next();
        System.out.println("enter the state name");
        String state = sc.next();
        System.out.println("enter the email id ");
        String email = sc.next();
        System.out.println("enter the phone number");
        String phoneNumber = sc.next();
        System.out.println("enter the Zip Code ");
        String zip = sc.next();
        ContactDetails cd = new ContactDetails(firstName, lastName, address, city, state, email, phoneNumber, zip);

        ArrayList<ContactDetails> contactList = addressBook.contactList(cd);
        for(ContactDetails contact:contactList){
            System.out.println(contact.getFirstName()+" "+contact.getLastName()+" "+contact.getAddress()+" "+contact.getCity()+
                    " "+contact.getState()+" "+contact.getEmail()+" "+contact.getPhoneNumber()+" "+contact.getZip());
        }


    }

}
