package com.tce.leetcodeSolution;

/**
 * @author tce E-mail:
 * @version Create Time��2019��6��19�� ����9:37:15 
 * Description
 * ִ����ʱ :15 ms, ������ Java �ύ�л�����10.20% ���û�
 * �ڴ����� :33.9 MB, ������ Java �ύ�л�����91.13%���û�
 */
public class sol024 {
	public ListNode swapPairs(ListNode head) {
		// if(head.next==null||head==null) return head;˳��һ�����ܱ����
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
