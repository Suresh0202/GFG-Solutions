// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        HashSet<Character>ts=new HashSet<>();
        for(char c:s.toCharArray()){
            if(!ts.add(c))
                return c+"";
        }
        return "-1";
    }
}