package implementation;

import java.util.Scanner;

public class AppleOrangeOnHouse {

    static int[] appleAndOrange(int leftHouseSpace, int rightHouseSpace, int appleTree, int ornageTree, int[] appleFallDistances, int[] orangeFallDistances) {
		int orangeCount=0;
		int appleCount=0;
		int[] result=new int[2];
//		System.out.println("Spot of Apple Tree :"+appleTree);
		/*System.out.println(leftHouseSpace);
		System.out.println(rightHouseSpace);*/
	/*	int c=0;*/
    	for(int i=0;i<appleFallDistances.length;i++)
		{
			int temp=appleTree+appleFallDistances[i];
			/*System.out.println("Aplle Fall Distance :"+appleFallDistances[i]);
			System.out.println("Temp :"+temp);*/
			if(leftHouseSpace<=temp&&temp<=rightHouseSpace)
			{
					result[0]=++appleCount;
					/*c++;*/
					
			}
		}
    /*	System.out.println(c);*/
    	for(int i=0;i<orangeFallDistances.length;i++)
		{
			int temp=ornageTree+orangeFallDistances[i];
			if(leftHouseSpace<=temp&&temp<=rightHouseSpace)
			{
				result[1]=++orangeCount;
			}
		}
    	return result;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        
        
        
        
        
        
        
        
        
        
        
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(s, t, a, b, apple, orange);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        in.close();
    }
}
