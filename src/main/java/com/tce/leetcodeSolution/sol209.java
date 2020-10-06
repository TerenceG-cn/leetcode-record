package com.tce.leetcodeSolution;

public class sol209 {
    /**
     *长度最小的子数组（暴力求解）
     * @param s
     * @param nums
     * @return
     */
    public int minSubArrayLen(int s, int[] nums) {
        int i, j, res = nums.length+1, sum = 0;
        for (i = 0; i < nums.length ; i++) {
            for (j = i + 1; j < nums.length + 1; j++) {
                sum += nums[j - 1];
                if (sum >= s) {
                    System.out.println("nmsl");
                    System.out.println("i:" + i + " j:" + j);
                    res = Math.min(j - i, res);
                    sum = 0;
                    break;
                }
            }
            sum = 0;
        }
        return res>nums.length?0:res;
    }

    /**
     *双指针 滑动窗口
     */
    public int minSubArrayLen2(int s, int[] nums) {
        int lo = 0, hi = 0, sum = 0, min = Integer.MAX_VALUE;
        while (hi < nums.length) {
            sum += nums[hi++];//队尾入
            while (sum >= s) {
                min = Math.min(min, hi - lo);//记录最短长度
                sum -= nums[lo++];//队头出
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    /**
     * 二分
     * @param
     */
    public int minSubArrayLen3(int s, int[] nums) {
        int lo = 1, hi = nums.length, min = 0;
        while (lo <= hi) {
            int mid = (lo + hi) >> 1;//int mid = (lo+hi)/2
            if (windowExist(mid, nums, s)) {
                hi = mid - 1;//找到就缩小窗口的大小
                min = mid;//如果找到就记录下来
            } else
                lo = mid + 1;//没找到就扩大窗口的大小
        }
        return min;
    }

    //size窗口的大小
    private boolean windowExist(int size, int[] nums, int s) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= size)
                sum -= nums[i - size];
            sum += nums[i];
            if (sum >= s)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        sol209 sol = new sol209();
        //int[] a = {2, 3, 1, 2, 4, 3};
        int[] a = {1,2,3,4,4};
        System.out.println(sol.minSubArrayLen2(15, a));
    }
}
