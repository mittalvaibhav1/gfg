// https://practice.geeksforgeeks.org/problems/maximum-and-minimum-of-array-elements/1/?track=DSASP-Arrays&batchId=154#
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int T = sc.nextInt();
	     while(T-- > 0) {
	         int n = sc.nextInt();
	         int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
	         for(int i = 0 ; i < n ; i++) {
	             int val = sc.nextInt();
	             max = Math.max(max,val);
	             min = Math.min(min,val);
	         }
	         System.out.println(max + " " + min);
	     }
	 }
}