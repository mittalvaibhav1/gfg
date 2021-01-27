//https://practice.geeksforgeeks.org/problems/count-the-reversals/0#

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
	         String s = sc.next();
	         int len = s.length(), m = 0;
	         if(len % 2 != 0) {
	             System.out.println(-1);
	             continue;
	         }
	         Stack<Character> stack = new Stack<>();
	         for(int i = 0 ; i < len ; i++) {
	             char curr = s.charAt(i);
	             if(curr == '{') {
	                 stack.push(curr);
	             }
	             else if(!stack.isEmpty() && stack.peek() == '{') {
	                 stack.pop();
	             }
	             else {
	                 m++;
	             }
	         }
	         int res = (int) Math.ceil(m / 2.0) + (int)Math.ceil(stack.size() / 2.0);
             System.out.println(res);
	     }
 	 }
}