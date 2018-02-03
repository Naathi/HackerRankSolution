package warmup;
import java.util.Scanner;

public class CompareTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] a=new int[2];
        int alicePoint=0;
        int bobPoint=0;
        if(a0>b0)
        {
            a[0]=++alicePoint;
        }
        if(a1>b1)
        {
        	a[0]=++alicePoint;
        }
        if(a2>b2)
        {
        	a[0]=++alicePoint;
        }
        if(a2<b2)
        {
            a[1]=++bobPoint;
        }
        if(a1<b1)
        {
        	a[1]=++bobPoint;
        }
        if(a0<b0)
        {
        	a[1]=++bobPoint;
        }
        if(a1==b1||a0==b0||a2==b2)
        {
            a[0]=alicePoint=0+alicePoint;
            a[1]=bobPoint=0+bobPoint;
        }
    	return a; 
     /*   for(int i:a)
        	System.out.println(i);
           
    }*/
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
      int[] result=solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < 2; i++) {
            System.out.print(result[i]+" ");
        }
        
        in.close();
    }
}
