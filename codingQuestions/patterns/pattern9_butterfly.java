package codingQuestions.patterns;
/*

*             *
* *         * *
* * *     * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *

*/
public class pattern9_butterfly {
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            for(int j=i; j<n; j++){
                System.out.print("    ");
            }
            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("    ");
            }
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(4);
    }
}
