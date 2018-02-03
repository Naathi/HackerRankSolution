package implementation;

import java.util.Scanner;

public class GradingStudents {

	static int[] solve(int[] grades) {
		int originalGrade = 0;
		int temp = 0;
		int gradeDifference = 0;
		int[] roundingGrade = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			int j = 0;
			temp=grades[i];
			while (j < 5) {
				if (temp % 5 == 0) {
					originalGrade = grades[i];
					gradeDifference = temp - originalGrade;
					/*System.out.println("Grade Diffrence "+gradeDifference);
					System.out.println("Temp "+temp);*/
					if (gradeDifference < 3) {
						roundingGrade[i] = temp;
					} else if (gradeDifference == 3) {
						roundingGrade[i] = originalGrade;
					}
				} else
					temp++;
				j++;
			}
			if (roundingGrade[i] < 38) {
				roundingGrade[i] = originalGrade;
			}
		}
		return roundingGrade;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		in.close();
	}
}
