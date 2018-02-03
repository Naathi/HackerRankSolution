package implementation;
import java.util.Scanner;

public class AnnaBrainBonAppetit {

    static int bonAppetit(int n, int k, long brianCharged, int[] ar) {
       long brianActual=0; 
       int brianReturnToAnna=0;
        for(int i=0;i<n;i++)
        {
            if(ar[k]==ar[i])
                continue;
            brianActual=brianActual+ar[i];
        }
        if((brianActual/2)==brianActual)
        {
           brianReturnToAnna=0;
        }
        else if(brianCharged>(brianActual/2))
        { 
            brianReturnToAnna=(int) (brianCharged-(brianActual/2));
        }
        else
        	brianReturnToAnna=(int) ((brianActual/2)-brianCharged);
         return brianReturnToAnna;   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        long b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result==0)
            System.out.println("Bon Appetit");
        else
            System.out.println(result);
        in.close();
    }
}
	