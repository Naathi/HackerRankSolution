package warmup;

import java.util.Scanner;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        int firstDiagonalSum=0;
        int secondDiagonalSum=0;
        int diagonalDifference=0;
        for(int i=0;i<a.length;i++)
        {
            firstDiagonalSum=firstDiagonalSum+a[i][i];
        }
        for (int i = 0, j = 1; i < a.length && j <= a.length; i++, j++) { 
			secondDiagonalSum=secondDiagonalSum+a[i][a.length - j];
		}
        if(secondDiagonalSum>firstDiagonalSum)
            diagonalDifference=secondDiagonalSum-firstDiagonalSum;
        else
            diagonalDifference=firstDiagonalSum-secondDiagonalSum;
            return diagonalDifference;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        System.out.println("1st Diagonal :");
        for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i][i]+" ");
		}
        System.out.println();
        System.out.println("2nd Diagonal :");
		for (int i = 0, j = 1; i < a.length && j <= a.length; i++, j++) {
			System.out.print(a[i][a.length - j]+" ");
		}
		System.out.println();
        int result = diagonalDifference(a);
        System.out.println("Diagonal Difference :"+result);
        in.close();
    }
}
