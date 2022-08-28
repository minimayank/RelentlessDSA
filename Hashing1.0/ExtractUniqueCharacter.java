import java.util.HashMap;
import java.util.Set;
import java.util.LinkedHashMap;

public class Solution {

	public static String uniqueChar(String str){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		  mein Phodega!!
        */
         HashMap<Character,Boolean>map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                continue;
            }
            else{
                map.put(str.charAt(i),true);
            }
        }    
            Set<Character>ans=map.keySet();
        String s="";    
        for(Character c:ans){
               s+=c;
            }
            
            return s;
        
	}
}
