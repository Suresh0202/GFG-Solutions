class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character>St=new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            St.add(S.charAt(i));
        }
        String ans="";
        while(!St.isEmpty())
        {
            ans+=St.pop();
        }
        return ans;
        
    }
}