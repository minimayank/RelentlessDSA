
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int[] ans=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        // if(arr1[0]>arr2[0]){
        //     ans[0]=arr2[0];
        //     j++;
        // }
        // else{
        //     ans[0]=arr1[0];
        //     i++;
        // }
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while(j<arr2.length){
            ans[k++]=arr2[j++];
        }
        return ans;   
    }

}
//Merge
