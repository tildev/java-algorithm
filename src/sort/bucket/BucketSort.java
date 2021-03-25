package sort.bucket;

/**
 * 버킷 정렬
 *
 * @author tildev
 * @data 2021. 03. 25.
 */
public class BucketSort {
    public static void bucketSort(int[] arr) {
        int[] bucketArr = new int[arr.length + 1];

        for (int i = 0; i < bucketArr.length; i++) {
            bucketArr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            bucketArr[arr[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucketArr.length; i++) {
            for (int j = 0; j < bucketArr[i]; j++) {
                arr[outPos++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 1, 0, 4, 8, 6, 9};
        bucketSort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
