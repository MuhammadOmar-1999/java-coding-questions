package codingQuestions.patterns;
/*

          *
        *   *
      *   *   *
    *   *   *   *
  *   *   *   *   *
*   *   *   *   *   *

 */
public class pattern7_pyramid {
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n-1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(6);
    }
}
