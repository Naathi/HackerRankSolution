package implementation;
import java.util.Scanner;

public class CircularArrayRotation {

    static int[] circularArrayRotation(int[] a, int[] m,int k,int q) {
        int[] elementsAfterRotation=new int[m.length];
        int[] elementsSpecifiedIndex=new int[k];
        for(int p=0;p<k;p++)
        {
	          for(int i = 0; i < a.length; i++) {
	            if(k > i) 
	                elementsAfterRotation[a.length - k + i] = a[i];
	            else
	                elementsAfterRotation[i - k] = a[i];
	        }
        }
          int j=0;
          for(int i=0;i<q;i++,j++)
          {
        	  if(j==q)
        		  break;
        	  if(m.length==i)
        		  elementsSpecifiedIndex[j]=elementsAfterRotation[i];
          }
        return elementsAfterRotation;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
        }
        int[] result = circularArrayRotation(a, m,k,q);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


        in.close();
    }
}
