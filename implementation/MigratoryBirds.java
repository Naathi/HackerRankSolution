package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirds {

	static int migratoryBirds(int n, int[] ar) {
		int moreMigratoryBird = 0;
		int type1Count = 0;
		int type2Count = 0;
		int type3Count = 0;
		int type4Count = 0;
		int type5Count = 0;
		int[] typeCountsArray = new int[5];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 1)
				typeCountsArray[0] = ++type1Count;
			if (ar[i] == 2)
				typeCountsArray[1] = ++type2Count;
			if (ar[i] == 3)
				typeCountsArray[2] = ++type3Count;
			if (ar[i] == 4)
				typeCountsArray[3] = ++type4Count;
			if (ar[i] == 5)
				typeCountsArray[4] = ++type5Count;
		}
		/*
		 * for(int i:typeCountsArray) System.out.println(i);
		 */
		if (typeCountsArray[0] > typeCountsArray[1]) {
			if (typeCountsArray[0] > typeCountsArray[2]) {
				if (typeCountsArray[0] > typeCountsArray[3]) {
					if (typeCountsArray[0] > typeCountsArray[4]) {
						moreMigratoryBird = 1;
					}
				}
			}
		}
		if (typeCountsArray[1] > typeCountsArray[0]) {
			if (typeCountsArray[1] > typeCountsArray[2]) {
				if (typeCountsArray[1] > typeCountsArray[3]) {
					if (typeCountsArray[1] > typeCountsArray[4]) {
						moreMigratoryBird = 2;
					}
				}
			}
		}
		if (typeCountsArray[2] > typeCountsArray[0]) {
			if (typeCountsArray[2] > typeCountsArray[1]) {
				if (typeCountsArray[2] > typeCountsArray[3]) {
					if (typeCountsArray[2] > typeCountsArray[4]) {
						moreMigratoryBird = 3;
					}
				}
			}
		}
		if (typeCountsArray[3] > typeCountsArray[0]) {
			if (typeCountsArray[3] > typeCountsArray[1]) {
				if (typeCountsArray[3] > typeCountsArray[2]) {
					if (typeCountsArray[3] > typeCountsArray[4]) {
						moreMigratoryBird = 4;
					}
				}
			}
		}
		if (typeCountsArray[4] > typeCountsArray[0]) {
			if (typeCountsArray[4] > typeCountsArray[1]) {
				if (typeCountsArray[4] > typeCountsArray[3]) {
					if (typeCountsArray[4] > typeCountsArray[2]) {
						moreMigratoryBird = 5;
					}
				}
			}
		}
		else
			moreMigratoryBird=3;
			
		return moreMigratoryBird;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		Arrays.sort(ar);
		int result = migratoryBirds(n, ar);
		System.out.println(result);
		in.close();
	}
}
