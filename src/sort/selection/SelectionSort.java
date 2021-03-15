package sort.selection;

/**
 * 선택정렬
 *
 * @author tildev
 * @data 2021. 03. 15.
 */
public class SelectionSort {

    private static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int indexLowest(int[] arr, int start) {
        int lowIndex = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] < arr[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = indexLowest(arr, i);
            swapElements(arr, i, j);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 0, 4, 8, 6, 9};
        selectionSort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

}
