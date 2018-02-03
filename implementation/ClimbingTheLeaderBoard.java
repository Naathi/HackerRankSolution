package implementation;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ClimbingTheLeaderBoard {

	static int[] climbingLeaderboard(TreeSet<Integer> scores, int[] alice) {
		int[] aliceRankings = new int[alice.length];
		int[] allRankings = new int[scores.size()];
		Iterator<Integer> itr=scores.iterator();
		int i=0;
		while(itr.hasNext())
		{
			if(i==scores.size())
				break;
			allRankings[i]=itr.next();
			i++;
		}
		int temp=1;
		for(int j=0;j<alice.length;j++)
		{
			for(int k=0;k<allRankings.length;k++)
			{
				if((allRankings[k]>alice[j]))
				{
					aliceRankings[j]=++temp;
				}
				else if(allRankings[k]<alice[j])
					aliceRankings[j]=1;
				else if(allRankings[k]==alice[j])
					aliceRankings[j]=temp;
			}
			temp=1;
		}
		 return aliceRankings;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];
		TreeSet<Integer> list=new TreeSet<Integer>();
		for (int scores_i = 0; scores_i < n; scores_i++) {
			scores[scores_i] = in.nextInt();
			list.add(scores[scores_i]);
		}
		/*Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}*/
		System.out.println();
		int m = in.nextInt();
		int[] alice = new int[m];
		for (int alice_i = 0; alice_i < m; alice_i++) {
			alice[alice_i] = in.nextInt();
		}
		 int[] result = climbingLeaderboard(list, alice);
		 for (int i = 0; i < result.length; i++) {
		 System.out.println(result[i]);
		 }

		in.close();
	}
}
