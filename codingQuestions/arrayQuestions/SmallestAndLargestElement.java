package codingQuestions.arrayQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestAndLargestElement {
    public static int findSmallest(int[] arr){
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int findSmallest2(Integer[] arr){
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        return list.get(0);
    }
    public static int findLargest2(Integer[] arr){
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        return list.get(list.size()-1);
    }

    public static int findLargest(int[] arr){
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 23, 41, 56, 18, 23, 90 ,2,4,5,-9, -7, 12, -5};
        System.out.println(findLargest2(arr));
        System.out.println(findSmallest2(arr));
    }

}
