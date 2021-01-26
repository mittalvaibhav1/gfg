//https://practice.geeksforgeeks.org/problems/rotten-oranges2536/1/

class Solution
{
    public int orangesRotting(int[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        int time = 0;
        
        LinkedList<Pair> q = new LinkedList<>();
        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- > 0) {
                Pair curr = q.poll();
                if(curr.x - 1 >= 0 && grid[curr.x - 1][curr.y] == 1) {
                    grid[curr.x - 1][curr.y] = 2;
                    q.add(new Pair(curr.x - 1, curr.y));
                }
                if(curr.y - 1 >= 0 && grid[curr.x][curr.y - 1] == 1) {
                    grid[curr.x][curr.y - 1] = 2;
                    q.add(new Pair(curr.x, curr.y - 1));
                }
                if(curr.x + 1 < m && grid[curr.x + 1][curr.y] == 1) {
                    grid[curr.x + 1][curr.y] = 2;
                    q.add(new Pair(curr.x + 1, curr.y));
                }
                if(curr.y + 1 < n && grid[curr.x][curr.y + 1] == 1) {
                    grid[curr.x][curr.y + 1] = 2;
                    q.add(new Pair(curr.x, curr.y + 1));
                }
            }
            if(q.size() != 0) time++;
        }
        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return time;
    }
}
class Pair {
    int x = 0;
    int y = 0;
    
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}