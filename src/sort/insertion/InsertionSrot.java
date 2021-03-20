package sort.insertion;

/**
 * 삽입 정렬
 *
 * @author tildev
 * @data 2021. 03. 20.
 */
public class InsertionSrot {

    private static void sort(int[] A) {
        int temp, j;
        for (int i = 1; i < A.length; i++) {
            temp = A[i];
            for (j = i - 1; j >= 0 && temp < A[j]; j--) {
                A[j + 1] = A[j];
            }
            A[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 0, 4, 8, 6, 9};
        sort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
