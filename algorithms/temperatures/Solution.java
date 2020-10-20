// Question Link: https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
// ![image](https://user-images.githubusercontent.com/49227865/96536674-381f8300-12b2-11eb-9fc6-448da4ad1fcf.png)
// https://jbt.github.io/markdown-editor/  -  use this link to know the image, just copy and paste the above line in that.
/*
Write a program that prints the temperature closest to 0 among input data. 
If two numbers are equally close to zero, positive integer has to be considered closest to zero (for instance, if the temperatures are -5 and 5, then display 5).
Display 0 (zero) if no temperatures are provided. Otherwise, display the temperature closest to 0.
*/

## Solution:
import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int minP = Integer.MAX_VALUE;
        int minN = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if(t > 0){ // t - positive
                if(t < minP){
                    minP = t;
                }
            } 
            else if(t < 0){    // t - negative
                if(t > minN){
                    minN = t;
                }
            }
        }
        
        if(minP == Integer.MAX_VALUE && minN == Integer.MIN_VALUE){
            System.out.println(0);
        }
        else{
            if((minP + minN < 0) || (minP + minN == 0)){
                System.out.println(minP);
            } 
            else{
                System.out.println(minN);
            }
        }
    }
}

// Time Complexity - O(n)
// Space Complexity - O(1)
