import java.util.*;

public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for( int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                continue;
            }
            map.put(arr[i],1);
        }
        Set<Integer>set=map.keySet();
        for(Integer i:set){
            if(map.get(i)>1){
                return i;
            }
        }
        return -1;
	}
    
}
