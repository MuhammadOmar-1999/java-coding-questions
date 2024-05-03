package codingQuestions.baseSystems;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int BinToDec(long binary){
        int decimal = 0;
        int i=0;
        while(binary > 0){
            int digit = (int) binary % 10;
            decimal += digit * Math.pow(2, i);
            i++;
            binary /= 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binary = sc.nextLong();
        int decimal = BinToDec( binary);
        System.out.println(decimal);
    }
}
