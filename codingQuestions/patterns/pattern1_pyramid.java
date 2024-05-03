package codingQuestions.patterns;
/*
     *
     **
     ***
     ****
 */
public class pattern1_pyramid {
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
