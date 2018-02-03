package implementation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DesignPDFViewer {

    static int designerPdfViewer(int[] heights, String word) {
        ArrayList<Integer> maxList=new ArrayList<Integer>();
        int pdfViewrArea=0;
        for(int i1=0;i1<word.length();i1++)
        {
        	if(word.charAt(i1)=='a')
        	{
        		maxList.add(heights[0]);
        	}
        	else if(word.charAt(i1)=='b')
        	{
        		maxList.add(heights[1]);
        	}
        	else if(word.charAt(i1)=='c')
        	{
        		maxList.add(heights[2]);
        	}
        	else if(word.charAt(i1)=='d')
        	{
        		maxList.add(heights[3]);
        	}
        	else if(word.charAt(i1)=='e')
        	{
        		maxList.add(heights[4]);
        	}
        	else if(word.charAt(i1)=='f')
        	{
        		maxList.add(heights[5]);
        	}
        	else if(word.charAt(i1)=='g')
        	{
        		maxList.add(heights[6]);
        	}
        	else if(word.charAt(i1)=='h')
        	{
        		maxList.add(heights[7]);
        	}
        	else if(word.charAt(i1)=='i')
        	{
        		maxList.add(heights[8]);
        	}
        	else if(word.charAt(i1)=='j')
        	{
        		maxList.add(heights[9]);
        	}
        	else if(word.charAt(i1)=='k')
        	{
        		maxList.add(heights[10]);
        	}
        	else if(word.charAt(i1)=='l')
        	{
        		maxList.add(heights[11]);
        	}  
        	else if(word.charAt(i1)=='m')
        	{
        		maxList.add(heights[12]);
        	}
        	else if(word.charAt(i1)=='n')
        	{
        		maxList.add(heights[13]);
        	}
        	else if(word.charAt(i1)=='o')
        	{
        		maxList.add(heights[14]);
        	}
        	else if(word.charAt(i1)=='p')
        	{
        		maxList.add(heights[15]);
        	}
        	else if(word.charAt(i1)=='q')
        	{
        		maxList.add(heights[16]);
        	}
        	else if(word.charAt(i1)=='r')
        	{
        		maxList.add(heights[17]);
        	}
        	else if(word.charAt(i1)=='s')
        	{
        		maxList.add(heights[18]);
        	}
        	else if(word.charAt(i1)=='t')
        	{
        		maxList.add(heights[19]);
        	}
        	else if(word.charAt(i1)=='u')
        	{
        		maxList.add(heights[20]);
        	}
        	else if(word.charAt(i1)=='v')
        	{
        		maxList.add(heights[21]);
        	}
        	else if(word.charAt(i1)=='w')
        	{
        		maxList.add(heights[22]);
        	}
        	else if(word.charAt(i1)=='x')
        	{
        		maxList.add(heights[23]);
        	}
        	else if(word.charAt(i1)=='y')
        	{
        		maxList.add(heights[24]);
        	}
        	else if(word.charAt(i1)=='z')
        	{
        		maxList.add(heights[25]);
        	}
        }
        Collections.sort(maxList);
       /* Iterator<Integer> iterator=maxList.iterator();
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next());
        }*/
//        System.out.println(word.length()*maxList.get(word.length()-1));
        pdfViewrArea=word.length()*maxList.get(word.length()-1);
        return pdfViewrArea;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
