package implementation;
import java.util.Scanner;

public class FindDigitsEachDigitDivisableBySameNumber {

    static int findDigits(int n) {
        int numberOfDivisibleDigits=0;
        int temp=0;
        int number=n;
         while(number > 0)
        {
            temp = number % 10;
            //System.out.println(temp);
            number = number / 10;
            try
            {
            if(n%temp==0)
                numberOfDivisibleDigits++;
            }
            catch(Exception e)
            {
            	
            }
        }
        return numberOfDivisibleDigits;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}
