import java.util.*;
public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
       HashMap<Integer,Integer>map=new LinkedHashMap<>();
       for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
               int value=map.get(arr[i]);
               map.put(arr[i],value+1);
               continue;// ###
           }
           map.put(arr[i],1);
       } 
        //System.out.print(map);
       Set<Integer>set=map.keySet();
        
      for(Integer i:set){
          if(map.get(i)==1){
              return i;
          }
      }
        return -1;
        
    }
}
