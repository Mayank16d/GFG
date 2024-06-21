//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String str) {
        // Code here
        String stra[]= str.split(", ");
        String as[] = stra[0].split("/");
        String bs[]= stra[1].split("/");
        
        int x1= Integer.parseInt(as[0]);
        int x2=Integer.parseInt(as[1]);
        int y1=Integer.parseInt(bs[0]);
        int y2=Integer.parseInt(bs[1]);
        
        double a = (double)x1/x2;
        double b = (double)y1/y2;
        // System.out.println(x1+" "+x2+);
        
        if(a==b) return "equal";
        else if(a>b) return stra[0];
        else return stra[1];
    }
}
