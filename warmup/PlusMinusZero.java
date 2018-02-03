package warmup;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class PlusMinusZero {

    static void plusMinus(int[] arr) {
       double positiveIteration=0;
       double negativeIteration=0;
       double zeroIteration=0;
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i]>0)
    	   {
    		   positiveIteration++;
    	   }
    	   if(arr[i]==0)
    	   {
    		   zeroIteration++;
    	   }
    	   if(arr[i]<0)
    	   {
    		   negativeIteration++;
    	   }
       }
       DecimalFormat df=new DecimalFormat("#0.000000");
       System.out.println(df.format(positiveIteration/arr.length));
       System.out.println(df.format(negativeIteration/arr.length));
       System.out.println(df.format(zeroIteration/arr.length));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
      Arrays.sort(arr);
        plusMinus(arr);
        in.close();
    }
}
