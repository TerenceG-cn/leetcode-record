package com.tce.leetcodeSolution;

/**
 * @author tce E-mail:
 * @version Create Time：2019年6月15日 下午4:17:23
 * @Description 参悟精选题解，
 * 执行用时 :9 ms, 在所有Java提交中击败了92.66%的用户
 * 内存消耗 :45 MB, 在所有Java提交中击败了82.46%的用户
 * 
 */

public class sol002 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int flag = 0;
		ListNode result = new ListNode(0);
		ListNode current = new ListNode(0);
		if (l1 == null) {
			return l1;
		} else if (l2 == null) {
			return l2;
		}

		result.val = l1.val + l2.val;
		if (result.val >= 10) {
			result.val -= 10;
			flag = 1;
		}
		l1 = l1.next;
		l2 = l2.next;
		int x, y;
		current = result;
		while (l1 != null || l2 != null) {
			x = (l1 != null) ? l1.val : 0;
			y = (l2 != null) ? l2.val : 0;
			ListNode newNode = new ListNode(x + y + flag);

			flag = newNode.val / 10;
			newNode.val %= 10;

			current.next = newNode;
			current = current.next;

			l1 = (l1 != null) ? l1.next : null;
			l2 = (l2 != null) ? l2.next : null;
		}
		if (flag == 1) {
			ListNode newNode = new ListNode(flag);
			current.next = newNode;
			current = current.next;
		}
		return result;
	}
}