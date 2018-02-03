package implementation;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CutTheSticksWithSmallerNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			int value = in.nextInt();
			list.add(value);
		}
		Collections.sort(list);
		//LinkedList<Integer> result = cutTheSticks(list);
		Iterator<Integer> iterator = list.iterator();
		for(Integer i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		LinkedList<Integer> cutSticksValues=new LinkedList<Integer>();
		int tempElement=list.get(0);
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.size()/2;j++)
			{
				if(list.get(j)==tempElement)
				{
					list.remove(j);
				}
			}
		}
//		for(int i=0;i<list.size();i++)
//		{
//			list.add(list.get(i)-tempElement);
//		}
		System.out.println("size :"+list.size());
//		for(Integer numb:list)
//		{
//			System.out.print(numb+" ");
//		}
		in.close();
	}
}
