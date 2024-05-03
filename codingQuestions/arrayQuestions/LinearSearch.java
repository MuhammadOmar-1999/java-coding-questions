package codingQuestions.arrayQuestions;

import java.util.Scanner;

public class LinearSearch {
    public static int find(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 45, 15, 61, 84, 98, 72, 13,19};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(find(arr, num));
    }
}
