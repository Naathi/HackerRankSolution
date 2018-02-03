package implementation;
import java.util.ArrayList;
import java.util.Scanner;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
       int totalDivisableFactors=0;
       ArrayList<Integer> list=new ArrayList<Integer>();
       int aCount=0;
       int k=1;
       
       for(int i=0;i<=100;i++)
       {
    	   //System.out.println("K: "+k);
    	   for(int j=0;j<a.length;j++)
    	   {
    		   //System.out.print("a[j]: "+a[j]);
    		   if((k%a[j]==0))
    		   {
    			   aCount++;
    		   }
    		   if(aCount==a.length)
    		   {
    			   list.add(k);
    		   }
    		  //System.out.print("aCount: "+aCount);
    	   }
    	   aCount=0;
    	   k++;
    	   if(k==101)
    		   break;
       }
      /* Iterator<Integer> iterator=list.iterator();
       System.out.println("List: ");
       while(iterator.hasNext())
       {
    	   System.out.print(iterator.next()+" ");
       }*/
       int bCount=0;
     for(int i=0;i<list.size();i++)
       {
    	   for(int j=0;j<b.length;j++) 
		   {
    		   //System.out.print("b[j]: "+b[j]);
			   if((b[j]%list.get(i)==0))
			   {
				   bCount++;
			   }
			   if(bCount==b.length)
			   {
				   totalDivisableFactors++;
			   }
		   }
    	   bCount=0;
       }
       //System.out.println(totalDivisableFactors);
       return totalDivisableFactors;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
       int total= getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
