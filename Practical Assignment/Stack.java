import java.util.Arrays;

public class Stack {
    static int j = 0;
    int size;
    int s;
    int a[] = null;

    public Stack() {
        size = 8;
        s = size;
        a = new int[size];
    }

    public Stack(int size) {
        this.size = size;
        s = size;
        a = new int[size];
    }

    public void enqueue(int v) {
        a[--size] = v;
    }

    public void print() {
        System.out.println(Arrays.toString(a));
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
        return s;
    }
}

