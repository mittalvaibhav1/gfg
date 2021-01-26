// https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1#
class Tree
{
    public ArrayList <Integer> bottomView(Node root)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        ArrayDeque<Pair> q = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        q.add(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            map.put(curr.hd, curr.node.data);
            min = Math.min(min, curr.hd);
            max = Math.max(max, curr.hd);
            if(curr.node.left != null) {
                q.add(new Pair(curr.node.left, curr.hd - 1));
            }
            if(curr.node.right != null) {
                q.add(new Pair(curr.node.right, curr.hd + 1));
            }
        }
        for(int i = min ; i <= max ; i++) {
            res.add(map.get(i));
        }
        return res;
    }
}
class Pair {
    Node node;
    int hd;
    
    public Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}