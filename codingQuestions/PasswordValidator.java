package codingQuestions;

public class PasswordValidator {
    public static int validatePassword(String str){
         int size = str.length();
         if(size < 4) return -1;
         if(Character.isDigit(str.charAt(0))){
             return -1;
         }
         boolean numericDigitPresent = false;
         boolean uppercasePresent = false;
         for(int i=0; i<size; i++){
             if(Character.isDigit(str.charAt(i))){
                 numericDigitPresent = true;
             }
             if(Character.isUpperCase(str.charAt(i))){
                 uppercasePresent = true;
             }
             if(str.charAt(i) == '\'' || str.charAt(i) == '/' || str.charAt(i) == ' ') {
                 return -1;
             }
         }
         if(numericDigitPresent && uppercasePresent){
             return 1;
         }
         return -1;
    }

    public static void main(String[] args) {
        String password = "ub189";
        System.out.println(validatePassword(password));
    }
}
