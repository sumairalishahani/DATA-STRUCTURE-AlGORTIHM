public class fabonacci {
    public static void main(String[] args) {
        long before=System.currentTimeMillis();
        for (int i=5;i<=15;i++){
            System.out.print(fibonaccii(i) +" ");
            long after=System.currentTimeMillis();
            System.out.println(after-before);
        }

    }
    public static int fibonaccii(int n) {
        if (n < 1)
            return 0;
        if (n<3)
            return 1;
        else {
            return fibonaccii(n-1) + fibonaccii(n-2);
        }
    }

}
