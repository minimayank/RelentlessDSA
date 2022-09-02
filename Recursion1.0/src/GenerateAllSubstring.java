public class GenerateAllSubstring {
    public static void printAllSubString(String inp){
        String curr="";
        int currLength=0;
        generateAllSubSets(inp,curr,currLength);
    }
    static int subsetsNo=0;
    public static void generateAllSubSets(String inp,String curr,int currLength){
         if(currLength==inp.length()){
             subsetsNo++;
             System.out.print(subsetsNo+" : "+curr+" ");
             return;
         }

             generateAllSubSets(inp,curr+inp.charAt(currLength),currLength+1);
             generateAllSubSets(inp,curr,currLength+1);
         

    }
    public static void main(String[] args) {
        String inp="abcd";
        printAllSubString(inp);
    }
}
