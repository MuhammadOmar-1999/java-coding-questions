package codingQuestions.baseSystems;

import java.util.Scanner;

public class DecimalToHex {
    public static String decToHex(int decimal){
        StringBuilder str = new StringBuilder();
        while(decimal != 0){
            int digit = decimal % 16;
            String charValue = String.valueOf(digit);
            if(digit >= 10) {
                charValue = Character.toString((char) (digit - 10 + 'A'));
                System.out.println(charValue);
            }
            str.insert(0, charValue);
            decimal /= 16;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String hex = decToHex(decimal);
        System.out.println(hex);
    }
}
