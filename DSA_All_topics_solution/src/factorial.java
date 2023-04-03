public class factorial {
    public static void main(String[] args) {
        long before_time=System.currentTimeMillis();
        for (int i=5;i<=15;i++){
            System.out.println(i+"!="+fact(i));
            long after_time=System.currentTimeMillis()-before_time;
            System.out.println("time to run(milli second):"+after_time);
        }

    }
    public static int fact(int n){
        if (n<0)
            return n;
        if (n==1)
            return 1;

        return n*fact(n-1);
    }

}
