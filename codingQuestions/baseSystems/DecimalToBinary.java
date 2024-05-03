package codingQuestions.baseSystems;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = decToBin(decimal);
        System.out.println(binary);
    }

    public static String decToBin(int decimal){
        StringBuilder str = new StringBuilder();
        while(decimal != 0){
            int digit = decimal % 2;
            str.insert(0, digit);
            decimal /= 2;
        }
        return str.toString();
    }
}
