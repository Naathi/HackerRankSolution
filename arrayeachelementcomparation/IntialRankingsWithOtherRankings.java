package arrayeachelementcomparation;

import java.util.Arrays;
import java.util.Scanner;

public class IntialRankingsWithOtherRankings {

	static void climbingLeaderboard(int[] scores, int[] alice) {
		int[] aliceRankings = new int[alice.length];
		int[] allRankings = new int[scores.length + alice.length];
		int[] allRankingsScores = new int[scores.length + alice.length];
		for (int i = 0; i < scores.length; i++) {
			allRankingsScores[i] = scores[i];
		}
		int p = 0;
		for (int i = scores.length; i < allRankingsScores.length; i++) {
			if (p == alice.length)
				break;
			allRankingsScores[i] = alice[p];
			p++;
		}
		Arrays.sort(allRankingsScores);
		for (int i : allRankingsScores) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] allRankingsScoresDesending = new int[scores.length + alice.length];
		int t = 0;
		for (int i = allRankingsScores.length - 1; i >= 0; i--) {
			if (t == allRankings.length)
				break;
			allRankingsScoresDesending[t] = allRankingsScores[i];
			t++;
		}
		for (int i : allRankingsScoresDesending) {
			System.out.print(i + " ");
		}
		int temp = 1;
		allRankings[0] = temp;
		int j = 1;
		for (int i = 0; i < allRankingsScores.length; i++) {
			if (j == allRankings.length)
				break;
			if (allRankingsScoresDesending[i] > allRankingsScoresDesending[j]) {
				allRankings[j] = ++temp;
			} else if (allRankingsScoresDesending[i] == allRankingsScoresDesending[j]) {
				allRankings[j] = temp;
			}
			j++;
		}

		System.out.println();
		for (int i : allRankings) {
			System.out.print(i + " ");
		}
		System.out.println();
		// return aliceRankings;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];
		for (int scores_i = 0; scores_i < n; scores_i++) {
			scores[scores_i] = in.nextInt();
		}
		// Arrays.sort(scores);
		int m = in.nextInt();
		int[] alice = new int[m];
		for (int alice_i = 0; alice_i < m; alice_i++) {
			alice[alice_i] = in.nextInt();
		}
		// Arrays.sort(alice);
		climbingLeaderboard(scores, alice);
		// int[] result = climbingLeaderboard(scores, alice);
		// for (int i = 0; i < result.length; i++) {
		// System.out.println(result[i]);
		// }

		in.close();
	}
}
