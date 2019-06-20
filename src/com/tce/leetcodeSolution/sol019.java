package com.tce.leetcodeSolution;

/**
 * @author tce E-mail:
 * @version Create Time��2019��6��15�� ����10:22:20 \
 * Description:����������ѣ�����ָ��
 * ִ����ʱ :2 ms, ������Java�ύ�л�����92.11% ���û�
 * �ڴ����� :34.2 MB, ������Java�ύ�л�����92.60%���û�
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
