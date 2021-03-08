//https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1/?track=DSASP-Stack#

/* You need to add code for functions 
   push() and pop() */
class MyStack{

    int top;
	int stack[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	/* The method push to push element
	    into the stack */
    void push(int val)
	{
	    stack[++top] = val;
	} 
	
    /* The method pop which return 
      the element poped out of the stack*/
	int pop()
	{
	    if(top == -1)
	        return -1;
        return stack[top--];
	}
}


