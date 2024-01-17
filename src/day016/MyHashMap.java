package day016;

/**
 * 706. Design HashMap
 *
 * @author created by sunjy on 1/16/24
 */
public class MyHashMap {

    private class Entry {
        int key;
        int value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Entry[] buckets;
    private static final int SIZE = 1000000;

    public MyHashMap() {
        buckets = new Entry[SIZE];
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        Entry current = findElement(index, key);

        if (current == null) {
            Entry newEntry = new Entry(key, value);
            newEntry.next = buckets[index];
            buckets[index] = newEntry;
        } else {
            current.value = value;
        }
    }

    public int get(int key) {
        int index = getIndex(key);
        Entry current = findElement(index, key);

        return (current == null) ? -1 : current.value;
    }

    public void remove(int key) {
        int index = getIndex(key);
        Entry prev = null;
        Entry current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    private int getIndex(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    private Entry findElement(int index, int key) {
        Entry current = buckets[index];
        while (current != null && current.key != key) {
            current = current.next;
        }
        return current;
    }

}
