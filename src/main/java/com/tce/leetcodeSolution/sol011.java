package com.tce.leetcodeSolution;


/**
 * 11.盛水最多的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点?(i,?ai) 。在坐标内画 n 条垂直线，垂直线 i?的两个端点分别为?(i,?ai) 和 (i, 0)。找出其中的两条线，使得它们与?x?轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器，且?n?的值至少为 2。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 */
public class sol011 {
    /**
     * 双指针
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int low = 0, hi = height.length - 1;
        int res = -1;
        while (low < hi) {
            res = Math.max(Math.min(height[low], height[hi]) * (hi - low), res);

            if (height[low] < height[hi])
                low++;
            else
                hi--;
        }
        return res;
    }
}
