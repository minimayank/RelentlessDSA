import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                continue;
            }
            map.put(arr[i],1);
        }
        int freq=arr.length/2;
        Set<Integer>set=map.keySet();
        for(Integer i:set){
            if(map.get(i)>freq){
                return i;
            }
        }
        return -1;
	}
}
