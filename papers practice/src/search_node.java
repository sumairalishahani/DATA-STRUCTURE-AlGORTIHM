class NOde{
    NOde next;
    int data;
    NOde(int data){this.data=data;
        this.next=null;
    }
}
public class search_node {
    public void searchMiddle(NOde p) {
        NOde fast = p;
        NOde slow = p;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("the midlle node  is " + slow.data);

    }

    public void last_element(NOde p) {
        NOde temp = p;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println("the last node is " + temp.data);
    }

    public void minimum_node(NOde p) {
        NOde temp = p;
        int temp2 = p.data;
        while (temp.next != null) {

            if (temp2 > temp.data) {
                temp2 = temp.data;

            }
            temp = temp.next;

        }
        System.out.println("the minimum node is " + temp2);

    }

    public void maximum_node(NOde p) {
        NOde temp = p;
        int temp2 = p.data;
        while (temp.next != null) {

            if (temp2 < temp.data) {
                temp2 = temp.data;

            }
            temp = temp.next;
        }

        System.out.println("the miximum node is " + temp2);


    }

    public static void main(String[] args) {
        search_node ss=new search_node();
        NOde start=new NOde(9);
        NOde q=start;
        q.next=new NOde(10);
        q=q.next;
        q.next=new NOde(15);
        q=q.next;
        q.next=new NOde(95);
        q=q.next;


        ss.searchMiddle(start);
        ss.last_element(start);
        ss.minimum_node(start);
        ss.maximum_node(start);

    }
}