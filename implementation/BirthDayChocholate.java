package implementation;

import java.util.Scanner;

public class BirthDayChocholate {

    static int solve(int n, int[] s, int d, int m){
        int consecutiveRowSum=0;
        int temp=0;
        int k=0;
        System.out.println("K: ");
        for(int i=0;i<s.length;i++)
        {
        	System.out.print("K: "+k);
            for(int j=0;j<m;j++)
            {
                temp=temp+s[k];
                    k++;
                if(k==s.length)
                    break;
            }
            if(temp==d)
            {
                consecutiveRowSum++;
            }
            //System.out.println("K:K: "+k);
            //System.out.println("temp: "+temp);
            temp=0;
            k=k-(m-1);
        }
        return consecutiveRowSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
        in.close();
    }
}
