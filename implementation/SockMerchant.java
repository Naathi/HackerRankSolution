package implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		int totalPairs = 0;
		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        
        //checking every element of the inputArray
         
        for (int i : ar) 
        {
            if(elementCountMap.containsKey(i))
            {
                //If element is present in elementCountMap, incrementing it's count by 1
                 
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                //If element is not present in elementCountMap, 
                //adding this element to elementCountMap with 1 as it's value
                 
                elementCountMap.put(i, 1);
            }
        }
        for(Entry<Integer, Integer> i:elementCountMap.entrySet())
        {
        	totalPairs=totalPairs+(i.getValue())/2;
        }
       System.out.println(elementCountMap);
		return totalPairs;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		Arrays.sort(ar);
		int result = sockMerchant(n, ar);
		System.out.println(result);
		in.close();
	}
}
