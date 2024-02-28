package day001_day050.day025;

/**
 * 622. Design Circular Queue
 *
 * @author created by sunjy on 1/25/24
 */
public class MyCircularQueue {

    private int[] queue;
    private int headIndex;
    private int count;
    private int capacity;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.headIndex = 0;
        this.count = 0;
    }

    public boolean enQueue(int value) {
        if (this.count == this.capacity) {
            return false;
        }

        this.queue[(this.headIndex + this.count) % this.capacity] = value;
        this.count++;
        return true;
    }

    public boolean deQueue() {
        if (this.count == 0) {
            return false;
        }

        this.headIndex = (this.headIndex + 1) % this.capacity;
        this.count--;
        return true;
    }

    public int Front() {
        if (this.count == 0) {
            return -1;
        }

        return this.queue[this.headIndex];
    }

    public int Rear() {
        if (this.count == 0) {
            return -1;
        }

        int tailIndex = (this.headIndex + this.count - 1) % this.capacity;
        return this.queue[tailIndex];
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == this.capacity;
    }

}
