package Lab7;
class GenericNode<T>{
    T data;
    GenericNode<T> next;
    GenericNode(T data){
        this.data=data;
    }
}
public class LikedList<T>{
    public void print(GenericNode<T> head){
        for(GenericNode<T> n=head;n!=null;n=n.next) System.out.print(n.data+"  ");
        System.out.println();
    }
    public int getSize(GenericNode<T> head){
        int size=0;
        for(GenericNode<T> n=head;n!=null;n=n.next)size++;
        return size;
    }
    public boolean isEmpty(GenericNode<T> head){
        return getSize(head)==0;
    }
    public GenericNode<T> insertAtFirst(GenericNode<T> head,T data){
        GenericNode<T> node=new GenericNode<>(data);
        node.next=head;
        return node;
    }
    public GenericNode<T> insertAtEnd(GenericNode<T> head, T data){
        GenericNode<T> n=new GenericNode<>(data);
        if(head==null)return n;
        GenericNode<T> temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        return head;
    }
    public GenericNode<T> insert(GenericNode<T> head,T data,int position){
        int size=getSize(head);
        if(position<1||position>(size+1))throw new IllegalArgumentException("Position must be from 1 to "+(size+1));
        if(position==1) head=insertAtFirst(head,data);
        else {
            GenericNode<T> n=new GenericNode<>(data);
            GenericNode<T> temp=head;
            for(int i=2;i<position;i++){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
        return head;
    }
    public GenericNode<T> deleteFirstNode(GenericNode<T> head){
        if(head==null||head.next==null)return null;
        return head.next;
    }
    public GenericNode<T> deleteLastNode(GenericNode<T> head){
        if(head==null||head.next==null)return null;
        GenericNode<T> temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public GenericNode<T> deleteSpecificNode(GenericNode<T> head,int position){
        if(head==null)throw new IllegalArgumentException("LinkedList does not exist");
        if(position<1||position>(getSize(head)))throw new IllegalArgumentException("Position must be from 1 to "+getSize(head));
        if(position==1)return head.next;
        GenericNode<T> temp=head;
        for(int i=position;i>2;i--){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    public boolean search(GenericNode<T> head,T target){
        for(GenericNode<T> n=head;n!=null;n=n.next){
            if(n.data==target)return true;
        }
        return false;
    }
    public GenericNode<T> delete(GenericNode<T> head,T target){
        if(head==null)return null;
        if(head.data==target)return head.next;
        GenericNode<T> n;
        for(n=head;n.next!=null;n=n.next){
            if(n.next.data==target){
                n.next=n.next.next;
                break;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LikedList<Double> obj=new LikedList<>();
        GenericNode<Double> head=new GenericNode<>(5.2);
        head.next=new GenericNode<>(3.5);
        head.next.next=new GenericNode<>(4.0);
        head.next.next.next=new GenericNode<>(7.7);
        head.next.next.next.next=new GenericNode<>(9.2);
        System.out.println("This is print method");
        obj.print(head);
        System.out.println("This is insert at end");
        head=obj.insertAtEnd(head,6.0);
        obj.print(head);
        System.out.println("This is getSize method");
        System.out.println(obj.getSize(head));
        System.out.println("This is search method");
        System.out.println(obj.search(head,3.0));
    }
}
