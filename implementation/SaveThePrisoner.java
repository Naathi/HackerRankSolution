package implementation;
import java.util.Scanner;

public class SaveThePrisoner {

    static long saveThePrisoner(int prisoners, int sweets, int id){
    	long poisonSweetPrisonerID = (id + sweets - 1) % prisoners;
    	if(poisonSweetPrisonerID == 0)
    		poisonSweetPrisonerID = prisoners;
        return poisonSweetPrisonerID;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            long result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
        in.close();
    }
}
