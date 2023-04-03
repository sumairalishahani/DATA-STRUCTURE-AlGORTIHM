public class Hashtable {

    private static final int capacity = 16;
    private static final double LOAD_FACTOR = 0.75;
    private static class Entry {
        Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value) {
            this.key = key;
            this.value=value;

        }}


    private Entry[] table;
    private int size;

    public Hashtable() {
        table = new Entry[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean containsKey(Object key) {
        int index = getIndex(key);
        return findEntry(key, index) != null;
    }

    public boolean containsValue(Object value) {
        for (int i = 0; i < table.length; i++) {
            Entry entry = new Entry(table[i],value);//.key,table[i].value);
          //  System.out.println(entry.value);
            while (entry != null) {
                if (entry.value.equals(value)) {
                    return true;
                }
                entry = entry.next;
            }
        }
        return false;
    }

    public Object get(Object key) {
        int index = getIndex(key);
        Entry entry = findEntry(key, index);
        if (entry != null) {
            return entry.value;
        }
        return null;
    }

    public Object put(Object key, Object value) {
        int index = getIndex(key);
        Entry entry = findEntry(key, index);
        if (entry != null) {
            Object oldValue = entry.value;
            entry.value = value;
            return oldValue;
        } else {
            if (size >= table.length * LOAD_FACTOR) {
                resize();
                index = getIndex(key);
            }
            Entry newEntry = new Entry(key, value);
            insertEntry(newEntry, index);
            size++;
            return null;
        }
    }

    public Object remove(Object key) {
        int index = getIndex(key);
        Entry prevEntry = null;
        Entry entry = table[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                if (prevEntry == null) {
                    table[index] = entry.next;
                } else {
                    prevEntry.next = entry.next;
                }
                size--;
                return entry.value;
            }
            prevEntry = entry;
            index = (index + 1) % table.length;
            entry = table[index];
        }
        return null;
    }

    private int getIndex(Object key) {
//        int hashCode = key.hashCode();
//        int index = Math.abs(hashCode % table.length);

        return (key.hashCode() & 0x7FFFFFFF) %table.length;
    }

    private Entry findEntry(Object key, int index) {
        Entry entry = table[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry;
            }
            index = (index + 1) % table.length;
            entry = table[index];
        }
        return null;
    }

    private void insertEntry(Entry entry, int index) {
        while (table[index] != null) {
            index = (index + 1) % table.length;
        }
        table[index] = entry;
    }

    private void resize() {
        Entry[] oldTable = table;
        int newCapacity = oldTable.length * 2;
        table = new Entry[newCapacity];
        size = 0;
        for (Entry entry : oldTable) {
            while (entry != null) {
                put(entry.key, entry.value);
                entry = entry.next;
            }
        }
    }


    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        hashtable.put("apple", 1);
        hashtable.put("banana", 2);
        hashtable.put("cherry", 3);
        hashtable.put("date", 4);
        hashtable.put("elderberry", 5);
        System.out.println("Hashtable size: " + hashtable.size());
        System.out.println("Hashtable contains key 'banana': " + hashtable.containsKey("banana"));
        System.out.println("Hashtable contains value 5: " + hashtable.containsValue(5));
        System.out.println("Value for key 'cherry': " + hashtable.get("cherry"));
        System.out.println("Value for key 'fig': " + hashtable.get("fig"));
        hashtable.remove("banana");
        System.out.println("Hashtable size after removing 'banana': " + hashtable.size());
    }
}