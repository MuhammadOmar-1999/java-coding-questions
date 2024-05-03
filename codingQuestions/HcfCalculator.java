package codingQuestions;

import java.util.Scanner;

public class HcfCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = 1;
        for(int i=1; i<(num1 > num2 ? num1: num2); i++){
            if(num1%i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.print(hcf);
    }
}
