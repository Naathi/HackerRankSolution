package implementation;
import java.util.Scanner;

public class DivisableSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int numberOfDivisablePairs=0;
        int tempSum=0;
        int p;
        int j=0;
        int everySecondIterationTemp=0;
        for(int i=0;i<ar.length;i++)
        {
        	
        	j++;
        	for(p=j;p<ar.length;p++)
        	{
        		tempSum=ar[i];
        		everySecondIterationTemp++;
        		tempSum=tempSum+ar[p];
        		if(tempSum%k==0)
        		{
        			numberOfDivisablePairs++;
        		}
        		//System.out.print(" sum :"+tempSum+" ");
        		if(everySecondIterationTemp==1)
        		{
        			tempSum=0;
        			everySecondIterationTemp=0;
        		}
        		
        	}
        	//System.out.println();
        	p=j;
        	//System.out.print("P: "+p);
        }
        //System.out.println();
        return numberOfDivisablePairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
        in.close();
    }
}
