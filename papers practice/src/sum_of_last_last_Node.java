//class node{
//    node next;
//    int data;
//    node(int data){
//        this.data=data;
//        this.next=null;
//    }
//
//
//}
//public class sum_of_last_last_Node {
//    public static int sum_of_lastNode(node p, node q){
//        node temp1=p;
//        node temp2=q;
//        int sum_of_last_node=0;
//        while (temp1.next!=null){
//
//            temp1=temp1.next;
//
//        }sum_of_last_node+=temp1.data;
//
//        while (temp2.next!=null){
//
//            temp2=temp2.next;
//
//        }sum_of_last_node+= temp2.data;
//
//
//        return sum_of_last_node;
//
//
//    }
//
//    public static void main(String[] args) {
//     node start=new node(5);
//     node s=start;
//     s.next=new node(6);
//     s=s.next;
//     s.next=new node(7);
//     s=s.next;
//
//     node stop=new node(9);
//     node m=stop;
//   m.next=new node(7);
//     m=m.next;
//     m.next=new node(10);
//     m=m.next;
//
//     System.out.println("sum of last nodes of list is "+ sum_of_lastNode(start,stop));
//    }
//
//}
