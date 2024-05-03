package codingQuestions;

import java.util.Scanner;

public class CheckingForPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println("Prime: "+isPrime);
    }
}
