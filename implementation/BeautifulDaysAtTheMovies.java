package implementation;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    static int beautifulDays(StringBuffer sb1, StringBuffer sb2, int k) {
        int beautifulMovies=0;
       for(int l=i;l<=j;l++)
       {
    	   int rev=0;
    	   int p=0;
    	   System.out.println(l);
    	   for(int m=l;;)
    	   {
    		   p = m % 10;
                rev= rev * 10 + p;
               m = m / 10;
    		   System.out.println(rev);
    	   }
       }
        return beautifulMovies;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb1=new StringBuffer();
        sb1.append(in.next());
        StringBuffer sb2=new StringBuffer();
        sb2.append(in.next());
        int k = in.nextInt();
        //System.out.println("sb1: "+sb1+" sb2: "+sb2);
        int result = beautifulDays(sb1, sb2, k);
        System.out.println(result);

        in.close();
    }
}
