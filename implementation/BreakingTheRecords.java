package implementation;
import java.util.Scanner;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] score) {
        int[] numberOfTimesRecordBreaks=new int[2];
        int highScoreRecord=0;
        int lowerScoreRecord=0;
        int tempHigh=score[0];
        int tempLow=score[0];
        for(int i=1;i<score.length;i++)
        {
            if(tempHigh<score[i])
            {
            	tempHigh=score[i];
            	//System.out.println("temp high: "+tempHigh);
               numberOfTimesRecordBreaks[0]= ++highScoreRecord;
            }
            if(tempLow>score[i]) {
               tempLow=score[i];
               //System.out.println("temp low: "+tempLow);
            	numberOfTimesRecordBreaks[1]=++lowerScoreRecord;
            }
            
        }
        //tempHigh=score[0];
        return numberOfTimesRecordBreaks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }


        in.close();
    }
}
