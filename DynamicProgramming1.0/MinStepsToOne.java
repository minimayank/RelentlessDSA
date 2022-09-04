public class MinStepsToOne {


static int path1=0,path2=0,path3=0;
    public static int countMinStepsToOne(int n) {

        if(n==1)return 0;

        path1++;
        countMinStepsToOne(n-1);
        if(n%2==0){
            path2++;
            countMinStepsToOne(n/2);
        }
        if(n%3==0){
            path3++;
            countMinStepsToOne(n/3);
        }
        return Math.min(path1,Math.min(path2,path3));

    }
    public static int minStep(int n){
        if(n==1)return 0;
        else{
            int count1=minStep(n-1);
            int minSteps=count1;
            if(n%2==0){
               int count2= minStep(n/2);
               if(minSteps>count2){
                   minSteps=count2;
               }
            }
            if(n%3==0){
                int count3=minStep(n/3);
                if(minSteps>count3){
                    minSteps=count3;
                }
            }
            return 1+minSteps;
        }
    }


    public static void main(String[] args) {
        System.out.println(minStep(10));
        System.out.println(minStep(4));
    }
}
