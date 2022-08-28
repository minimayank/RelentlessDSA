import java.util.*;
public class Solution {

	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        HashMap<Integer,Boolean>map=new HashMap<>();
        if(arr1.length>=arr2.length){
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                continue;
            }
            map.put(arr1[i],true);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                ans.add(arr2[i]);
            }
        }
        for(Integer i:ans){
            System.out.println(i);
        }
        }
        else{
            for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                continue;
            }
            map.put(arr2[i],true);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                ans.add(arr1[i]);
            }
        }
        for(Integer i:ans){
            System.out.println(i);
        }
        }
	}
}
