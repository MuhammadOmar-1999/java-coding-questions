package codingQuestions.baseSystems;

import java.util.Scanner;

public class OctalToDecimal {
    public static int OctToDec(long octal){
        int decimal = 0;
        int i=0;
        while(octal > 0){
            int digit = (int) octal % 10;
            decimal += digit * Math.pow(8, i);
            i++;
            octal /= 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long octal = sc.nextLong();
        int decimal = OctToDec( octal);
        System.out.println(decimal);
    }
}
