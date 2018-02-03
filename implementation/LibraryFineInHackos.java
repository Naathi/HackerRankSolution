package implementation;

import java.util.Scanner;

public class LibraryFineInHackos {

	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		int fineInHackos = 0;
		if (y1 <= y2) {
			if (y1 == y2) {
				if (m1 <= m2) {
					if (d1 <= d2) {
						
						fineInHackos = 0;
					} else {
						if(m1<m2)
							fineInHackos=0;
						else
							fineInHackos = 15 * (d1 - d2);
					}
				} else {
					fineInHackos = 500 * (m1 - m2);
				}

			} else
				fineInHackos = 0;
		} else
			fineInHackos = 10000;
		return fineInHackos;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		int result = libraryFine(d1, m1, y1, d2, m2, y2);
		System.out.println(result);
		in.close();
	}
}
