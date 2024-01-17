package day016;

/**
 * 705. Design HashSet
 *
 * @author created by sunjy on 1/16/24
 */
public class MyHashSet {

    private boolean[] keys;

    public MyHashSet() {
        keys = new boolean[1000001];
    }

    public void add(int key) {
        keys[key] = true;
    }

    public void remove(int key) {
        keys[key] = false;
    }

    public boolean contains(int key) {
        return keys[key];
    }

}
