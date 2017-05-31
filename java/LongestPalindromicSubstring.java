/**
 * 最长回文子字符串
 * Created by 余林丰 on 2017/5/31/0031.
 */
public class Solution {
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 0) {
            return "";
        }
        int maxLen = 0;
        String res = "";
        int lengh = s.length();
        for (int i = 0; i < 2 * lengh - 1; i++) {
            int left = i / 2;
            int right = i / 2;
            if (i % 2 == 1) {   //奇数
                right ++;
            }
            String str = lenghOfPalindrome(s, left, right);
            if (maxLen < str.length()) {
                maxLen = str.length();
                res = str;
            }
        }
        return res;
    }
    
    /**
     * 回文字符串
     * @param s
     * @param left
     * @param right
     * @return
     */
    private String lenghOfPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}