public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int x) {
        //Your code goes here
        int l=0;
        int h=arr.length-1;
        return bs(arr,l,h,x);
    }
    public static int bs(int[] arr,int l,int h,int x){

        if(h>=l){
            int mid=(h+l)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(x<arr[mid]){
                return bs(arr,l,mid-1,x);
            }

            return bs(arr,mid+1,h,x);
        }


        return -1;

    }

    public static void main(String[] args) {
        int[] arr={1, 3, 7, 9, 11, 12, 45};
        System.out.println(binarySearch(arr,11));
    }
}
