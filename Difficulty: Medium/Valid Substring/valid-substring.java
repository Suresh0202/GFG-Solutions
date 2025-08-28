import java.util.*;

class Solution {
    static int maxLen(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);  // base index
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i); // reset base
                } else {
                    maxLen = Math.max(maxLen, i - st.peek());
                }
            }
        }
        return maxLen;
    }
}
