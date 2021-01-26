//https://practice.geeksforgeeks.org/problems/steps-by-knight5927/1/
class Solution
{
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        boolean visited[][] = new boolean[N + 1][N + 1];
        Pair start = new Pair(KnightPos[0], KnightPos[1], 0);
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(start);
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            if(curr.x == TargetPos[0] && curr.y == TargetPos[1]) {
                return curr.d;
            }
            // 1
            if(curr.x + 1 <= N && curr.y - 2 >= 1 && !visited[curr.x + 1][curr.y - 2]) {
                visited[curr.x + 1][curr.y - 2] = true;
                q.add(new Pair(curr.x + 1, curr.y - 2, curr.d + 1));
            }
            // 2
            if(curr.x - 1 >= 1 && curr.y - 2 >= 1 && !visited[curr.x - 1][curr.y - 2]) {
                visited[curr.x - 1][curr.y - 2] = true;
                q.add(new Pair(curr.x - 1, curr.y - 2, curr.d + 1));
            }
            // 3
            if(curr.x + 1 <= N && curr.y + 2 <= N && !visited[curr.x + 1][curr.y + 2]) {
                visited[curr.x + 1][curr.y + 2] = true;
                q.add(new Pair(curr.x + 1, curr.y + 2, curr.d + 1));
            }
            // 4
            if(curr.x - 1 >= 1 && curr.y + 2 <= N && !visited[curr.x - 1][curr.y + 2]) {
                visited[curr.x - 1][curr.y + 2] = true;
                q.add(new Pair(curr.x - 1, curr.y + 2, curr.d + 1));
            }
            // 5
            if(curr.x + 2 <= N && curr.y - 1 >= 1 && !visited[curr.x + 2][curr.y - 1]) {
                visited[curr.x + 2][curr.y - 1] = true;
                q.add(new Pair(curr.x + 2, curr.y - 1, curr.d + 1));
            }
            // 6
            if(curr.x + 2 <= N && curr.y + 1 <= N && !visited[curr.x + 2][curr.y + 1]) {
                visited[curr.x + 2][curr.y + 1] = true;
                q.add(new Pair(curr.x + 2, curr.y + 1, curr.d + 1));
            }
            // 7
            if(curr.x - 2 >= 1 && curr.y + 1 <= N && !visited[curr.x - 2][curr.y + 1]) {
                visited[curr.x - 2][curr.y + 1] = true;
                q.add(new Pair(curr.x - 2, curr.y + 1, curr.d + 1));
            }
            // 8
            if(curr.x - 2 >= 1 && curr.y - 1 >= 1 && !visited[curr.x - 2][curr.y - 1]) {
                visited[curr.x - 2][curr.y - 1] = true;
                q.add(new Pair(curr.x - 2, curr.y - 1, curr.d + 1));
            }
        }
        return -1;
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