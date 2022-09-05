import java.util.*;
public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
       HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<arr.length;i++)
         {
             if(map.containsKey(arr[i])){
                 map.put(arr[i],map.get(arr[i])+1);
                 continue;
             }
             map.put(arr[i],1);
         } 
        
        Set<Integer>set=map.keySet();
        for(Integer key: set){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
	}
}
