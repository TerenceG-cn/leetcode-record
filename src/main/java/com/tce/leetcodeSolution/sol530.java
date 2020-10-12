package com.tce.leetcodeSolution;

public class sol530 {
    /**
     * 考虑对升序数组 aaa 求任意两个元素之差的绝对值的最小值，答案一定为相邻两个元素之差的最小值.
     * 二叉搜索树中序遍历得到的值序列是递增有序的
     */
//    public int getMinimumDifference(TreeNode root) {
//        int res = Integer.MAX_VALUE;
//        int pre = -1;
//        fun(root,pre,res);
//        return res;
//    }
//
//    private void fun(TreeNode root,int pre,int ans){
//        if(root==null) return;
//        fun(root.left,pre,ans);
//        if(pre!=-1)
//            ans=Math.min(ans,root.val-pre);
//        pre=root.val;
//        fun(root.right,pre,ans);
//    }      Java 值传递。。。。


    int res = Integer.MAX_VALUE;
    int pre = -1;
    public int getMinimumDifference(TreeNode root) {
        fun(root);
        return res;
    }

    private void fun(TreeNode root){
        if(root==null) return;
        fun(root.left);
        if(pre!=-1)
            res=Math.min(res,root.val-pre);
        pre=root.val;
        fun(root.right);
    }

}
