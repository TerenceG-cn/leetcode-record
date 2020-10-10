package com.tce.leetcodeSolution;

import java.util.Random;

//蓄水池采样 todo

/**
 * 398.随机数索引
 * 给定一个可能含有重复元素的整数数组，要求随机输出给定的数字的索引。 您可以假设给定的数字一定存在于数组中。
 *
 * 注意：数组大小可能非常大。 使用太多额外空间的解决方案将不会通过测试。
 */
class sol398 {
    private int[] nums;
    public sol398(int[] nums) {
       this.nums = nums;
    }

    /**
     * 假设当前正要读取第n个数据，则我们以1/n的概率留下该数据，否则留下前n-1个数据中的一个。
     * 以这种方法选择，所有数据流中数据被选择的概率一样。
     * @param target
     * @return
     */
    public int pick(int target) {
        Random r = new Random();
        int n = 0;
        int index = 0;
        for(int i = 0;i < nums.length;i++)
            //我们的目标对象中选取
            if(nums[i] == target){
                n++;
                //我们以1/n的概率留下该数据
                if(r.nextInt() % n == 0) index = i;
            }
        return index;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
