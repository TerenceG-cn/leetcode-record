package com.tce.leetcodeSolution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tce E-mail:
 * @version Create Time��2019��6��30�� ����2:15:21 Description:�ٷ����
 */
public class sol141 {
	public boolean hasCycle(ListNode head) {// ��ϣ��
		Set<ListNode> uniqNode = new HashSet<>();
		while (head != null) {
			if (uniqNode.contains(head)) {
				return true;
			} else {
				uniqNode.add(head);
				head = head.next;
			}
		}
		return false;
	}

	/*
	 * ִ����ʱ :14 ms, ������ Java �ύ�л�����16.34% ���û� 
	 * �ڴ����� :41.4 MB, ������ Java�ύ�л�����15.19%���û�
	 */
	public boolean hasCycle2(ListNode head) {// ����ָ��
		ListNode fast=head;
		ListNode slow=head;
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow = slow.next;
			if(fast==slow) {
				return true;
			}
		}
		return false;

	}
	/*
	 * ִ����ʱ :1 ms, ������ Java �ύ�л�����93.68%���û�
	 * �ڴ����� :39.8 MB, ������ Java �ύ�л�����46.58%���û�
	 */
}
