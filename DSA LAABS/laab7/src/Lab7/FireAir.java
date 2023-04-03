package Lab7;


    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
        }
    }
    public class FireAir {
        public int size(Node head){
            if(head==null)return 0;
            Node temp=head;
            int count=1;
            while (temp.next!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }
        public void print(Node head){
            for (Node n=head;n!=null;n=n.next) System.out.print(n.data+"  ");
            System.out.println();
        }
        public Node insertAtHead(Node head, String data){
            Node n=new Node(data);
            n.next=head;
            head=n;
            return head;
        }
        public Node insertAtEnd(Node head, String data){
            Node n=new Node(data);
            if(head==null)return n;
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            return head;
        }
        public Node insertAtMid(Node head, String data){
            Node n=new Node(data);
            int mid=(2+size(head))/2;
            if(mid==1)head=insertAtHead(head,data);
            else {
                Node temp = head;
                for (int i = mid; i > 2; i--) {
                    temp = temp.next;
                }
                n.next = temp.next;
                temp.next = n;

            }
        return head;
    }
        public Node deleteFirstNode(Node head){
            if(head==null||head.next==null)return null;
            return head.next;
        }
        public Node deleteMiddleNode(Node head){
            if(head==null||head.next==null)return null;
            if(head.next.next==null)return head.next;
            int mid=(1+size(head))/2;
            Node temp=head;
            for(int i=mid;i>2;i--){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return head;
        }
        public Node deleteLastNode(Node head){
            if(head==null||head.next==null)return null;
            Node temp=head;
            while (temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            return head;
        }
        public boolean search(Node head, String target){
            for(Node n = head; n!=null; n=n.next){
                if(n.data.equals(target))return true;
            }
            return false;
        }



        public static void main(String[] args) {
            Node head=new Node("Song1");
            head.next=new Node("Song2");
            head.next.next=new Node("Song3");
            head.next.next.next=new Node("Song4");
            head.next.next.next.next=new Node("Song5");
            FireAir obj=new FireAir();
            System.out.println("This is print method");
            obj.print(head);
            System.out.println("Insertion in the beginning");
            head=obj.insertAtHead(head,"Sumair");
            obj.print(head);
            System.out.println("Insertion at mid");
            head=obj.insertAtMid(head,"ALi");
            obj.print(head);
            System.out.println("Insertion at end");
            head=obj.insertAtEnd(head,"Shahani");
            obj.print(head);
            System.out.println("Deleted first node");
            head=obj.deleteFirstNode(head);
            obj.print(head);
            System.out.println("Delete last node");
            head=obj.deleteLastNode(head);
            obj.print(head);
            System.out.println("Delete middle node");
            head=obj.deleteMiddleNode(head);
            obj.print(head);
            System.out.println("Searching 'C'");
            System.out.println(obj.search(head,"C"));
        }
    }
