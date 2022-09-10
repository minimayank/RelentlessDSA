public class FibonacciSeries {
    public static int fibonacci(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static int fibonacciMemo(int n){
        int[] memo=new int[n+1];
        return fibonacciMemoHelper(n,memo);
    }
    public static int fibonacciMemoHelper(int n,int[] memo){
        if(n==0||n==1){
            memo[n]=1;
            return memo[n];
        }
        else{
            memo[n]=fibonacciMemoHelper(n-1,memo)+fibonacciMemoHelper(n-2,memo);
            return memo[n];
        }
    }
    public static void fibonacciSeries(int n){
        for(int i=0;i<=n;i++){
            System.out.print((fibonacciMemo(i))+" ");
        }
    }
    public static int dpFib(int n){
        int[] memo=new int[n+1];
        return fibonacciDp(n,memo);
    }
    public static int fibonacciDp(int n,int[] memo){
        memo[0]=1;
        memo[1]=1;
        for(int i=2;i<=n;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n];
    }
    public static void main(String[] args) {
        fibonacciSeries(5);
        System.out.println();
        System.out.println(dpFib(6));
    }
}
