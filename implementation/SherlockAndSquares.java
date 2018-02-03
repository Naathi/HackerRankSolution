package implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	static int squares(int a, int b) {
//		int numberOfSquareRoots = 0;
//		System.out.println(numberOfSquareRoots);
//		int i=a;
//		while(i<=b){
//			long squareRoot = (long) Math.sqrt(i);
//			if (squareRoot * squareRoot == i) {
//
//				numberOfSquareRoots++;
//				i++;
//			}
//			System.out.println(squareRoot);
//		}
//		return numberOfSquareRoots;
		return ((int)(Math.floor(Math.sqrt(a))-Math.ceil(Math.sqrt(a))+1));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println("a:"+Math.ceil(Math.sqrt(a))+ " b:"+Math.floor(Math.sqrt(b)));
			int result = squares(a, b);
			System.out.println(result);
		}
		in.close();
	}
}
