package com.tce.leetcodeSolution;

public class sol092 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode cur = null;
		ListNode slow = head;
		ListNode fast = head;
		for (int i = 1; i < m; i++) {
			cur = slow;
			slow = slow.next;
		}
		for (int j = 1; j < n; j++) {
			fast = fast.next;
		}

		if (slow == fast)
			return head;
		if (cur == null)
			head = fast;
		else
			cur.next = fast;

		cur = slow.next;
		slow.next = fast.next;

		if (cur == fast)
			fast.next = slow;
		else {
			ListNode o = cur.next;
			while (o != fast) {
				cur.next = slow;
				slow = cur;
				cur = o;
				o = o.next;
			}
			cur.next = slow;
			fast.next = cur;
		}

		return head;
	}
}
