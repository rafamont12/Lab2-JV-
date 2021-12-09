package task3;

public class Queue {
    private int first;
    private int last;
    private int size;
    private int capacity;
    private int[] array;

    public Queue(int c) {
        capacity = c;
        first = size = 0;
        last = capacity - 1;
        array = new int[capacity];
    }

    public void add(int n) {
        if (size == capacity)
            return;
        last = (last + 1) % capacity;
        array[last] = n;
        size = size + 1;
        System.out.println("Число " + n + " додано у чергу");
    }

    public int delete() {
        if (size == 0)
            return Integer.MIN_VALUE;
        int item = array[first];
        first = (first + 1) % capacity;
        size = size - 1;
        return item;
    }
}
