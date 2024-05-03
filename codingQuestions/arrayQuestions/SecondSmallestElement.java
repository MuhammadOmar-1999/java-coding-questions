package codingQuestions.arrayQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestElement {
    public static int findSecondSmallest(Integer[] arr){
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i] != firstSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static int findSecondSmallest2(Integer[] arr){
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        int secondSmallest = list.get(0);
        for(int i=1; i<list.size(); i++){
            int element = list.get(i);
            if(element != secondSmallest){
               secondSmallest = element;
               break;
           }
        }
        return secondSmallest;
    }


    public static void main(String[] args) {
        Integer[] arr = {-9, -9, -10, -10, 34, 51, 21, 8, 90 ,-8 ,87, -2};
        System.out.println(findSecondSmallest2(arr));
    }
}
