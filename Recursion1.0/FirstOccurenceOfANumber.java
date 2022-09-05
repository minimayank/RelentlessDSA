
public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int pos=0;
        return firstIndexHelper(input,x,pos);
		
	}
    public static int firstIndexHelper(int[] input,int x,int pos){
        if(pos<input.length){
            if(x==input[pos]){
                return pos;
            }
            else{
                return firstIndexHelper(input,x,pos+1);
            }
        }
        return -1;
    }
	
}
