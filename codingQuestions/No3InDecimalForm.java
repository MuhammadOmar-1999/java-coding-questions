package codingQuestions;

public class No3InDecimalForm {
    public static int solution(int num){
        int count = 0;

        for(int i=1; i<=num; i++){
            int flag = 0;
            int number = i;
            while(number != 0){
                int digit = number % 10;

                if(digit == 3){
                    flag = 1;
                    break;
                }
                number /= 10;
            }
            if(flag == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
