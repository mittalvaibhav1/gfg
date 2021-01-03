class Solution
{
    static void rotateArr(int arr[], int d, int n)
    {
        d = d % n;
        reverse(arr, 0 , d - 1);
        reverse(arr, d , n - 1);
        reverse(arr, 0 , n - 1);
    }
    static void reverse(int[] arr , int left , int right) {
        while(left < right) {
            int tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }
    }
}