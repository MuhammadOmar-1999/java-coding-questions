package codingQuestions;
/*
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
* */
public class RatAndFood {
    public static int solution(int r, int unit, int[] arr){
        int totalRequired = r * unit;
        int total = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count++;
            total = total + arr[i];
            if(total >= totalRequired){
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 2, new int[]{2,8,3,5,4,7,1,2}));
    }
}
