public class TesttabRecursion {
    public static void main(String[] args) {
        System.out.println("fabonacci through recursion");
        for (int i = 30; i <= 40; i++) {
            long to = System.currentTimeMillis();
            long m = tab(i);
            long t1 = System.currentTimeMillis();
            System.out.println("table " + i + "=" + m + "\ntime taken is :" + (t1 - to));

        }
        System.out.println("fabonacci through loops:");
        for (int i = 30; i <= 40; i++) {
            long to = System.currentTimeMillis();
            long m = fab2(i);
            long t1 = System.currentTimeMillis();
            System.out.println("table " + i + "=" + m + "\ntime taken is :" + (t1 - to));

        }

    }

    public static long tab(int n){
        if (n<1)return 0;
        if (n<3)return 1;
        return tab(n-2) + tab(n-1);
    }
   public static long fab2(int n){
        if (n<2)return n;
        long to=0,f1=1,f2=1;
        for (int i=2;i<n;i++){
            to=f1;
            f1=f2;
            f2=f1+f2;

        }return f2;
    }

}
