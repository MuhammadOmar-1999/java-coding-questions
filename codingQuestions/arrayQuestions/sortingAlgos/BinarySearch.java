package codingQuestions.arrayQuestions.sortingAlgos;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int l = 0;
        int r = arr.length-1;
        while(l<r) {
            int m = (l + r) / 2;
            if (arr[m] == key) {
                return m;
            } else if (arr[m] > key) {
                r = m - 1;
            } else if (arr[m] < key) {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,4, 5, 6, 9, 10, 11, 14, 16, 34, 34, 34, 56, 78, 90};
        System.out.println(binarySearch(arr, 39));
    }
}
