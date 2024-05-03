package codingQuestions.patterns;
/*
    *
   **
  ***
 ****
*****
*/
public class pattern5_rightSidedPyramid {
    public static void pattern(int n){
        int i,j;
        for(i=n; i>=1; i--){
            for(j=1; j<i; j++){
                System.out.print(" ");
            }
            while(j<=n){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
