package codingQuestions;

public class DivisibilityBy9Using5And0 {
    public static long solution(int[] arr){
        int n = arr.length;
        int fiveCount = 0;
        int zeroCount = 0;
        for(int i: arr){
            if(i==5) fiveCount++;
            else zeroCount++;
        }
        if(fiveCount < 9 || zeroCount == 0) return 0l;
        if(fiveCount >= 9) {
            while(true) {
                if(fiveCount % 9 ==0){
                    break;
                }
                fiveCount--;
            }
            long result = 0;
            for(int m=1; m<=fiveCount; m++){
                result = result * 10 + 5;
            }
            for(int m=1; m<=zeroCount; m++) {
                result = result * 10;
            }
            return result;
        }
        return 0l;
    }

    public static void main(String[] args) {
        int[] arr = {5,5,5,5,5,5,5,5,0,5,5};
        System.out.println(solution(arr));
    }
}
