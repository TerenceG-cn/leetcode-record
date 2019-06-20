package com.tce.leetcodeSolution;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

/**
 * @author tce E-mail:
 * @version Create Time：2019年6月15日 下午5:19:51 
 * Description：
 * 执行用时 :3 ms, 在所有Java提交中击败了72.44%的用户
 * 内存消耗 :37.1 MB, 在所有Java提交中击败了74.92%的用户
 */
public class sol110 {
	public boolean isBalanced(TreeNode root) {
		return judge(root) != -1;
	}

	private int judge(TreeNode root) {
		if (root != null) {
			int ans1 = judge(root.left);
			int ans2 = judge(root.right);
			if (ans1 < 0 || ans2 < 0)
				return -1;
			if (Math.abs(ans1 - ans2) > 1)
				return -1;
			return (ans1 > ans2 ? ans1 : ans2) + 1;
		} else
			return 0;
	}
}
