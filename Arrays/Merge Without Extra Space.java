//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1#

class MergeSort
{
    public static void merge(int arr1[], int arr2[], int n, int m) 
    {
        int maxInArr1 = arr1[n - 1];
        
        for(int i = m - 1; i >= 0 ; i--) {
            if(maxInArr1 > arr2[i]) {
                arr1[n - 1] = arr2[i];
                arr2[i] = maxInArr1;
                insertSortLastElement(arr1, n);
                maxInArr1 = arr1[n - 1];
            }
        }
    }
    public static void insertSortLastElement(int[] arr1, int n) {
        int key = arr1[n - 1];
        int j = n - 2;
        while(j >= 0 && arr1[j] > key) {
            arr1[j + 1] = arr1[j];
            j--;
        }
        arr1[j + 1] = key;
    }
}
