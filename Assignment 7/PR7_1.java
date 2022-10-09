/*
 * Name : Abhi Rupareliya
 * Id   : 21CE117
 * Aim  : Create a generic method for sorting an array of Comparable objects. 
 */
import java.util.Arrays;

public class PR7_1 {
    private <E> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public <E extends Comparable<E>> void selectionSort(E[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[smallest]) <= 0) {
                    smallest = j;
                }
            }

            swap(a, i, smallest);
        }
    }

    public static void main(String[] args) {
        PR7_1 firstsort = new PR7_1();
        String[] arr1 = { "xyz", "def", "pqr", "jkl" };
        firstsort.selectionSort(arr1);
        System.out.println("After sorting String : " + Arrays.toString(arr1));
    }
}