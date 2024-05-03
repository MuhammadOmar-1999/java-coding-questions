package codingQuestions.arrayQuestions.sortingAlgos;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 54, 23,1,8,90,8,2,4};
        selectionSort(arr);
        for(int i: arr){
            System.out.print(i+", ");
        }
    }
}
