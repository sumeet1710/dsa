import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean ans = isPrime(50);
        System.out.println(ans);

    }

    static boolean isPrime(int n) {
        boolean isTrue=true;
        if (n <= 1) {
            return false;
        }
        // while(n>1) {if (n%2==0){System.out.println("n is not a prime number");}
        //   else
        for (int i = 2; i < n; ) {
            if (n % i == 0) {
                isTrue=false;

            } else {
                isTrue=true;
            }
        }
return isTrue;
    }
}