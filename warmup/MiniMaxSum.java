package warmup;
import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long minimumSum=0;
        long maximumSum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            minimumSum=minimumSum+arr[i];
        }
         for(int i=1;i<arr.length;i++)
        {
            maximumSum=maximumSum+arr[i];
        }
        System.out.print(minimumSum+" "+maximumSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        miniMaxSum(arr);
        in.close();
    }
}
