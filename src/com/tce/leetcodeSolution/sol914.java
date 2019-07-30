package com.tce.leetcodeSolution;

import java.util.HashMap;
import java.util.Map;

public class sol914 {
	public static boolean hasGroupsSizeX(int[] deck) {
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for (int i = 0; i < deck.length; i++) {
			if (maps.containsKey(deck[i]))
				maps.put(deck[i], maps.get(deck[i]) + 1);
			else
				maps.put(deck[i], 1);

		}

		if (deck.length < 2)
			return false;
		if (maps.values().size() < 2)
			return true;

		int n1 = maps.get(deck[0]), n2 = 1;
		for (Integer val : maps.values()) {
			n2 = val;
			n1 = get_gcd(n1, n2);
		}
		return n1 >= 2;
	}

	private static int get_gcd(int n1, int n2) {//求最大公约数
		int gcd = 0;
		if (n1 < n2) {// 交换n1、n2的值
			n1 = n1 + n2;
			n2 = n1 - n2;
			n1 = n1 - n2;
		}

		if (n1 % n2 == 0) {
			gcd = n2;
		}

		while (n1 % n2 > 0) {
			n1 = n1 % n2;

			if (n1 < n2) {
				n1 = n1 + n2;
				n2 = n1 - n2;
				n1 = n1 - n2;
			}

			if (n1 % n2 == 0) {
				gcd = n2;
			}
		}
		return gcd;

	}
}
