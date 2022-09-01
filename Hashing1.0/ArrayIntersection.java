




/*
                             _     _        _             
 _ __ ___  _   _   _ __ ___ (_)___| |_ __ _| | _____  ___ 
| '_ ` _ \| | | | | '_ ` _ \| / __| __/ _` | |/ / _ \/ __|
| | | | | | |_| | | | | | | | \__ \ || (_| |   <  __/\__ \
|_| |_| |_|\__, | |_| |_| |_|_|___/\__\__,_|_|\_\___||___/
           |___/          
      1. I made two case solution earlier, 1st when the size of 1st array was greater than second.
      2. Secondly I revised my solution, by testing my old approach which was just operating over the keys of the hashmaps. 
      To explain, I would say, I created a hashmap implemented by linkedhashMap, where I checked wether the given element is present or not. Accordingly I
      added them to my hashmap with its value as a boolean.
      Finally I checked using the containskey method upon storing the first array in the hashmap. But there was issue of printing the duplicate value,
      in a cases like:
7
2 6 8 5 4 3 2
5
2 2 2 5 5
      
      3. My recent approach improvised the methodology where I made value as counter of its occurence and accordingly I updated the value.
      Rest has been commented in the code.



*/


import java.util.*;
public class Solution {

	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        HashMap<Integer,Integer>map=new LinkedHashMap<>();
       
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);  //multiple occurences.
                continue;// note vvip, otherwise for all it will be  overridden with 1.
            }
            map.put(arr1[i],1); // first occurence.
        }
    //now search the same values.
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])&&map.get(arr2[i])!=0){
                ans.add(arr2[i]);
                map.put(arr2[i],map.get(arr2[i])-1);
            }
        }
        for(Integer i:ans){
            System.out.println(i);
        }
        
        }
}
