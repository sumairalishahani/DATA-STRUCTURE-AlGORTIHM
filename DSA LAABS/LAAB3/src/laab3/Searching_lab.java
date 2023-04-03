package laab3;

public class Searching_lab {

    public  int linearSearch1D(int[] arr, int key) {
        System.out.println("linear search for one dimension\n");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public void linearSearch2D(int[][] A, int key){
        System.out.println("linear search in two dimension:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] == key) {
                    System.out.println(key+" index is found at "+i+" ,"+j);
                }
            }
        }


    }
    public int binarySearch1D(int arr[], int first, int last, int key){
        System.out.println("binary search in one dimension  :");
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                return mid;

            }else  {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }return -1;

    }

    public static int[] binarysearch2D(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1; //2-1=1
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col] < target) {
                row++;
            } else
                col--;
        }
        return new int[]{-1, -1};
    }


}


