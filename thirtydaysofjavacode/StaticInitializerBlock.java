package thirtydaysofjavacode;

import java.util.Scanner;

public class StaticInitializerBlock {
	static boolean flag;
	static int B, H;
	static {
		Scanner s = new Scanner(System.in);
		B = s.nextInt();
		H = s.nextInt();
		if (B > 0 && H > 0) {
			flag = true;
		} else
			flag = false;
		if (flag == false) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");

		}
		s.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}// end of main

}// end of class
