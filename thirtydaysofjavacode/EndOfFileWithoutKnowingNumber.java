package thirtydaysofjavacode;

import java.util.Scanner;

public class EndOfFileWithoutKnowingNumber {
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   for(int i = 1; scan.hasNext()== true; i++){
		       System.out.println(i + " " + scan.nextLine());

//		// While loop System
//		public static void main(String[] args) {
//		   Scanner scan = new Scanner(System.in);
//		   int i = 0;
//		   while(scan.hasNext()){
//		       i++;
//		       System.out.println(i + " " + scan.nextLine());
//		   }
		}
		   scan.close();
	}
}
