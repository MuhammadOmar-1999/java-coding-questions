package codingQuestions;

import java.util.Arrays;

/*
* Write a function SmallLargeSum(array) which accepts the array as an argument or parameter, that performs the addition of the second largest element from the even location with the second largest element from an odd location?
Rules:
a. All the array elements are unique.
b. If the length of the array is 3 or less than 3, then return 0.
c. If Array is empty then return zero.

Sample Test Case 1:
Input:
6
3 2 1 7 5 4
Output:
7
* */
public class AdditionOfSecondLargestEvenOdd {
    public static int solution(int[] arr){
       int secondLargestOdd = findSecondLargestOdd(arr);
       int secondLargestEven = findSecondLargestAtEven(arr);
       return secondLargestOdd+secondLargestEven;

    }

    public static int findSecondLargestOdd(int[] arr){
        Arrays.sort(arr);
        int firstLargestOdd;
        int secondLargestOdd=0;
        int i = 1;
        while(i+2 < arr.length){
            i += 2;
        }
        firstLargestOdd = arr[i];
        while(i >= 0){
            if(arr[i] != arr[i-2]){
                secondLargestOdd = arr[i-2];
                break;
            }
            i -= 2;
        }

        return secondLargestOdd;
    }
    public static int findSecondLargestAtEven(int[] arr){
        Arrays.sort(arr);
        int firstLargestEven=0;
        int secondLargestEven=0;
        int i = 0;
        while(i+2 < arr.length){
            i += 2;
        }
        firstLargestEven = arr[i];
        while(i >= 0){
            if(arr[i] != arr[i-2]){
                secondLargestEven = arr[i-2];
                break;
            }
            i -= 2;
        }
        return secondLargestEven;
    }
    public static void main(String[] args) {
        int[] arr = {4, 0, 7, 9, 6,4,2};
        System.out.println(solution(arr));
    }
}
