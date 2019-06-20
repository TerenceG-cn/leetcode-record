package com.tce.leetcodeSolution;

/**
 * @author tce E-mail:
 * @version Create Time��2019��6��15�� ����4:17:23
 * @Description ����ѡ��⣬
 * ִ����ʱ :9 ms, ������Java�ύ�л�����92.66%���û�
 * �ڴ����� :45 MB, ������Java�ύ�л�����82.46%���û�
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