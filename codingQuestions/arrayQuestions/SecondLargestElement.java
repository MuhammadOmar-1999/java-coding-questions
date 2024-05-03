package codingQuestions.arrayQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestElement {
    public static int findSecondLargest(Integer[] arr){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int findSecondLargest2(Integer[] arr){
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        int secondLargest = list.get(list.size()-1);
        for(int i=list.size()-2; i>=0; i--){
            int element = list.get(i);
            if(element != secondLargest){
                secondLargest = element;
                break;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Integer[] arr = {0, 0, -10, -10, 34, 51, 21, 8, 90,90,90 ,-8 ,87, -2};
        System.out.println(findSecondLargest2(arr));
    }
}
