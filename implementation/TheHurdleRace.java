package implementation;
import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
        int minimumJumps=0;
        if(height[height.length-1]>k)
        {
        	minimumJumps=height[height.length-1]-k;
        }
        else if(height[height.length-1]<k)
        {
        	minimumJumps=0;
        }
        return minimumJumps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
