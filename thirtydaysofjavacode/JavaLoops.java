package thirtydaysofjavacode;
import java.util.Scanner;

public class JavaLoops {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(N+" x "+i+" = "+N*i);
        }
        s.close();
    }
}