package com.tce.leetcodeSolution;

/**
 * @author tce E-mail:
 * @version Create Time：2019年7月7日 上午8:10:40 
 * Description:
 * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗 :34.7 MB, 在所有 Java 提交中击败了40.02%的用户
 */
public class sol876 {
	public ListNode middleNode(ListNode head) {//快慢指针
		ListNode fast = head;
		ListNode slow = head;
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
}
