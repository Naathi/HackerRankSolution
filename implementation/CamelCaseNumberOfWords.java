package implementation;

import java.util.Scanner;

public class CamelCaseNumberOfWords {

	static int camelcase(String s) {
		int numberOfWords = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C' || s.charAt(i) == 'D'
					|| s.charAt(i) == 'E' || s.charAt(i) == 'F' || s.charAt(i) == 'G' || s.charAt(i) == 'H'
					|| s.charAt(i) == 'I' || s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L'
					|| s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O' || s.charAt(i) == 'P'
					|| s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S' || s.charAt(i) == 'T'
					|| s.charAt(i) == 'U' || s.charAt(i) == 'V' || s.charAt(i) == 'W' || s.charAt(i) == 'X'
					|| s.charAt(i) == 'Y' || s.charAt(i) == 'Z') {
				numberOfWords++;
			}
		}
		return numberOfWords + 1; // because one word starts with all lower case letters
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int result = camelcase(s);
		System.out.println(result);
		in.close();
	}
}
