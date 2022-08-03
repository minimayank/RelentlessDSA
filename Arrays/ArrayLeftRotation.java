

public class ArrayLeftRotation {
    public static void rotate(int[] arr, int d) {
        //Your code goes here
        if(d==0||d==arr.length){return;}
        else{
            for(int i=0;i<d;i++){
                int temp=arr[0];
               // System.out.println(temp);
                for(int j=0;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=temp;
            }
        }
    }

    public static void main(String[] args) {
     int[] arr={1,2,3,4,5};
     int d=2;
     rotate(arr,d);
     for(int i:arr){
         System.out.print(i);
     }

    }
}
