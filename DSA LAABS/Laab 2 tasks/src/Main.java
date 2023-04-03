import java.util.Objects;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            contactApp app = new contactApp();
            app.contacts[0][0] = "Sumair Ali";
            app.contacts[0][1] = "03083499635";
            app.contacts[1][0] = "yasir ALi";
            app.contacts[1][1] = "03093490407";
            app.contacts[2][0] = "Amir ALi";
            app.contacts[2][1] = "03008310654";
            app.contacts[3][0] = "Fida Hussain";
            app.contacts[3][1] = "0300000000";

            String choice;
            do {
                System.out.println("-----------------------");
                System.out.println("\t\t\t\t CONTACT APP \n\n");
                System.out.println("1) Display All Contacts");
                System.out.println("2) Search a contact");
                System.out.println("3) Insert a new contact");
                System.out.println("4) Update the contact");
                System.out.println("5) Delete any contact");
                System.out.println("0 To Exit\n");
                System.out.println("Enter your choice:");
                choice = sc.nextLine();
                String name, number;
                for(int i=0;i<5;i++) System.out.println();
                switch (choice) {
                    case "1" -> {
                        app.displayAllContacts();
                        System.out.print("Press any key");
                        String temp=sc.nextLine();
                    }
                    case "2" -> {
                        System.out.print("Enter name to search: ");
                        name = sc.nextLine();
                        if (app.searchContact(name)) System.out.println("Contact Found with number "+app.contacts[contactApp.index][1]);
                        else System.out.println("Contact not found!");
                        System.out.print("Press any key");
                        String temp=sc.nextLine();
                    }
                    case "3" -> {
                        System.out.print("Enter number to add: ");
                        number = sc.nextLine();
                        System.out.print("Enter name to save this contact: ");
                        name = sc.nextLine();
                        app.addNewContact(name, number);
                        System.out.print("Press any key");
                        String temp=sc.nextLine();
                    }
                    case "4" -> {
                        app.updateContact();
                        System.out.print("Press any key");
                        String temp = sc.nextLine();
                    }
                    case "5"->  {
                        System.out.print("Enter name to delete the contact: ");
                        name = sc.nextLine();
                        app.deleteContact(name);
                        System.out.print("Press any key");
                        String temp = sc.nextLine();
                    }
                }
                for (int i=0;i<10;i++) System.out.println();
            }while (!Objects.equals(choice, "0"));
        }
    }


