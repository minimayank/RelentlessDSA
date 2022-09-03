import java.util.Arrays;

public class FactorialCalculator {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static double factorialDp(int n){
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        return factorialDpHelper(n,arr);
    }
    public static double factorialDpHelper(int n,int[] arr){
        if(arr[n]!=-1)return arr[n];
        if(n==0||n==1){
            arr[n]=1;
            return arr[n];
        }
        arr[n]=n*factorial(n-1);
        return arr[n];
    }
    public static int factorialDpBottomUp(int n){
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=i*arr[i-1];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(factorialDp(10));
        System.out.println(factorialDpBottomUp(5));
    }
}
