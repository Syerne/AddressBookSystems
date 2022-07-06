package com.blz.address;

import java.util.ArrayList;

public class AddOrRemove {

    ArrayList<Contacts> contactsList = new ArrayList<>();
    Contacts contact = new Contacts();

    /**
     * Purpose - Adding new contacts into the list
     */
    public void addPerson() {

        System.out.println("Enter following details \n" +
                "First Name :");
        String firstName = UserInputs.stringNextValue();

        System.out.println("Last Name :");
        UserInputs.stringNextValue();
        String lastName = UserInputs.stringNextLineValue();
        System.out.println("Address :");
        String address = UserInputs.stringNextLineValue();
        System.out.println("City :");
        String city = UserInputs.stringNextLineValue();
        System.out.println("State :");
        String state = UserInputs.stringNextLineValue();
        System.out.println("Zip Code :");
        int zip = UserInputs.intValue();
        System.out.println("Phone Number :");
        long phoneNo = UserInputs.longValue();
        System.out.println("Email :");
        String email = UserInputs.stringNextValue();

        Contacts contacts = new Contacts();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNo(phoneNo);
        contact.setEmail(email);

        contactsList.add(contact);
    }

    /**
     * Purpose - Display all saved contacts
     */
   /* public void displayPerson() { NOTE: toString method same work

        System.out.println("First Name   : " + contact.getFirstName());
        System.out.println("Last Name    : " + contact.getLastName());
        System.out.println("Address      : " + contact.getAddress());
        System.out.println("City         : " + contact.getCity());
        System.out.println("State        : " + contact.getState());
        System.out.println("Zip code     : " + contact.getZip());
        System.out.println("Phone Number : " + contact.getPhoneNo());
        System.out.println("Email ID     : " + contact.getEmail());
    }*/
    public void displayPerson() {
        System.out.println("All Contact : " + contactsList.size());
        System.out.println(contactsList);
    }

    /**
     * Purpose - Editing existing contact
     */
    public void editPerson() {
        System.out.println("Enter a name you want to edit");
        String editName = UserInputs.stringNextValue();

        boolean found = false;
        for (Contacts contacts : contactsList) {

            if (contacts.getFirstName().equals(editName)) {
                found = true;
                System.out.println(contacts);


                System.out.println("What do you want to edit \n" +
                        "1. First Name / 2. Last Name / 3. Address / 4. City / 5. State / 6. Zip code / 7. Phone Number / 8. Email");
                int choice = UserInputs.intValue();

                switch (choice) {
                    case 1:
                        System.out.println("Enter new First Name");
                        String newFirstName = UserInputs.stringNextValue();
                        contact.setFirstName(newFirstName);
                        break;


                    case 2:
                        System.out.println("Enter new Last Name");
                        String newLastName = UserInputs.stringNextLineValue();
                        contact.setLastName(newLastName);
                        break;

                    case 3:
                        System.out.println("Enter new Address");
                        String newAddress = UserInputs.stringNextLineValue();
                        contact.setAddress(newAddress);
                        break;

                    case 4:
                        System.out.println("Enter new City");
                        String newCity = UserInputs.stringNextLineValue();
                        contact.setCity(newCity);
                        break;

                    case 5:
                        System.out.println("Enter new State");
                        String newState = UserInputs.stringNextLineValue();
                        contact.setState(newState);
                        break;

                    case 6:
                        System.out.println("Enter new Zip code");
                        int newZip = UserInputs.intValue();
                        contact.setZip(newZip);
                        break;

                    case 7:
                        System.out.println("Enter new Phone Number");
                        long newPhoneNo = UserInputs.longValue();
                        contact.setPhoneNo(newPhoneNo);
                        break;

                    case 8:
                        System.out.println("Enter new Email");
                        String newEmail = UserInputs.stringNextValue();
                        contact.setEmail(newEmail);
                        break;
                }
            }
        }
        if (found){
            System.out.println("Successful");
        }else {
            System.out.println("Name Not Found");
        }
    }

    /**
     * Purpose - Remove existing contact
     */
    public void removePerson() {
        System.out.println("enter name you want to delete ");

        String removeName = UserInputs.stringNextValue();

        boolean found = false;

        for (int i = 0; i < contactsList.size(); i++){

            if (contactsList.get(i).getFirstName().equals(removeName)){
                found = true;
                contactsList.remove(i);
            }
        }
        if (found){
            System.out.println("Successful");
        }else{
            System.out.println("Name Not Found");
        }
            /*contact.setFirstName(null);
        contact.setLastName(null);
        contact.setAddress(null);
        contact.setCity(null);
        contact.setState(null);
        contact.setZip(0);
        contact.setPhoneNo(0);
        contact.setEmail(null);*/
    }
}
