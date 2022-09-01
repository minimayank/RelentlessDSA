//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here
     _ _     _   _            _                                
  __| (_)___| |_(_)_ __   ___| |_    __ _ _ __ _ __ __ _ _   _ 
 / _` | / __| __| | '_ \ / __| __|  / _` | '__| '__/ _` | | | |
| (_| | \__ \ |_| | | | | (__| |_  | (_| | |  | | | (_| | |_| |
 \__,_|_|___/\__|_|_| |_|\___|\__|  \__,_|_|  |_|  \__,_|\__, |
                                                         |___/ 
      _                           _       
  ___| | ___ _ __ ___   ___ _ __ | |_ ___ 
 / _ \ |/ _ \ '_ ` _ \ / _ \ '_ \| __/ __|
|  __/ |  __/ | | | | |  __/ | | | |_\__ \
 \___|_|\___|_| |_| |_|\___|_| |_|\__|___/
                                          

minimayank  ~   master ?    v17.0.4   


*/

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking count of total testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            int n, m;

            // taking count of elements in array a
            n = sc.nextInt();

            // taking count of elements in array b
            m = sc.nextInt();

            // Creating 2 arrays of n and m
            int a[] = new int[n];
            int b[] = new int[m];

            // inserting elements to array a
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // inserting elements to array b
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling NumberofElementsInIntersection method
            // and printing the result
            System.out.println(ob.NumberofElementsInIntersection(a, b, n, m));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
                continue;
            }
            map.put(a[i],1);
        }
        
        int count=0;
        for(int i=0;i<b.length;i++){
            if(map.containsKey(b[i])){
                map.remove(b[i]); //to ensure unique elements.
                count++;
            }
        }
        return count;
    }
};
