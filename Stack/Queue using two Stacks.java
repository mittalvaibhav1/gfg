
// https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1

// O(1) - push  and O(n) - pop

// M1

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void Push(int x)
    {
	   s1.push(x);
    }
	
    int Pop()
    {
        if(s1.isEmpty()) return -1;
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        
        int deque = s2.pop();
        
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return deque;
    }
}
