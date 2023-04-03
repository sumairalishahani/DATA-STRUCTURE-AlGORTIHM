public class task_2 {
    static  void printNumbers(int n,int start){

        if(start<= n){
            System.out.print(start+" ");
            start=start+1;
            printNumbers(n,start);
        }
        return;
    }
    public static void main(String[] args) {
        printNumbers(10,1);
    }


}
