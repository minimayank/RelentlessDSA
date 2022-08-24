public class StringPalindrome {
    public static boolean palindromeHelper(String input,int a,int z){
        boolean ans=true;
        if(z>=a){
            if(input.charAt(a)==input.charAt(z)){
                ans= palindromeHelper(input,a+1,z-1);
            }
            else{
                return false;
            }

        }
        return ans;
    }
    public static boolean isStringPalindrome(String input) {
        // Write your code here
        int start=0;
        int end=input.length()-1;
        return palindromeHelper(input,start,end);

    }
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("tacocat"));
    }
}
