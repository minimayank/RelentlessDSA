import java.util.*;
public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
	    */

           HashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
            int freq=1;

            for(int i=0;i<arr.length;i++){
                int key=arr[i];
                if(map.containsKey(key)){
                    int freq1=map.get(key)+1;
                    map.put(arr[i],freq1);
                    continue;
                }
                map.put(arr[i],freq);
            }
            Set<Integer>set=map.keySet();
            int max=Integer.MIN_VALUE;
            int maxFrequency=0;
           for(Integer i:set){
               if(map.get(i)>maxFrequency){
                   maxFrequency=map.get(i);
                   max=i;
               }
           }
           return max;
        } 
    } 
   
    

