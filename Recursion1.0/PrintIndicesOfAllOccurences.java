import java.util.*;
public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int start=0;
        return allIndexes(input,x,start);
	}
	public static int[] allIndexes(int[] input,int x,int start){
     
        if(start==input.length){
            return new int[0];
        }
        int[] smallAns=allIndexes(input,x,start+1);
        
        if(input[start]==x){
            int[] finalAns=new int[smallAns.length+1];
            finalAns[0]=start;
            for(int i=0;i<smallAns.length;i++){
                finalAns[i+1]=smallAns[i];
            }
            return finalAns;
        }
        else
        return smallAns;
        

    }
        
}
