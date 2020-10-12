package com.tce.leetcodeSolution;

public class sol678 {
    //贪心
    public boolean checkValidString(String s) {
        char[] charArray = s.toCharArray();
        int lo = 0, hi = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                lo++;
                hi++;
            } else if (charArray[i] == ')') {
                if (lo > 0) lo--;
                if (hi-- == 0) return false;
            } else {
                if (lo > 0) lo--;
                hi++;
            }
        }
        return lo == 0;
    }

    //动态规划
    /* 作者：yinkn
    链接：https://leetcode-cn.com/problems/valid-parenthesis-string/solution/dong-tai-gui-hua-by-yinkn-3/
    来源：力扣（LeetCode）*/
    public boolean checkValidString2(String s) {
        int[][] dp = new int[s.length() + 1][2];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            dp[i + 1][0] = dp[i][0];
            dp[i + 1][1] = dp[i][1];
            if (ch == '(') {
                dp[i + 1][0]++;
                dp[i + 1][1]++;
            } else if (ch == ')') {
                dp[i + 1][0]--;
                dp[i + 1][1]--;
            } else {
                dp[i + 1][0]--;
                dp[i + 1][1]++;
            }
            if (dp[i + 1][1] < 0) return false;
            if (dp[i + 1][0] < 0) dp[i + 1][0] = 0;
        }
        return dp[s.length()][0] <= 0 && dp[s.length()][1] >= 0;
    }


}
