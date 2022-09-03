import java.util.Arrays;

public class FibonacciSeries {
    public static int fibonacciNthTerm(int n){
        if(n==0||n==1)return 1;
        return  fibonacciNthTerm(n-1)+fibonacciNthTerm(n-2);
    }
    static int[] arr;
    public static int fibonacciNthTermDP(int n){
       return fibonacciNthTermDPHelper(n,arr);

    }
    static int index=0;
    public static int fibonacciNthTermDPHelper(int n,int[] arr){
        if(arr[n]!=-1)return arr[n];
        else if(n==0||n==1){
            arr[n]=1;
            return arr[n];
        }
        else{
            arr[n]=fibonacciNthTermDPHelper(n-1,arr)+fibonacciNthTermDPHelper(n-2,arr);
            return arr[n];
        }
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacciNthTerm(n)); //Ans:1:1:2:3:5:8
        arr=new int[n+1];
        Arrays.fill(arr,-1);
        System.out.println(fibonacciNthTermDP(n));

    }
}
