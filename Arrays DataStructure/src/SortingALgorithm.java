public class SortingALgorithm {
    public void bubbleSort(int[]A){
        System.out.println("Bubble sorting:");


        for (int i=0;i<A.length-1;i++){
            for (int j=0;j<A.length-i-1;i++){
                if (A[j]>A[j+1]){

                int temp=A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
            }}

        } for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }


    }public void SelectionSort(){

    }public void insertionSort(int A[]){
        System.out.println("insertion sorting:");
        int temp,j;
        for(int i=1;i<A.length;i++){
            temp=A[i];
            j=i;
            while (j>0 &&  A[j-1]>temp){
                A[j]=A[j-1];
                j=j-1;
            }A[j]=temp;
        }
        for (int i=0;i< A.length;i++){
            System.out.print(A[i]+" ");
        }



    }public void QuickSort(){

    }

    public static void main(String[] args) {
        SortingALgorithm obj=new SortingALgorithm();
        int A[]={5,7,3,9,1};
        obj.bubbleSort(A);
       // obj.insertionSort(A);




    }
}
