// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char[] ch = s.toCharArray();
      
     int start = 0;
     int end = s.length() -1;
     
     while(start < end){
   
      char temp = ch[end];
      ch[end] = ch[start];
      ch[start] = temp;
      start++;
      end--;
     }
     
     return new String(ch);
        
    }
}