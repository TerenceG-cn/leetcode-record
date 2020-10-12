package com.tce.leetcodeSolution;

public class sol530 {
    /**
     * ���Ƕ��������� aaa ����������Ԫ��֮��ľ���ֵ����Сֵ����һ��Ϊ��������Ԫ��֮�����Сֵ.
     * ������������������õ���ֵ�����ǵ��������
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
//    }      Java ֵ���ݡ�������


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
