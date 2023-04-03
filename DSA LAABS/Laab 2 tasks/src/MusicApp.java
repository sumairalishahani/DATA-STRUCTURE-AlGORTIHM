import java.util.Objects;
import java.util.Scanner;

public class MusicApp {
    public static void main(String[] args) {
        FireAir FA=new FireAir();
        FA.songs=new String[FA.size][2];
        FA.songs[0][0]="1";
        FA.songs[0][1]="Jamshoro Asan ja priye jo sahr ";
        FA.songs[1][0]="2";
        FA.songs[1][1]="ma jitha bhi huja sindh tuhnjo thiya ";
        FA.songs[2][0]="3";
        FA.songs[2][1]="Asan Roi Roi kilayo sa jin kha ";
        FA.songs[3][0]="4";
        FA.songs[3][1]="Barish ho rahi bahr or mai kamra mai akela";
        FA.songs[4][0]="5";
        FA.songs[4][1]="";

        Scanner sc=new Scanner(System.in);
        String choice;
        do {
            System.out.println("--------------------------------");
            System.out.println("\t\t\tMUSIC APP\n\n");
            System.out.println("1). Display All Songs");
            System.out.println("2). Add a new song");
            System.out.println("3). Delete a song");
            System.out.println("4). Searching a song");
            System.out.println("5). Update a song");
            System.out.println("0). To exit\n");
            System.out.println("Enter your choice");


            choice = sc.nextLine();
            String name, number;
            for(int i=0;i<3;i++) System.out.println();
            switch (choice) {
                case "1" -> {
                    FA.DiaplaySongs();
                    System.out.print("Press any key");
                    String temp=sc.nextLine();
                }
                case "2" -> {
                    System.out.print("Enter song name to add: ");
                    name=sc.nextLine();
                    FA.addNewSong(name);
                    System.out.println("New song added successfully.");
                    System.out.print("Press any key");
                    String temp=sc.nextLine();
                }
                case "3" -> {
                    System.out.print("Enter serial number of the song to delete: ");
                    name = sc.nextLine();
                    FA.deleteSong(Integer.parseInt(name));
                    System.out.println("Song with Serial number "+name+" deleted successfully.");
                    System.out.print("Press any key");
                    String temp=sc.nextLine();
                }
                case "4" -> {
                    System.out.print("1->Search by serial number: \n2->Search by song name: \n");
                    number = sc.nextLine();
                    if (number.equals("1")) {
                        System.out.print("Enter serial number: ");
                        name = sc.nextLine();
                        if (FA.searchSong(name))
                            System.out.println("Song with serial number " + name + " is " + FA.songs[FireAir.index][1]);
                        else System.out.println("Song not found!");
                    } else if (number.equals("2")) {
                        System.out.print("Enter name of the song: ");
                        name = sc.nextLine();
                        if (FA.searchSong(name))
                            System.out.println("Song with name " + name + " is found Its serial number is " + FA.songs[FireAir.index][0]);
                        else System.out.println("Song not found!");
                    }
                    System.out.print("Press any key");
                    String temp = sc.nextLine();
                }
                case "5" -> {
                    System.out.print("Enter serial number or name of the song to update : ");
                    name = sc.nextLine();
                    FA.updateSong(name);
                    System.out.print("Press any key");
                    String temp = sc.nextLine();
                }
            }
            for (int i=0;i<50;i++) System.out.println();
        }while (!Objects.equals(choice, "0"));
    }
}
