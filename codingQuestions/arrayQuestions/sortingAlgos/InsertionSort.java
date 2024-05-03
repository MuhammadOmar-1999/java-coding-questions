package codingQuestions.arrayQuestions.sortingAlgos;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int selected = arr[i];
            int j;
            for(j=i-1; j>=0 && arr[j]>selected; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = selected;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 54, 23, 1, 8, 90, 8, 2, 4};
        insertionSort(arr);
        for(int i: arr){
            System.out.print(i+", ");
        }
    }
}
