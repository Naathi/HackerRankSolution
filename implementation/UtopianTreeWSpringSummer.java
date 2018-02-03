package implementation;
import java.util.Scanner;

public class UtopianTreeWSpringSummer {

    static int utopianTree(int n) {
        int heightOfTree=1;
        for(int i=1;i<=n;i++)
        {
        	if(i%2==0)
        	{
        		heightOfTree=heightOfTree+1;
        	}
        	else if(i%2==1)
        	{
        		heightOfTree=heightOfTree*2;
        	}
        }
        return heightOfTree;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
