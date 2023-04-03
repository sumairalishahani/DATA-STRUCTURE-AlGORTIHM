
import java.util.Scanner;

public class contactApp {
    Scanner scan=new Scanner(System.in);
    static int size=5;
    String[][] contacts=new String[size][2];
    static int index;
    void displayAllContacts(){
        System.out.println("Name    Mobile Number");
        for (String[] contact : contacts) {
            System.out.println(contact[0] + "    " + contact[1]);
        }
    }
    boolean searchContact(String name){
        index=-1;
        boolean found=false;
        for (String[] contact : contacts) {
            index++;
            if (name.equals(contact[0])) {
                found = true;
                break;
            }
        }
        return found;
    }

    void addNewContact(String name,String mobile){
        try{
            for (int i=0;i<contacts.length;i++) {
                if(contacts[i][0]==null){
                    contacts[i][0]=name;
                    contacts[i][1]=mobile;
                    break;
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Storage is full!");
        }
    }
    void updateContact() {
        System.out.println("Enter name of contact you want to update: ");
        String name1=scan.nextLine();
        if(searchContact(name1)){
            System.out.println("1->Change name: \n2->Change mobile number: ");
            String choice=scan.nextLine();
            if(choice.equals("1")){
                System.out.print("Enter new name: ");
                String updatedName=scan.nextLine();
                contacts[index][0]=updatedName;
            }else if(choice.equals("2")){
                System.out.print("Enter new number: ");
                String no= scan.nextLine();
                contacts[index][1]=no;
            }
        }else System.out.println("Contact not found! ");

    }

    void deleteContact(String name){
        if(searchContact(name)){
            for(int i=index;i>0;i--){
                contacts[i][0]=contacts[i-1][0];
                contacts[i][1]=contacts[i-1][1];
            }
            contacts[0][0]=null;
            contacts[0][1]=null;
        }else System.out.println("Contact not found!");
    }
}