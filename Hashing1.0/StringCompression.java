import java.util.*;
public class Solution {
	public static String getCompressedString(String str) {
		// Write your code here.
        HashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
                continue;
            }
            map.put(str.charAt(i),1);
        }
        String s="";
        Set<Character>set=map.keySet();
        for(Character c:set){
            if(map.get(c)==1){
                s=s+c;
                continue;
            }
            s=s+c+map.get(c);
            
        }
        return s;
	}

}
