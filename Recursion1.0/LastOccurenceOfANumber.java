
public class Solution {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int end=input.length-1;
        return lastIndexHelper(input,x,end);
	}
    public static int lastIndexHelper(int[] input,int x,int end){
        if(end<0){
            return -1;
        }
        else{
            if(input[end]==x){
                return end;
            }
            else{
                return lastIndexHelper(input,x,end-1);
            }
        }
    }
	
}
