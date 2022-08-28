import java.util.*;
public class MaximumFrequencyNumberInAnArray {
    public static int maximumFrequencyNumber(int[] arr){
        if(arr.length==0)return -1;
        else{
            HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
            int freq=1;

            for(int i=0;i<arr.length;i++){
                int key=arr[i];
                if(map.containsKey(key)){
                    int freq1=map.get(arr[i])+1;
                    map.put(arr[i],freq1);

                }else {
                    map.put(arr[i], freq);
                }
            }
            Set<Integer>set=map.keySet();
            int max=arr[0];
            int maxFrequency=1;
           for(Integer i:set){
               if(map.get(i)>maxFrequency){
                   maxFrequency=map.get(i);
                   max=i;
               }
           }
           return max;
        }
    }
    public static void main(String[] args) {
           int[] arr={1,1,2,2,2,2,2,3,3,4,4,4,4,4,5,6,7,8,8};
        System.out.println(maximumFrequencyNumber(arr));
    }
}
