import java.util.Scanner;

public class FireAir {
    Scanner scan=new Scanner(System.in);
    int size=10;
    static int index;
    String[][] songs;
    public void DiaplaySongs(){
        System.out.println("Song#        song\n");
        for (String[] song:songs) {
            System.out.println(song[0]+"            "+song[1]);
        }
    }
    public void addNewSong(String song){
        for (int i=0;i< songs.length;i++){
            if(songs[i][0]==null){
                songs[i][0]=String.valueOf(i+1);
                songs[i][1]=song;
                break;
            }
        }
    }
    public void deleteSong(int number){
        for (int i=number-1;i<songs.length;i++){
            if (songs[i][0]!=null){
                songs[i][0]=songs[i+1][0];
                songs[i][1]=songs[i+1][1];
            }
        }
    }
    public boolean searchSong(String song){
        index=-1;
        for (String[] strings : songs){
            index++;
            if (song.equals(strings[1]) || song.equals(strings[0])) return true;
        }
        return false;
    }
    public void updateSong(String song){
        if(searchSong(song)){
            System.out.println("1).Update serial number\n2).Update name");
            String update=scan.nextLine();
            if(update.equals("1")){
                System.out.print("Enter new number to change the previous number: ");
                update=scan.nextLine();
                songs[index][0]=update;
            } else if (update.equals("2")) {

                System.out.print("Enter new name to change the previous name: ");
                update=scan.nextLine();
                songs[index][1]=update;
            }
            System.out.println("Song updates successfully.");
        }
        else System.out.println("Song not found!");
    }
}

