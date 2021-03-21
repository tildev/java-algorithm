package sort.bubble;

/**
 * 버블 정렬
 *
 * @author tildev
 * @data 2021. 03. 21.
 */
public class BubbleSort {

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 0, 4, 8, 6, 9};
        bubbleSort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
