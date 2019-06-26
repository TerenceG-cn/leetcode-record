package com.tce.leetcodeSolution;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author tce E-mail:
 * @version Create Time��2019��6��25�� ����11:51:59 Description:
 * 
 */
public class sol083 {
	/*
	 * ��һ�νⷨ ִ����ʱ :10 ms, ������ Java �ύ�л�����6.05%���û� �ڴ����� :37.9 MB, ������ Java
	 * �ύ�л�����40.17%���û�
	 */
	public ListNode deleteDuplicates1(ListNode head) {
		Set<Integer> valSet = new LinkedHashSet<>();// ά������˳��
		while (head != null) {
			valSet.add(head.val);
			head = head.next;
		}
		ListNode cur = new ListNode(0);
		for (int val : valSet) {
			ListNode nn = new ListNode(val);
			cur.next = nn;
			cur = cur.next;
		}

		return cur.next;
	}

	/*
	 * �ο��ٷ���� ע�⵽��Ŀ������������ֻ��Ҫ����ָ�롣
	 * ִ����ʱ :2 ms, ������ Java �ύ�л�����87.49% ���û� 
	 * �ڴ����� :37.7MB, ������ Java �ύ�л�����42.49%���û�
	 * ���Ӷȣ�ʱ�䣺O(n)���ռ䣺O(1)
	 */
	public ListNode deleteDuplicates2(ListNode head) {
		ListNode cur = head;
		while (cur != null || cur.next != null) {
			/*
			 * ������߼� if(cur.val==cur.next.val) { cur.next=cur.next.next; cur=cur.next; }
			 */
			if (cur != null && cur.next != null) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}

		}
		return head;
	}
}
