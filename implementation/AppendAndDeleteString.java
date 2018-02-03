package implementation;

import java.util.Scanner;

public class AppendAndDeleteString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		int i;
		for (i = 0; i < s.length() && i < t.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				break;
			}
		}

		int sStringDiff = s.length() - i;
		int tStringDiff = t.length() - i;

		int difference = k - sStringDiff - tStringDiff;
		if (difference == 0) {
			System.out.println("Yes");
		} else if (difference < 0) {
			System.out.println("No");
		} else {
			if (difference % 2 == 0) {
				System.out.println("Yes");
			} else {
				if (difference >= (2 * i)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}

			}
			in.close();
		}
	}
}