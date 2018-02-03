package implementation;
import java.util.Scanner;

public class DrawingBook {

    static int solve(int n, int p){
        int count=0;
        int forwardOpening=0;
        int backwardOpening=0;
        for(int i=2;i<=p;i+=2)
        {
        	forwardOpening++;
        }
        for(int i=n;i>p;i-=2)
        {
        		backwardOpening++;
        		
        }
//        System.out.println(forwardOpening);
        if(n%2==0)
        	backwardOpening=backwardOpening;
        else if(n==p)
        	count=0;
        else if(n%2==1&&p%2==0)
        	backwardOpening=backwardOpening-1;
        else if(n%2==1&&p%2==1)
        	backwardOpening=backwardOpening;
        
        if(forwardOpening<backwardOpening)
        	count=forwardOpening;
        else
        	count=backwardOpening;
        
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        in.close();
        System.out.println(result);
    }
}
