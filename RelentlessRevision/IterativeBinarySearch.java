
public class InterativeBinarySearch { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int l=0;
        int h=arr.length-1;
        
        while(h>=l){
            int mid=(l+h)/2;
            if(arr[mid]==x)return mid;
            else if(arr[mid]>x){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

}
