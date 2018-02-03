package implementation;
import java.util.Scanner;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c, int k) {
        int remainingEnergy=100;
        for(int i=k;i<c.length;i=i+k)
        {
            if(c[i]==0)
                remainingEnergy=remainingEnergy-1;
            else if(c[i]==1)
                remainingEnergy=remainingEnergy-1-2;
//            System.out.println("c["+i+"]="+c[i]);
        }
        if(c[0]==1)
        {
        	remainingEnergy=remainingEnergy-1-2;
        }
        else
        	remainingEnergy=remainingEnergy-1;
        return remainingEnergy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
