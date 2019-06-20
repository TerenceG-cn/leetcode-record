package com.tce.leetcodeSolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
* @author tce E-mail:
* @version Create Time：2019年6月16日 下午12:48:07
* Description
*/
public class sol023 {
	public ListNode mergeKLists(ListNode[] lists) {
		int len = 0;
		List<Integer> vals = new ArrayList<>();
		for (int i = 0; i < lists.length; i++) {
			ListNode node = lists[i];
			while (node != null) {
				len++;
				vals.add(node.val);
				node = node.next;
			}
		}
		Collections.sort(vals);

		ListNode result = new ListNode(0);
		ListNode head = result;
		for (Integer i : vals) {
			System.out.println(i);
			result.val = i.intValue();
			result = result.next;
		}

		return head;
	}
}
