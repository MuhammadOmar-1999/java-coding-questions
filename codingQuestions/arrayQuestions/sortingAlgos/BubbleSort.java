package codingQuestions.arrayQuestions.sortingAlgos;

public class BubbleSort {
        public static int[] bubbleSort(int[] arr){
            for(int i=1; i<arr.length-1; i++){
                boolean flag = false;
                for(int j=0; j<arr.length-i; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                        flag = true;
                    }
                }
                if(flag == false) break;
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr = {12, 31, 1, 2, 4, 56, 89, 90, 87, 2, 24};
            arr = bubbleSort(arr);
            for (int i : arr) {
                System.out.print(i + ", ");
            }
        }
}
