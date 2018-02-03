package implementation;
import java.util.Scanner;

public class KangarooMeetUp {

    static String kangaroo(int x1, int v1, int x2, int v2) {
    	int[] firstKangarooDistance=new int[10000];
    	int[] secondKangarooDistance=new int[10000];
    	int[] k1Count=new int[10000];
    	int tempCount=0;
    	int[] k2Count=new int[10000];
    	String result="";
    	for(int i=0;i<firstKangarooDistance.length;i++)
    	{
    		//System.out.println(firstKangarooDistance[i]);
    		firstKangarooDistance[i]=x1;
    		x1=x1+v1;
    		k1Count[i]=tempCount++;
    		//System.out.println(k1Count[i]);
    	}
    	tempCount=0;
    	for(int i=0;i<secondKangarooDistance.length;i++)
    	{
    		secondKangarooDistance[i]=x2;
    		x2=x2+v2;
    		//System.out.println(secondKangarooDistance[i]);
    		k2Count[i]=tempCount++;
    		//System.out.println(k2Count[i]);
    	}
    	for(int i=0;i<10000;i++)
    	{
    		if((firstKangarooDistance[i]==secondKangarooDistance[i])&&(k1Count[i]==k2Count[i]))
    		{
    			result="YES";
    			break;
    		}
    		//System.out.println(firstKangarooDistance[i]+" "+secondKangarooDistance[i]+" "+k1Count[i]+ " "+k2Count[i]);
    	}
    	if(result!="YES")
    		result="NO";
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
        in.close();
    }
}
