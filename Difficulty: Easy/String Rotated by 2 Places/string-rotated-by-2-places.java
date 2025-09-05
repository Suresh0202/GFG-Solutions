class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        if(s1.length() != s2.length())
        {
            return false;
        }
        if(s1.length() < 2)
        {
            return s1.equals(s2);
        }
        String rig=s1.substring(2)+s1.substring(0,2);
        String lef=s1.substring(s1.length()-2)+s1.substring(0,s1.length()-2);
        return rig.equals(s2) ||  lef.equals(s2);
    }
}