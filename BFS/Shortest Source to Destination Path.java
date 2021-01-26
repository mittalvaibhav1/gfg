//https://practice.geeksforgeeks.org/problems/shortest-source-to-destination-path/0#
import java.lang.*;
import java.io.*;
import java.util.*;

class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int T = sc.nextInt();
	     while(T-- > 0) {
	         
	         int m = sc.nextInt();
	         int n = sc.nextInt();
	         
	         int[][] matrix = new int[m][n];
	         boolean[][] visited = new boolean[m][n];
	         
	         for(int i = 0 ; i < m ; i++) {
	             for(int j = 0 ; j < n ; j++) {
	                 matrix[i][j] = sc.nextInt();
	                 if(matrix[i][j] == 0) {
	                     visited[i][j] = true;
	                 }
	             }
	         }
	         
	         int x = sc.nextInt();
	         int y = sc.nextInt();
	         
	         System.out.println(helper(matrix, visited, x, y));
	     }
	 }
	 public static int helper(int[][] matrix, boolean[][] visited, int x, int y) {
	     if(visited[0][0]) return -1;
	     Pair start = new Pair(0, 0, 0);
	     LinkedList<Pair> q = new LinkedList<>();
	     q.add(start);
	     int m = matrix.length;
	     int n = matrix[0].length;
	     while(!q.isEmpty()) {
	         Pair curr = q.poll();
	         if(curr.x == x && curr.y == y && matrix[x][y] != 0) {
	             return curr.d;
	         }
	         // 1
	         if(curr.x - 1 >= 0 && !visited[curr.x - 1][curr.y]) {
	             visited[curr.x - 1][curr.y] = true;
	             q.add(new Pair(curr.x - 1, curr.y, curr.d + 1));
	         }
	         // 2
	         if(curr.x + 1 < m  && !visited[curr.x + 1][curr.y]) {
	             visited[curr.x + 1][curr.y] = true;
	             q.add(new Pair(curr.x + 1, curr.y, curr.d + 1));
	         }
	         // 3
	         if(curr.y - 1 >= 0 && !visited[curr.x][curr.y - 1]) {
	             visited[curr.x][curr.y - 1] = true;
	             q.add(new Pair(curr.x, curr.y - 1, curr.d + 1));
	         }
	         // 4
	         if(curr.y + 1 < n && !visited[curr.x][curr.y + 1]) {
	             visited[curr.x][curr.y + 1] = true;
	             q.add(new Pair(curr.x, curr.y + 1, curr.d + 1));
	         }
	     }
	     return - 1;
	 }
}
class Pair {
    int x;
    int y;
    int d;
    public Pair(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.d = d;
    }
}