class NODe{
        NODe next;
    int data;
    NODe(int data){this.data=data;
        this.next=null;
    }}
public class average_of_nodes {
    public void average_nodes(NODe p){
        NODe temp=p;
        int sum=0;
        int average=0;
        int count=0;
        while (temp.next!=null){
            sum+= temp.data;
            count++;
            temp=temp.next;
            average=sum/count;

            if (count==5){
                break;
            }

        }
        System.out.println("average of first 5 given numbers is "+average);



    }

    public static void main(String[] args) {
        NODe start=new NODe(5);
        NODe q=start;
        q.next=new NODe(10);
        q=q.next;
        q.next=new NODe(15);
        q=q.next;
        q.next=new NODe(20);
        q=q.next;
        q.next=new NODe(25);
        q=q.next;
        q.next=new NODe(30);
        q=q.next;
        average_of_nodes avg=new average_of_nodes();
        avg.average_nodes(start);
    }
}
