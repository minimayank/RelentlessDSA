
public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        int k=0;
        //String temp="";
        for(int i=0;i<str.length();i++){
            String temp="";
            for(int j=k;j<str.length();j++){
                 temp+=str.charAt(j);
                 System.out.println(temp);
            }
            k++;
        }
	}

}
