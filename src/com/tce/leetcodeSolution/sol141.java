package com.tce.leetcodeSolution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tce E-mail:
 * @version Create Time：2019年6月30日 下午2:15:21 Description:官方题解
 */
public class sol141 {
	public boolean hasCycle(ListNode head) {// 哈希表
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
	 * 执行用时 :14 ms, 在所有 Java 提交中击败了16.34% 的用户 
	 * 内存消耗 :41.4 MB, 在所有 Java提交中击败了15.19%的用户
	 */
	public boolean hasCycle2(ListNode head) {// 快慢指针
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
	 * 执行用时 :1 ms, 在所有 Java 提交中击败了93.68%的用户
	 * 内存消耗 :39.8 MB, 在所有 Java 提交中击败了46.58%的用户
	 */
}
