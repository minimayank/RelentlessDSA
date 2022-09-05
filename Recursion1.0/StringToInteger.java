
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
        int index=0;
        int ans=0;
       return integerConverter(input,index,ans);

	}
    public static int integerConverter(String input,int index,int ans){
        if(index<input.length()){
            if(input.length()==0){
              
                return ans;
            }
            else{
                ans=ans*10+Character.getNumericValue(input.charAt(index));
                    ans=integerConverter(input,index+1,ans);
            }
            
        }
        return ans;
    }
}
