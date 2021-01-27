//https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1#

class solve{
    // Function to return maximum of sum without adjacent elements
    public int FindMaxSum(int arr[], int n){
        int prevTwo = 0;
        int prevOne = 0;
        int maxLoot = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            maxLoot = Math.max(prevTwo + arr[i], prevOne);
            prevTwo = prevOne;
            prevOne = maxLoot;
        }
        return maxLoot;
    }
}