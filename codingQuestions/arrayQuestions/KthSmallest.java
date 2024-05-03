package codingQuestions.arrayQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthSmallest {
    public static int kthSmallest(Integer[] arr, int k){
        int size = arr.length;
        int i;

        Arrays.sort(arr);

        for(i=0; i<size; i++){
            while(i<size-1 && arr[i] == arr[i+1]){
                i++;
            }
            k--;
            if(k==0){
                break;
            }
        }
        return arr[i];
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,19,12,19};
        System.out.println(kthSmallest(arr, 5));
    }
}
