package codingQuestions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        //calculate number of digits
        int numOfDigits = String.valueOf(n).length();

//        while(temp>0){
//            numOfDigits++;
//            temp = temp/10;
//        }

        //re-assign temp to input number
        temp = n;
        int numberAfterConversion = 0;

        //Check it number is armstrong or not
        while(temp>0){
            int digit = temp%10;
            temp = temp/10;
            numberAfterConversion += Math.pow(digit, numOfDigits);
        }

        if(n == numberAfterConversion){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
