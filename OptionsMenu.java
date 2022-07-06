package com.blz.address;

public class OptionsMenu {
    public void menu() {

        AddOrRemove addOrRemove = new AddOrRemove();
        int choice = 0;
        do {

            System.out.println("\nWhat would u like to do? \n" +
                    "1. Add contact \n" +
                    "2. Display contact \n" +
                    "3. Edit contact \n" +
                    "4. Remove contact \n" +
                    "5. Exit \n");

            choice = UserInputs.intValue();

            switch (choice) {
                case 1:
                    addOrRemove.addPerson();
                    break;

                case 2:
                    addOrRemove.displayPerson();
                    break;

                case 3:
                    addOrRemove.editPerson();
                    break;

                case 4:
                    addOrRemove.removePerson();
                    break;

                case 5:
                    System.out.println("!bye!");


                default:
                    System.out.println("select from menu");
                    break;
            }
        } while (choice != 5);
    }
}
