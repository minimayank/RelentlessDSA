import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MaximumFrequencyNumber {

  public static ArrayList<Integer> removeDuplicates(int[] arr){
      HashMap<Integer,Boolean>map=new HashMap<Integer, Boolean>();
      for(int i=0;i<arr.length;i++){
          if(map.containsKey(arr[i])){
              continue;
          }
          map.put(arr[i],true);
      }
      ArrayList<Integer>ans=new ArrayList<>();
      Set<Integer> set=map.keySet();
      for(Integer i:set){
         ans.add(i);
      }
      return ans;
  }
    public static void main(String[] args) {
      int[] arr={1,2,3,1,1,2,2,3,3,3,4,5,6,8,9,7,10,0};
      ArrayList<Integer>ans=removeDuplicates(arr);
      System.out.println(ans);
    }
}
