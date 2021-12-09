package task5;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        int a = 1, b = 7;
        int[] array = new int[100];

        for(int i = 0; i < array.length; i++) {
            array[i] = a + (int) (Math.random() * b);
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int n: array) {
            set.add(n);
        }

        System.out.println(set);
    }
}
