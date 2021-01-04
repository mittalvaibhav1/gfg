//https://practice.geeksforgeeks.org/problems/mean-and-median-1587115620/1/?track=DSASP-Arrays&batchId=154#
class MM
{
    
  public int median(int A[],int N)
    {
       Arrays.sort(A);
       if(N % 2 == 0) {
           return (A[(N - 1) / 2] + A[N / 2]) / 2;
       }
       else {
           return A[N / 2];
       }
    }
    
    public int mean(int A[],int N)
    {
       int sum = 0;
       for(int i = 0 ; i < N ; i++) {
           sum += A[i];
       }
       return sum / N;
    }

}
