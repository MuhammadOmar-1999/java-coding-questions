package codingQuestions.baseSystems;

import java.util.Scanner;

public class HexToDecimal {
    public static int hexToDec(String hex){
        int decimal = 0;
        int power = 0;
        for(int i = hex.length()-1; i>=0; i--){
            int digit = hex.charAt(i);
            if(Character.isDigit(hex.charAt(i))){
                digit = digit - '0';
            }
            else{
                digit = digit - 55;
            }
            decimal += digit * Math.pow(16, power);
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine();
        int decimal = hexToDec(hex);
        System.out.println(decimal);
    }
}
