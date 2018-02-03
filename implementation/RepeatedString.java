package implementation;
import java.util.Scanner;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long numberOfALetters=0;
        int temp=0;
        long remainderALetters=0;
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='a')
	            {
	                temp++;
	            }
	        }
//	        System.out.println("temp: "+temp);
	        long rem=n%s.length();
	        long l=n/s.length();
//	        System.out.println("remainder: "+rem);
	        for(int i=0;i<rem;i++)
	        {
	        	if(s.charAt(i)=='a')
	        		remainderALetters++;
	        }
//	        System.out.println("remainderALetters : "+remainderALetters);
        return temp*l+remainderALetters;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
