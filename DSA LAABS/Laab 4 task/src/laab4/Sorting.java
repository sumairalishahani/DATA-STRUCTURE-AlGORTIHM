package laab4;

public class Sorting {
    public void Bubble1D(int[] A){
        System.out.print("Bubble sort 1D:");
        int a;
        int min,temp=0;
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A.length-1-i;j++){
                if (A[j]>A[j+1]){
                    temp=A[i];
                    A[j]=A[i+1];
                    A[i+1]=temp;
                }

            }
        }
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

    }// end of Bubble sort Method
    public void Selection1D(int[] A){
        System.out.print("\nSelection Sort 1D:");
        int min,temp=0;
        for (int i=0;i<A.length;i++){
            min=i;
            for (int j=i+1;j<A.length;j++){
                if (A[j]<A[min]) {
                    min=j;
                }

            }
            temp=A[i];
            A[i]=A[min];
            A[min]=temp;

        }
       // for displaying
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }


    }
    public void Insertion1D(int[] A){
        int temp,j;
        System.out.print("\nInsertion Sort 1D:");
        for (int i=1;i<A.length;i++){
            temp=A[i];
            j=i;
            while (j>0 && A[j-1]>temp){
                A[j]=A[j-1];
                j=j-1;
            }
            A[j]=temp;

        }
        // for displaying
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

    }// End of Insertion method
    public int  Quick1D(int[] A,int low,int high){

        // i am asssuming that my pivot element is at middle position
        int pivot=A[(low+high)/2] ;
        while (low<=high){
            while (A[low]<pivot){
                low++;

            }while (A[high]>pivot){
                high--;
            }
            if (low<=high){
                int temp=A[low];
                A[low]=A[high];
                A[high]=temp;
                low++;
                high++;
            }
        }return low;


    }void QuickSortRecurion(int []A,int low,int high){
        int pi=Quick1D(A,low,high);
        // code for left hand side part of array because i am assuming that my pivot element is at middle
        if(low<pi-1){
            QuickSortRecurion(A,low,pi-1);

        }
        // for right hand size part of array
        if (pi<high){
            QuickSortRecurion(A,high,low);
        }

    }void printQuicksortArray(int []A) {
        System.out.print("\nQuick Sort 1D:");
        for (int i:A){
            System.out.print(i+" ");
        }

    }
    // now in 2D
    void bubbleSort2D(int [][] array){
        System.out.println("bubble sort in 2D:");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (array[i][j] > array[i][j + 1]) {
                    int temp = array[i][j];
                    array[i][j] = array[i][j + 1];
                    array[i][j + 1] = temp;
                }
            }
        }
        // for displaying
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
    }


}
