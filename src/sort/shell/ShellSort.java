package sort.shell;

/**
 * 쉘 정렬
 *
 * @author tildev
 * @data 2021. 03. 22.
 */
public class ShellSort {
    private static void shellSort(int[] arr) {
        int gap = 1;
        while (gap <= arr.length / 3) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                int idx = i;
                while (idx > gap - 1 && arr[idx - gap] >= tmp) {
                    arr[idx] = arr[idx - gap];
                    idx -= gap;
                }
                arr[idx] = tmp;
            }
            gap = (gap - 1) / 3;
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 0, 4, 8, 6, 9};
        shellSort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
