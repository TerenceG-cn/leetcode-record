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
 * @version Create Time��2019��6��15�� ����5:19:51 
 * Description��
 * ִ����ʱ :3 ms, ������Java�ύ�л�����72.44%���û�
 * �ڴ����� :37.1 MB, ������Java�ύ�л�����74.92%���û�
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
