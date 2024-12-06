import java.util.Arrays;

public class MergeSort {
    public static void sort(String[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            String[] left = Arrays.copyOfRange(array, 0, mid);
            String[] right = Arrays.copyOfRange(array, mid, array.length);

            sort(left);
            sort(right);

            merge(array, left, right);
        }
    }

    private static void merge(String[] array, String[] left, String[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) array[k++] = left[i++];
        while (j < right.length) array[k++] = right[j++];
    }
}
