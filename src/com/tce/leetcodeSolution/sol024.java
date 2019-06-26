package com.tce.leetcodeSolution;

/**
 * @author tce E-mail:
 * @version Create Time：2019年6月19日 下午9:37:15 
 * Description
 * 执行用时 :15 ms, 在所有 Java 提交中击败了10.20% 的用户
 * 内存消耗 :33.9 MB, 在所有 Java 提交中击败了91.13%的用户
 */
public class sol024 {
	public ListNode swapPairs(ListNode head) {
		// if(head.next==null||head==null) return head;顺序不一样都能报错的
		if (head == null || head.next == null)
			return head;
		ListNode pre = new ListNode(0);
		ListNode cur = head;
		ListNode next = head.next;
		ListNode result = head.next;

		do {
			cur.next = next.next;
			next.next = cur;
			pre.next = next;
			pre = cur;

			cur = cur.next;
			next = (cur == null) ? null : cur.next;
		} while (cur != null && next != null);

		return result;
	}
}
