
public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
 
        int index=0;
       return  removeXHelper(input,"",index);
  
	}
    public static String  removeXHelper(String input,String ans,int index){
       if(index<input.length()){
           if(input.charAt(index)=='x'){
               ans=removeXHelper(input,ans,index+1);
           }
           else{
               ans+=input.charAt(index);
               ans=removeXHelper(input,ans,index+1);
           }
           return ans;
       }
        return ans;
    }
}
