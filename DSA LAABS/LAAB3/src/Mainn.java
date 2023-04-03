import laab3.Searching_lab;

import java.util.Arrays;

public class Mainn {
    public static void main(String[] args) {
        long before=System.nanoTime();
        Searching_lab bs = new Searching_lab();
        int arr[] = {1, 2, 36, 7, 9};
        int last = arr.length - 1;
        int key = 2;


        System.out.println("one dimesnional binary search at index:" + bs.binarySearch1D(arr, 0, last, key));
        long After=System.nanoTime();
        System.out.println("the time taken by binary :"+(After-before)+" nano second");



        // for 2d

        int A[][] = {{1, 2, 3},
                {3, 4, 5}};

        int search = 2;

        long before1=System.nanoTime();
        System.out.println(Arrays.toString(bs.binarysearch2D(A, search)));
        long After1=System.nanoTime();
        System.out.println("the time taken by binary in 2d:"+(After1-before1)+" nano second");


        /// linear search for 1d


        int key1 = 2;
        long before2=System.nanoTime();
        System.out.println(key1+" is found at index: "+bs.linearSearch1D(arr, key1));
        long After2=System.nanoTime();
        System.out.println("the time taken by linear in 1d :"+(After2-before2)+" nano second");

        // for 2d


        int key3=5;
        long before3=System.nanoTime();
        bs.linearSearch2D(A,key3);
        long After3=System.nanoTime();
        System.out.println("the time taken by linear in 2d :"+(After3-before3)+" nano second");


        //
    }
}
