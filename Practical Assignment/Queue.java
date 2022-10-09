import java.util.Arrays;

class Queue {
    static int j = 0;
    int size;
    int a[] = null;

    Queue() {
        size = 8;
        a = new int[size];
    }

    Queue(int size) {
        this.size = size;
        a = new int[size];
    }

    public void enqueue(int v) {
        a[j++] = v;
    }

    public void dequeue() {
        a = null;
    }

    public boolean empty() {
        if (a == null)
            return true;
        else
            return false;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        System.out.println(Arrays.toString(a));

    }
}
