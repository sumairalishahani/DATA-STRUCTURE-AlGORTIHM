import java.util.Scanner;

public class HashTable {

    static private class ListNode {

        Object key;

        Object value;

        ListNode next;

    }

    private ListNode[] table;

    private int count;
    public HashTable() {

        table = new ListNode[64];

    }public HashTable(int initialSize) {

        table = new ListNode[initialSize];

    }void dump() {



        System.out.println();

        for (int i = 0; i < table.length; i++) {


            System.out.print(i + ":");

            ListNode list = table[i];

            while (list != null) {

                System.out.print(" (" + list.key + "," + list.value + ")");

                list = list.next;

            }

            System.out.println();

        }

    }

    public void put(Object key, Object value) {


        int bucket = hash(key);

        ListNode list = table[bucket];

        while (list != null) {


            if (list.key.equals(key))

                break;

            list = list.next;

        }


        if (list != null) {

            list.value = value;

        }else {



            if (count >= 0.75*table.length) {
                resize();
            }
            ListNode newNode = new ListNode();
            newNode.key = key;
            newNode.value = value;
            newNode.next = table[bucket];
            table[bucket] = newNode;
            count++;

        }

    }public Object get(Object key) {



        int bucket = hash(key);

        ListNode list = table[bucket];

        while (list != null) {



            if (list.key.equals(key))

                return list.value;

            list = list.next;

        }


        return null;

    }

    public void remove(Object key) {



        int bucket = hash(key);

        if (table[bucket] == null) {
            return;

        }

        if (table[bucket].key.equals(key)) {


            table[bucket] = table[bucket].next;

            count--; // Remove new number of items in the table.

            return;

        }


        ListNode prev = table[bucket];
        ListNode curr = prev.next;

        while (curr != null && ! curr.key.equals(key)) {

            curr = curr.next;

            prev = curr;

        }


        if (curr != null) {

            prev.next = curr.next;

            count--;

        }

    }

    public boolean containsKey(Object key) {



        int bucket = hash(key);

        ListNode list = table[bucket];

        while (list != null) {

            if (list.key.equals(key))

                return true;
            list = list.next;

        }



        return false;

    }

    public int size() {


        return count;

    }

    private int hash(Object key) {

        return (Math.abs(key.hashCode())) % table.length;

    }

    private void resize() {

        ListNode[] newtable = new ListNode[table.length*2];

        for (int i = 0; i < table.length; i++) {


            ListNode list = table[i];
            while (list != null) {



                ListNode next = list.next;
                int hash = (Math.abs(list.key.hashCode())) % newtable.length;



                list.next = newtable[hash];
                newtable[hash] = list;

                list = next;

            }

        }

        table = newtable;

    }
//    private void rehash() {
//        int newCapacity = capacity * 2 + 1;  // double the capacity plus one
//        Hashtable newTable = new Hashtable(newCapacity, loadFactor);
//        Enumeration keys = keys();
//
//        while (keys.hasMoreElements()) {
//            Object key = keys.nextElement();
//            Object value = get(key);
//            newTable.put(key, value);
//        }
//
//        // replace the old table with the new one
//        table = newTable.table;
//        capacity = newCapacity;
//        threshold = (int)(newCapacity * loadFactor);
//    }

}class TestHashTable {

    public static void main(String[] args){

        Scanner textIO=new Scanner(System.in);

        HashTable table = new HashTable(2);

        String key,value;

        while (true) {

            System.out.println("\nMenu:");

            System.out.println(" 1. test put(key,value)");

            System.out.println(" 2. test get(key)");

            System.out.println(" 3. test containsKey(key)");

            System.out.println(" 4. test remove(key)");

            System.out.println(" 5. show complete contents of hash table.");

            System.out.println(" 6. EXIT");

            System.out.print("Enter your command: ");

            switch (textIO.nextInt()) {

                case 1:

                    System.out.print("\n Key = ");

                    key = textIO.next();

                    System.out.print("");

                    System.out.print(" Value = ");

                    value = textIO.next();

                    table.put(key,value);

                    System.out.print("");

                    break;

                case 2:

                    System.out.print("\n Key = ");

                    key = textIO.next();

                    System.out.println(" Value is " + table.get(key));

                    break;

                case 3:

                    System.out.print("\n Key = ");

                    key = textIO.next();

                    System.out.println(" containsKey(" + key + ") is "

                            + table.containsKey(key));

                    break;

                case 4:

                    System.out.print("\n Key = ");

                    key = textIO.next();

                    table.remove(key);

                    break;

                case 5:

                    table.dump();

                    break;

                case 6:

                    return; // End program by returning from main()

                default:

                    System.out.println(" Illegal command.");

                    break;

            }

            System.out.println("\nHash table size is " + table.size());

        }

    }

} //

