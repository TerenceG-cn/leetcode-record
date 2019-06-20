package com.tce.leetcodeSolution;

/**
 * @author tce E-mail:
 * @version Create Time：2019年6月15日 下午10:22:20 \
 * Description:根据题解提醒，快慢指针
 * 执行用时 :2 ms, 在所有Java提交中击败了92.11% 的用户
 * 内存消耗 :34.2 MB, 在所有Java提交中击败了92.60%的用户
 */

public class sol019 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode preNode = head;
		ListNode tearNode = head;
		if (head.next == null) {
			return null;
		}
		while (n > 0) {
			tearNode = tearNode.next;
			n--;
		}
		if (tearNode == null) {
			return head.next;
		}
		while (tearNode.next != null) {
			tearNode = tearNode.next;
			preNode = preNode.next;
		}
		preNode.next = preNode.next.next;
		return head;
	}

}
