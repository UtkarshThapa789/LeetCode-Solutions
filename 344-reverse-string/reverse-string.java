class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length/2 ; i++)
        {
            int first = i;
            int last = s.length - 1 - i;
            char start = s[first];
            char end = s[last];
            s[first] = end;
            s[last] = start;
        }
    }
}