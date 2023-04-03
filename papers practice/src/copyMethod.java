class noDe{
    noDe next;
    int data;
    noDe(int data){
        this.data=data;
        this.next=null;
    }


}



public class copyMethod {
    public noDe copy(noDe p){
        noDe q=new noDe(p.data);
        noDe temp=q;
        noDe head=p;
        head=head.next;
        while (head!=null){
            temp.next=new noDe(head.data);
            head=head.next;
            temp=temp.next;
        }return q;


    }

    public void display(noDe head){
        noDe q=head;
        while (q!=null){
            System.out.print(q.data+"->");
            q=q.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        noDe start = new noDe(8);
        start.next = new noDe(9);
        start.next.next = new noDe(10);

        copyMethod cm = new copyMethod();
        noDe cop = cm.copy(start);

        cm.display(cop);
        cm.display(cop);
        cm.display(cop);

    }
}
