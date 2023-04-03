public class hanoi_towers {
    static void print(int n, char x, char y, char z)
    {
        if (n == 1)
        {
            System.out.println("Take disk 1 from rod " +  x + " to rod " + y);
            return;
        }
        print(n-1, x, z, y);
        System.out.println("Take disk " + n + " from rod " +  x + " to rod " + y);
        print(n-1, z, y, x);
    }

    public static void main(String args[])
    {
        int num_towers = 3;
        if (args.length>0)
            num_towers=Integer.parseInt(args[0]);
        print(num_towers,'A','C', 'B');
    }


}
