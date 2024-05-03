package codingQuestions.patterns;
/*
    1
    12
    123
    1234
 */
public class pattern2_pyramid {
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}

