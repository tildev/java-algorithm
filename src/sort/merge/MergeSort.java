package sort.merge;

/**
 * 합병 정렬
 *
 * @author tildev
 * @data 2021. 03. 21.
 */
public class MergeSort {
    private static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    private static void sort(int[] arr, int low, int high) {
        if (high - low < 2) {
            return;
        }

        int mid = (low + high) / 2;
        sort(arr, 0, mid);
        sort(arr, mid, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;

        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[h++];
            }
        }

        while (l < mid) {
            temp[t++] = arr[l++];
        }

        while (h < high) {
            temp[t++] = arr[h++];
        }

        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 0, 4, 8, 6, 9};
        mergeSort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
