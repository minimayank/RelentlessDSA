import java.util.*;
public class ArrayRotation {
    public static int[] rotate(int[]arr,int k){
        for(int i=0;i<k;i++){
            int temp=arr[0];

            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }


    public static int binarySearch(int[] arr, int x) {
        //Your code goes here
        int l=0;
        int h=arr.length-1;

        while(l<=h){
            int mid=(h+l)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                h=mid-1;
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(binarySearch(arr,k));

    }
}
