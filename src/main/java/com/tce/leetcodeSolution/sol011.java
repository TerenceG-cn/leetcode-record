package com.tce.leetcodeSolution;


/**
 * 11.ʢˮ��������
 * ���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ����?(i,?ai) ���������ڻ� n ����ֱ�ߣ���ֱ�� i?�������˵�ֱ�Ϊ?(i,?ai) �� (i, 0)���ҳ����е������ߣ�ʹ��������?x?�Ṳͬ���ɵ�����������������ˮ��
 * <p>
 * ˵�����㲻����б��������?n?��ֵ����Ϊ 2��
 * <p>
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/container-with-most-water
 */
public class sol011 {
    /**
     * ˫ָ��
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
