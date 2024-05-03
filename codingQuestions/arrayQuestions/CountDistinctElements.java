package codingQuestions.arrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountDistinctElements {
    public static int countDistinct(Integer[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        return list.size();
    }
    public static int countDistinct2(Integer[] arr){
        int n = arr.length;
        int[] visited = new int[n];

        int countDistinct = 0;
        for(int i=0; i<n; i++){
            if(visited[i]==0){
                for(int j=i; j<n; j++){
                    if(arr[i] == arr[j]){
                        visited[j] = 1;
                    }
                }
                countDistinct++;
            }
        }
        return countDistinct;
    }

    public static int countDistinct3(Integer[] arr){
        int size = arr.length;
        int countDistinct = 0;
        for(int i=0; i<size; i++){
            int flag = 0;
            for(int j=i+1; j<size; j++){
                if(arr[i] == arr[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) countDistinct++;
        }
        return countDistinct;
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 22, 22, 33, 99, 76, 76,89};
        System.out.println(countDistinct3(arr));
    }
}
