package com.tce.leetcodeSolution;

/**
 * @author tce E-mail:
 * @version Create Time��2019��7��7�� ����8:10:40 
 * Description:
 * ִ����ʱ :0 ms, ������ Java �ύ�л�����100.00%���û�
 * �ڴ����� :34.7 MB, ������ Java �ύ�л�����40.02%���û�
 */
public class sol876 {
	public ListNode middleNode(ListNode head) {//����ָ��
		ListNode fast = head;
		ListNode slow = head;
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
}
