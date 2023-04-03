import com.sun.jdi.event.MonitorContendedEnteredEvent;

public class HT {
    static class Entry{
        Object key;
        Object value;
        Entry next;
        Entry(Object key,Object value){
            this.key=key;
        }

    }
    private Entry[] table;
    private int size;
    double load_factor=0.75;
    public HT(int capacity){
        table=new Entry[capacity];
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean containKey(Object key){
        int index=Hash(key);
        return probe(key,index)!=null;
    }
    public int Hash(Object key){
        int index=(key.hashCode()&0x7FFFFFFF)%table.length;
        if (index<0){
            index+=table.length;
        }
        return index;
    }

    public Entry probe(Object key,int index ){
        Entry entry=table[index];
        while (entry!=null){
            if (entry.key.equals(key)){
            return (Entry) key; }
            else {
                index=index+1%table.length;
                entry=table[index];
            }

        }
        return null;
    }public void insertEntery(Entry entry,int index ){
        while (table[index]!=null){
            index=index+1%table.length;
        }table[index]=entry;
    }
    public boolean containValue(Object value){
        for (int i=0;i<table.length;i++){
            Entry entry=table[i];
            while (entry!=null){
                if (entry.value.equals(value))
                    return true;
            }
        }
        return false;
    }
    public Object get(Object key){
        int index=Hash(key);
        Entry entry=probe(key,index);
        if (entry!=null){
            return entry.value;}return null;
    }

}
