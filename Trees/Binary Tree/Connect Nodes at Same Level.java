//https://practice.geeksforgeeks.org/problems/connect-nodes-at-same-level/1#

class Tree
{
    /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    public static void connect(Node p) {
        if(p == null)
            return;
        ArrayDeque<Node> q = new ArrayDeque<>();
        p.nextRight = null;
        q.add(p);
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- > 0) {
                Node curr = q.poll();
                curr.nextRight = size == 0 ? null : q.peek();
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
}