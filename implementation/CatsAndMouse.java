package implementation;
import java.util.Scanner;

public class CatsAndMouse {

    static String[] catAndMouse(int q,int x, int y, int z) {
        String[] catsAndMouses=new String[1];
        int mouseTempX=z-x;
        int mouseTempY=z-y;
	        if((mouseTempX>0&&mouseTempY>0)&&(mouseTempX<mouseTempY))
	        {
	        	catsAndMouses[0]="Cat A";
	        	 
	        }
	        else if((mouseTempX<0&&mouseTempY>0)&&(mouseTempX<mouseTempY))
	        {
	        	catsAndMouses[0]="Cat A";
	        	 
	        }
	        else if((mouseTempX<0&&mouseTempY<0)&&(mouseTempX>mouseTempY))
	        {
	        	catsAndMouses[0]="Cat A";
	        	 
	        }
	        if((mouseTempX>0&&mouseTempY>0)&&(mouseTempX>mouseTempY))
	        {
	        	catsAndMouses[0]="Cat B";
	        	 
	        }

	        else if((mouseTempX<0&&mouseTempY<0)&&(mouseTempX<mouseTempY))
	        {
	        	catsAndMouses[0]="Cat B";
	        	 
	        }
	        else if((mouseTempX>0&&mouseTempY<0)&&(mouseTempX>mouseTempY))
	        {
	        	catsAndMouses[0]="Cat B";
	        	 
	        }
	        if((mouseTempX<0&&mouseTempY<0)&&(mouseTempX==mouseTempY))
	        {
	        	catsAndMouses[0]="Mouse C";
	        	 
	        }
	      
	        if((mouseTempX>0&&mouseTempY<0)&&(mouseTempX==1&&mouseTempY==-1||mouseTempX==2&&mouseTempY==-2||mouseTempX==3&&mouseTempY==-3||mouseTempX==4&&mouseTempY==-4||mouseTempX==4&&mouseTempY==-4||mouseTempX==5&&mouseTempY==-5||mouseTempX==6&&mouseTempY==-6))
	        {
	        	catsAndMouses[0]="Mouse C";
	        	 
	        }
	        if((mouseTempX<0&&mouseTempY>0)&&(mouseTempX==-1&&mouseTempY==1||mouseTempX==-2&&mouseTempY==2||mouseTempX==-3&&mouseTempY==3||mouseTempX==-4&&mouseTempY==4||mouseTempX==-5&&mouseTempY==5||mouseTempX==-6&&mouseTempY==6))
	        {
	        	catsAndMouses[0]="Mouse C";

	        }
		return catsAndMouses;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            String[] result = catAndMouse(q,x, y, z);
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
        in.close();
    }
}
