package com.tce.leetcodeSolution;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 */
public class sol94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        fun(root,res);
        return res;
    }

    private void fun(TreeNode root,List<Integer> res){
        if(root==null) return;
        if(root.left!=null) fun(root.left,res);
        res.add(root.val);
        if(root.right!=null) fun(root.right,res);
    }
}
