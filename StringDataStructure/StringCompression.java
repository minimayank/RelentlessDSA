public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
        
        String ans="";
        int j=0;
         for(int i=0;i<str.length();){
             char curr=str.charAt(i);   
             ans+=str.charAt(i);
                int count=1;
            for(j=i+1;j<str.length();j++){
                if(str.charAt(j)==curr){
                    count++;
                }
                else{
                    break;
                }
            }
             if(count>1){
                 ans+=count;
             }
             i=j;
         }
        return ans;
	}

}
