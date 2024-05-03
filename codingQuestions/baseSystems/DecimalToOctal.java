package codingQuestions.baseSystems;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String octal = decToOct(decimal);
        System.out.println(octal);
    }
    public static String decToOct(int decimal){
        StringBuilder str = new StringBuilder();
        while(decimal != 0){
            int digit = decimal % 8;
            str.insert(0, digit);
            decimal /= 8;
        }
        return str.toString();
    }
}
