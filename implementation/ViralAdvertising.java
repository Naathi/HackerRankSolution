package implementation;
import java.util.Scanner;

public class ViralAdvertising {

    static int viralAdvertising(int n) {
        int advertisingReceived=0;
        int initial=5;
        int temp=initial;
        for(int i=0;i<n;i++)
        {
            temp=(int)Math.floor(temp/2);
            advertisingReceived+=temp;
            temp*=3;
        }
        return advertisingReceived;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
