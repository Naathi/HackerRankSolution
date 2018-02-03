package arrayeachelementcomparation;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEachElementComparation {

    static int pickingNumbers(int[] a) {
        int numberLessThenOne=0;
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
        	for(int k=i;k<a.length;k++)
        	{
        		if(a[k]-a[i]<=1)
        		{
        			temp++;
        		}
        	}
        	if(numberLessThenOne<temp)
        		numberLessThenOne=temp;
        	temp=0;
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
        /*for(int a_i = 0; a_i < n; a_i++){
            System.out.print(a[a_i]+" ");
        }*/
        System.out.println();
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}


