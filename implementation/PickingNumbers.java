package implementation;
import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

    static int pickingNumbers(int[] a) {
        int numberLessThenOne=0;
        int j=1;
        int m=0;
        for(int i=m;i<a.length;i++)
        {
        	
        	for(int k=j;k<a.length;k++)
        	{
        		if(a[k]-a[i]<=1)
        		{
        			numberLessThenOne++;
        		}
        	}
        	System.out.println("m: "+m);
        	System.out.println("j: "+j);
        	j++;
        	m++;
        }
        return numberLessThenOne;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
