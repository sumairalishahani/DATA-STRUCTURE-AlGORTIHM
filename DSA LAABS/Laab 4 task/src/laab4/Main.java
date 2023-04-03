package laab4;

public class Main {
    public static void main(String[] args) {
        int []array={180,165,150,170,145};

        int leng =array.length;
        Sorting S=new Sorting();
        long before=System.currentTimeMillis();
        S.Bubble1D(array);
        long after=System.currentTimeMillis();
        System.out.println("\nthe time taken by Bubble sort array in 1D is :"+(after-before)+" milli seconds");

        long before1=System.currentTimeMillis();
        S.Selection1D(array);
        long after1=System.currentTimeMillis();
        System.out.println("\nthe time taken by Selection sort array in 1D is :"+(after1-before1)+" milli seconds");

        long before2=System.currentTimeMillis();
        S.Insertion1D(array);
        long After2=System.currentTimeMillis();
        System.out.println("\nthe time taken by Insertion sort array in 1D is :"+(After2-before2)+" milli seconds");

        long before3=System.currentTimeMillis();
        S.printQuicksortArray(array);
        long After3=System.currentTimeMillis();
        System.out.println("\nthe time taken by Quick sort array in 1D is :"+(After3-before3)+" milli seconds");

        // 2d array
        int [][] arr={{2, 10, 15}, {5, 1, 3}, {6, 9, 4}};
        S.bubbleSort2D(arr);

    }
}
