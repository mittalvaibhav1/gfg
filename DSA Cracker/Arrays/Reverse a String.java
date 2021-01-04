//https://practice.geeksforgeeks.org/problems/reverse-a-string/1#
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int left = 0;
        int right = str.length() - 1;
        char[] res = str.toCharArray();
        while(left < right) {
            char tmp = res[left];
            res[left++] = res[right];
            res[right--] = tmp;
        }
        return new String(res);
    }
}