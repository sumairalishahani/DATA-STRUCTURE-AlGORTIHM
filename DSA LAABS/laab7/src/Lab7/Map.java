package Lab7;

public class Map {
    public static Node map(Node head,String source,String destination){
        Node n;
        Node start=null,temp;
        for(n=head;n!=null;n=n.next){
            if (n.data.equals(source)){
                start=new Node(n.data);
                n=n.next;
                break;
            }
        }

        if(start==null){
            System.out.println("Source is not valid");
            return null;
        }
        temp=start;
        while (!n.data.equals(destination)){
            temp.next=new Node(n.data);
            if(n.next==null)break;
            n=n.next;
            temp=temp.next;

        }
        temp.next=new Node(n.data);
        return start;
    }

    public static void main(String[] args) {
        String[] stops={"Ranipur","Moro","NawabShah","Sehwan","Sann",
                "sarkhand","Dadu","Aliabad","Jamshoro","Karachi"};

        Node head=new Node("Ranipur");

        Node temp=head;

        for(int i=1;i<stops.length;i++){

            temp.next=new Node(stops[i]);

            temp=temp.next;

        }

        System.out.println("A trip from Ranipur to Karachi");

        System.out.println("Different stops from Ranipur to Karachi are: ");

        head=map(head,"Ranipur","Karachi");

        for(Node n=head;n!=null;n=n.next) System.out.print(n.data+" ");

    }

}

