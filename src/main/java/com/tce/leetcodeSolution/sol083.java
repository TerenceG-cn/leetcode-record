package com.tce.leetcodeSolution;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author tce E-mail:
 * @version Create Time：2019年6月25日 下午11:51:59 Description:
 * 
 */
public class sol083 {
	/*
	 * 第一次解法 执行用时 :10 ms, 在所有 Java 提交中击败了6.05%的用户 内存消耗 :37.9 MB, 在所有 Java
	 * 提交中击败了40.17%的用户
	 */
	public ListNode deleteDuplicates1(ListNode head) {
		Set<Integer> valSet = new LinkedHashSet<>();// 维护插入顺序
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
	 * 参考官方题解 注意到题目中链表已排序，只需要操作指针。
	 * 执行用时 :2 ms, 在所有 Java 提交中击败了87.49% 的用户 
	 * 内存消耗 :37.7MB, 在所有 Java 提交中击败了42.49%的用户
	 * 复杂度：时间：O(n)，空间：O(1)
	 */
	public ListNode deleteDuplicates2(ListNode head) {
		ListNode cur = head;
		while (cur != null || cur.next != null) {
			/*
			 * 错误的逻辑 if(cur.val==cur.next.val) { cur.next=cur.next.next; cur=cur.next; }
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
