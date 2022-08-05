package Revision;
//*
//               ╭─────────────────────────╮
//    დოოოოოდ    │                         │
//    |     |    │  OS        Pop          │
//    |     |   ╭│  KERNEL    5.18.10      │
//    |-Ο Ο-|   ││  DE        plasma       │
//   Ͼ   ∪   Ͽ  ││  SHELL     fish         │
//    |     |   ╯│  UPTIME    4h, 36m      │
//   ˏ`-.ŏ.-´ˎ   │  PACKAGES  2865         │
//       @       │                         │
//        @      ╰─────────────────────────╯     _       _   _  ___  ___  _ _  _   _
// _ __ ___ (_)_ __ (_) / |( _ )/ _ \/ | || | / |
//| '_ ` _ \| | '_ \| | | |/ _ \ (_) | | || |_| |
//| | | | | | | | | | | | | (_) \__, | |__   _| |
//|_| |_| |_|_|_| |_|_| |_|\___/  /_/|_|  |_| |_|
// */
public class Merge2SortedArray {
    public static int[] merge(int[] arr1,int[] arr2){
        if(arr1.length==0&&arr2.length!=0)return arr2;
        if(arr2.length==0&&arr1.length!=0)return arr1;

        int size=arr1.length+arr2.length;
         int i=0,j=0,k=0;
         int[] arr=new int[size];
         while(i<arr1.length&&j<arr2.length){
             if(arr1[i]<=arr2[j]){
                 arr[k++]=arr1[i++];
             }
             else{
                 arr[k++]=arr2[j++];
             }
         }
         while(i<arr1.length){
             arr[k++]=arr1[i++];
         }
         while(j<arr2.length){
             arr[k++]=arr2[j++];
         }

         return arr;
    }


    public static void main(String[] args) {
      int[] arr1={1,2,3,4,5};
      int[] arr2={-1,2,4,5,50};

      int[] res=merge(arr1,arr2);
      for(int i:res){
          System.out.print(i+"\t");
      }
    }
}
