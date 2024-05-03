package codingQuestions;

import java.util.Scanner;

public class LcmCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        int largerNumber = num1 > num2 ? num1 : num2;
//        int smallerNumber = num1 < num2 ? num1 : num2;
//        int lcm = largerNumber;
//        for(int i=1;i<=smallerNumber; i++){
//            if((largerNumber * i) % smallerNumber == 0){
//                lcm = largerNumber * i;
//                break;
//            }
//        }
//        System.out.println(lcm);

        int max = Math.max(num1, num2);
        int lcm = max;
        for(int i=max; i<=num1*num2; i+=max ){
            if(i%num1 == 0 && i%num2 == 0){
                lcm = i;
            }
        }
        System.out.println(lcm);

    }
}
