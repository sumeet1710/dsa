import java.util.Scanner;
public class QuestionOfFunction {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime());

    }

    static boolean isPrime() {
        int n = 0;
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }

                {
                    return true;
                }
            }
        }

       /* for(int i=1;i<1000;i++){
            if( isArmstrong( i)){
        System.out.println(i+ "  ");
    }}}
    static boolean isArmstrong(int n){
        int sum=0;
         int value=n;
         while(n>0){
             int r=n%10;
             n=n/10;
             sum=sum+r*r*r;}
         return sum==value;

         }

    }









*/
