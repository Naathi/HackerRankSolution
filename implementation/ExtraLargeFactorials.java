package implementation;
import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLargeFactorials {

    static void extraLongFactorials(int n) {
       BigInteger factorial=BigInteger.ONE; 
        for (int i = n; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); 
        } 
            System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
