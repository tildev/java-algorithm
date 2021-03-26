package sort.radix;

import java.util.Arrays;

/**
 * 기수 정렬
 *
 * @author tildev
 * @data 2021. 03. 26.
 */
public class RadixSort {
    static int getMax(int[] data) {
        int mx = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > mx) {
                mx = data[i];
            }
        }
        return mx;
    }

    static void countSort(int[] data, int exp) {
        int[] output = new int[data.length];
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for (int i = 0; i < data.length; i++) {
            count[(data[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = data.length - 1; i >= 0; i--) {
            output[count[(data[i] / exp) % 10] - 1] = data[i];
            count[(data[i] / exp) % 10]--;
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = output[i];
        }
    }

    static void radixsort(int[] arr) {
        int m = getMax(arr);
        for (int i = 1; m / i > 0; i *= 10) {
            countSort(arr, i);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 0, 4, 8, 6, 9};
        radixsort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
