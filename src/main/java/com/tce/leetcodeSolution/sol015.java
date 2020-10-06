package com.tce.leetcodeSolution;

import java.util.List;

/**
 * 给你一个包含 n 个整数的数组?nums，判断?nums?中是否存在三个元素 a，b，c ，使得?a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */
public class sol015 {
    public static void main(String[] args){
        int[] nums={7,3,4,1,9,7,3,8,9,4};
        int[] quick=new int[nums.length];
        for(int i:quick){
            System.out.print(i+" ");
        }
        System.out.println();
        System.arraycopy(nums, 0, quick, 0, nums.length);

        Quick(quick,0,quick.length-1);
        for(int i:quick){
            System.out.print(i+" ");
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        int[] quick=new int[nums.length];
        System.arraycopy(nums, 0, quick, 0, nums.length);
        Quick(quick,0,quick.length-1);
        //to do


        return null;
    }
    //交换数组元素
    private static void swap(int[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

    //快速排序方法
    private static void Quick(int[] array, int lowIndex, int highIndex) {
        int low = lowIndex;
        int high = highIndex;
        int temp;
        if (lowIndex < highIndex) {
            while (low <= high) {
                temp = array[(lowIndex + highIndex) / 2];
                while ((low < highIndex) && (array[low] < temp)) {
                    ++low;
                }
                while ((high > lowIndex) && (array[high] > temp)) {
                    --high;
                }
                if (low <= high) {
                    swap(array, low, high);
                    ++low;
                    --high;
                }
            }
            if (low < highIndex) {
                Quick(array, low, highIndex);
            }
            if (high > lowIndex) {
                Quick(array, lowIndex, high);
            }
        }
    }

}
