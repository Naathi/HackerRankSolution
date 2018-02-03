package thirtydaysofjavacode;
import java.util.Scanner;

public class Day1DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int inputInt=scan.nextInt();
        double inputDouble=scan.nextDouble();
        scan.nextLine();
        String inputString=scan.nextLine(); 
        System.out.println(inputInt+i);
        System.out.println(inputDouble+d);
        System.out.println(s+inputString);
        
        scan.close();
    }
}