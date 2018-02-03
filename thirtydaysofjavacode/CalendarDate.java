package thirtydaysofjavacode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class CalendarDate {
    public static void getDay(String day, String month, String year) {
        Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			cal.setTime(sdf.parse(day+"/"+month+"/"+year)); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int dayOfTheWeek=cal.get(Calendar.DAY_OF_WEEK);;
		System.out.println(dayOfTheWeek);
		/*if(dayOfTheWeek==2)
		{
			System.out.println("MONDAY");
		}
		else if(dayOfTheWeek==3)
		{
			System.out.println("TUESDAY");
		}
		else if(dayOfTheWeek==4)
		{
			System.out.println("WEDNESDAY");
		}
		else if(dayOfTheWeek==5)
		{
			System.out.println("THURSDAY");
		}
		else if(dayOfTheWeek==6)
		{
			System.out.println("FRIDAY");
		}
		else if(dayOfTheWeek==1)
		{
			System.out.println("SUNDAY");
		}
		else
			System.out.println("SATURDAY");*/
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
       getDay(day, month, year);
       in.close();
    }
}
