package com.tce.leetcodeSolution;

public class sol061 {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null)
			return null;
		ListNode cur = head;
		int len = 1;
		while (cur.next != null) {
			cur = cur.next;
			len++;
		}
		cur.next = head;
		k = k % len;
		while (len > k) {
			cur = cur.next;
			len--;
		}
		ListNode result = cur.next;
		cur.next = null;
		return result;
	}
}
