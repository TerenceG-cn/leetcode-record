package com.tce.leetcodeSolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sol445 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> longer = new ArrayList<Integer>();
		List<Integer> resList = new ArrayList<Integer>();
		ListNode cur = l1;
		do {
			list1.add(cur.val);
			cur = cur.next;
		} while (cur != null);
		cur = l2;
		do {
			list2.add(cur.val);
			cur = cur.next;
		} while (cur != null);

		Collections.reverse(list1);
		Collections.reverse(list2);
		int len1 = list1.size();
		int len2 = list2.size();
		int flag = 0;
		for (int i = 0; i < Math.min(len1, len2); i++) {
			int sum = list1.get(i) + list2.get(i) + flag;
			resList.add(sum % 10);
			flag = sum / 10;
		}

		if (len1 > len2)
			longer = list1;
		else if (len1 < len2)
			longer = list2;
		for (int j = Math.min(len1, len2); j < Math.max(len1, len2); j++) {
			int sum = longer.get(j) + flag;
			System.out.print(flag);
			resList.add(sum % 10);
			flag = sum / 10;
		}

		if (flag == 1) {
			resList.add(flag);
		}
		Collections.reverse(resList);

		ListNode res = new ListNode(0);
		cur = res;
		for (int val : resList) {
			cur.next = new ListNode(val);
			cur = cur.next;
		}

		return res.next;
	}
}
