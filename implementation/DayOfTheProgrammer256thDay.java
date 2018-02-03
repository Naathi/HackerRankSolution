package implementation;
import java.util.Scanner;

public class DayOfTheProgrammer256thDay {

    static String solve(int year){
        String month="09";
        int tempDay=256;
        int day=0;
        int julianDay=0;
        int gregorianDay=0;
        int specialDay=0;
        if(year>=1700&&year<=1900)
        {
        	//System.out.println(year);
	        if((year % 4 == 0))
	        {
	            julianDay=tempDay-244;
	            day=julianDay;
	        }
	        else {
	        	julianDay=tempDay-243;
	        	day=julianDay;}
        }
        else if(year==1918)
        {
            specialDay=(tempDay-243)+13;
            day=specialDay;
        }
        else if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			gregorianDay=tempDay-244;
            day=gregorianDay;
		}
        
        else
        	day=tempDay-243;
		return day+"."+month+"."+year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
        in.close();
    }
}
