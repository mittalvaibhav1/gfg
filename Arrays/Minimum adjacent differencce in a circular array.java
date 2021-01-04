//https://practice.geeksforgeeks.org/problems/minimum-absloute-difference-between-adjacent-elements-in-a-circular-array-1587115620/1/?track=DSASP-Arrays&batchId=154#
class Difference{
    
    // Function to find minimum adjacent difference
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        int min =  Math.abs(arr[n-1] - arr[0]);
        for(int i = 0 ; i < n - 1 ; i++) {
            min = Math.min(min , Math.abs(arr[i] - arr[i+1]));
        }
        return min;
    }
}
