package implementation;
import java.util.Scanner;

public class NonDivisiableSubSet {

  /*  static int nonDivisibleSubset(int k, int[] arr) {
        int nonDivisableNumber=0;
        int count=1;
        int m;
        for(int i=0;i<arr.length;i++)
        {
        	
        	for(m=count;m<arr.length;m++)
        	{
        		if((arr[i]+arr[m])%k==0)
        		{
        			nonDivisableNumber++;
        		}
        	}
        	count++;
        	if(count>arr.length)
        		break;
        	System.out.println(count);
        }
        return nonDivisableNumber;
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = nonDivisibleSubset(k, arr);
        System.out.println(result);
        in.close();
    }*/
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();int k = sc.nextInt();
	        int [] arr = new int[k];
	        
	        for(int i=0;i<n;i++){
	            arr[sc.nextInt()%k]++;
	        }
	        int result=0;
	        if(k%2==0)result++;  // it will not have any conjugate pair
	        result=result+Math.min(arr[0],1);//If no number wholly divisible dont add it to pair else add once
	        for(int j=1;j<=k/2;j++) if(j!=k-j)result+=Math.max(arr[j],arr[k-j]);
	        System.out.println(result);
	        sc.close();
	     }
	}
