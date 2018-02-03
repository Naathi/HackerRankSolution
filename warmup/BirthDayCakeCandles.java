package warmup;
import java.util.Arrays;
import java.util.Scanner;

public class BirthDayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) { 
        int blownOutCandlesCount=0;
       for(int i=0;i<n;i++)
       {
           if(ar[n-1]==ar[i])
           {
               blownOutCandlesCount++;
           }
       }
        return blownOutCandlesCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        Arrays.sort(ar);
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
        in.close();
    }
}
