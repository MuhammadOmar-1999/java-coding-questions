package codingQuestions;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        for(int i=2; i<=Math.sqrt(num); i++){
            while(temp%i == 0){
                System.out.print(i+" ");
                temp = temp / i;
            }
        }
    }
}
