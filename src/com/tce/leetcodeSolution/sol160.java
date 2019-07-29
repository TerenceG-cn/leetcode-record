package com.tce.leetcodeSolution;

import java.util.HashSet;
import java.util.Set;

public class sol160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> list=new HashSet<ListNode>();
		while(headA!=null) {
			list.add(headA);
			headA=headA.next;
		}
		while(headB!=null) {
			if(list.contains(headB))
				return headB;
			
			headB=headB.next;
		}
		return null;
	}
}
