class Node{
    int data;
    Node next;
    Node(int data){this.data=data;}
}
public class DSAOperations {
    Node head;
    int sum=0;
    public int sumofArray(int A[]){
        int max=A[0];
        for (int i=0;i<A.length;i++){
            sum+=A[i];
        }
        System.out.println("sum:"+sum);

        for (int i=0;i<A.length;i++){
            if(A[i]>max)
                max=A[i];
    }return max;

    }
    public void insertElement(int data){
        Node newNode=new Node(data);
        Node temp=head;
        head=newNode;
        newNode.next=temp;

    }public int linkedList(){
        int sum=0;
        for (Node temp=head;temp!=null;temp=temp.next){
            sum+=temp.data;
        }
        System.out.println(sum);
        int max= head.data;
        Node curr=head;
        while (curr!=null){
            if (curr.data>max){
                max=curr.data;}
        }curr=curr.next;
        return max;
    }
    public void display(){
        Node cuur=head;
        while (cuur!=null){
            System.out.println(cuur.data+" ");
            cuur=cuur.next;
        }
        System.out.println("null");
    }


}class Main{
    public static void main(String[] args) {
        int A[]={5,7,9,11};
        int B[]={29,35,45} ;
        DSAOperations DSA=new DSAOperations();
       int array1=DSA.sumofArray(A);
       int array2=DSA.sumofArray(B);
       if (array1>array2)
           System.out.println("the maxmium element among arrays is :"+array1);
       else
           System.out.println("the maximum element among arrays is :"+array2);

       DSA.insertElement(11);
       DSA.insertElement(9);
       DSA.insertElement(7);
       DSA.insertElement(5);
        System.out.println( DSA.linkedList());
       DSAOperations DSA1=new DSAOperations();
       DSA1.insertElement(45);
       DSA1.insertElement(35);
       DSA1.insertElement(29);
        System.out.println( DSA1.linkedList());
       DSA1.display();



    }

}
