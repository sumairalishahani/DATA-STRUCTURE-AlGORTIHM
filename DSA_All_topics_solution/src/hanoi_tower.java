import java.util.Scanner;

public class hanoi_tower {
    public static void main(String[] args) {
        hanoi_tower toh=new hanoi_tower();
        toh.towerOfHanoi(3,'A','C','B');

    }
    public void towerOfHanoi(int n,char s,char d,char h){
        if (n<=0)return;

        towerOfHanoi(n-1,s,h,d);
        System.out.println("Disk "+n+" Moved from "+s+" to "+d);
        towerOfHanoi(n-1,h,d,s);
    }
}
