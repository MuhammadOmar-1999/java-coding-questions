package codingQuestions;
/*
*Write a function CalculateBinaryOperations(str) that accepts the string as an argument or parameter. The string should contain the binary numbers with their operators OR, AND, and XOR?
a. A Means the AND Operation.
b. B Means the OR Operation.
c. C Means the XOR Operation.
By scanning the given string from left to right you’ve to calculate the string and by taking one operator at a time then return the desired output.
Conditions:
1.The priority of the operator is not required.
2.The length of the string is always Odd.
3.If the length of the string is null then return -1.
 */
public class StringBinaryOperations {
    public static int solution(String str){
        char[] charArr = str.toCharArray();
        int result = Integer.parseInt(String.valueOf(charArr[0]));

        for(int i=1; i<charArr.length; i+=2){
            int num = Integer.parseInt(String.valueOf(charArr[i+1]));
            if(charArr[i] == 'A'){
                result = result & num;
            }
            else if(charArr[i] == 'B'){
                result = result | num;
            }
            else if(charArr[i] == 'C'){
                result = result ^ num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("0B1A1C1C0"));
    }
}
