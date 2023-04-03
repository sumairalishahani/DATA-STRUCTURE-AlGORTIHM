public class ArraysOperations {
    public void insertion(int  A[],int index,int element){

    int B[]=new int[A.length+1];

    for (int i=0;i<B.length;i++) {
        if (i < index) {
            B[i] = A[i];
        }
        else if (i == index) {
            B[i] = element;
        } else
        {
            B[i] = A[i - 1];
        }}
    System.out.println("old array is ");
    for (int j=0;j<A.length;j++){
        System.out.print(A[j]+" ");

    }
    System.out.println(" ");
    System.out.println("new  array is ");
    for (int j=0;j<B.length;j++){
        System.out.print(B[j]+" ");

    }
        System.out.println();

}// end of insertion method

    // Delete method in Array
    public void deleteElement(int [] array,int target){
        int count=0;
        for (int i=0;i<array.length;i++){
            if(target==array[i]){
                for (int j=i;j<array.length-1;j++){

                    array[j]=array[j+1];

                }count=count+1;
                break;
            }}
        if (count==0){
            System.out.println("Element not found ");
        }else{
            System.out.println("Element delete successfully :");
            for (int i=0;i<array.length-1;i++){
                System.out.print(+array[i]+" ");
            }}
        System.out.println();
    }// end of Delete Methods

    // update an element
    public void update_element(int [] A,int index,int new_element){
        A[index]=new_element;
        System.out.println("update method");
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }





    public int  LinearSearching(int[] A,int x) {
        System.out.println("Linear Searching:");
        for (int i = 0; i < A.length; i++) {
            if (x == A[i]) {
                return i;
            }
        }return -1;


    }

    public int binearSearch(int []A,int target){
        System.out.println("binary Search:");
        int p=0;
        int q=A.length-1;
        while (p<=q){
            // let Array[]={1,2,3,5,6,7}    let middle term=0+5/2=2 index=3=
            int middle=(p+q)/2;
            if(A[middle]==target)
                return middle;
            if (A[middle]<target)
                p=middle+1;
            else
                q=middle-1;
        }return     -1;
    }

    public static void main(String[] args) {
        ArraysOperations obj=new ArraysOperations();
        // insert an element
        int A[]={1,3,7,9};
        obj.insertion(A,2,5);

        // linear searching
        System.out.println("the element is at  index :"+obj.LinearSearching(A,3));

        // binary searching
        System.out.println("the element is found at index "+  obj.binearSearch(A,7));

        // Delete method
        obj.deleteElement(A,9);

        // update method
        obj.update_element(A,2,10);







    }

}
