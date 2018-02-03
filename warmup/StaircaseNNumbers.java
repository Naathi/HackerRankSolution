package warmup;
import java.util.Scanner;

public class StaircaseNNumbers {

    static void staircase(int n) {
        	for (int j = 1; j <= n; j++) {
			for (int k = n - j; k >0; k--) {
				System.out.print(" ");
			}
			for (int k = j; k >0; k--) {
				System.out.print("#");
			}
			System.out.println();
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
