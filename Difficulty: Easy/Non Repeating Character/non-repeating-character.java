class Solution {
    public char nonRepeatingChar(String s) {
        // code here
         int[] arr = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[ch - 'a'] == 1) {
                return ch;
            }
        }

        return '$';
    }
}
