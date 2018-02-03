package implementation;
import java.util.Scanner;

public class ArrayLeftRotation {

   
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            if(n > i) 
                arr[size - n + i] = in.nextInt();
            else
                arr[i - n] = in.nextInt();
        }
        
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        in.close();
    }
}
