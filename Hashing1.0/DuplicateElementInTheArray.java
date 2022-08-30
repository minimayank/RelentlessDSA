import java.util.*;
public class Solution {

	public static int findDuplicate(int[] arr) {
	   HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
               return arr[i];
           }
           else{
               map.put(arr[i],1);
           }
       }
        return -1;
	}
}
