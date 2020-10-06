package com.tce.leetcodeSolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sol697 {

	public static int findShortestSubArray(int[] nums) {
//		Integer[] numCount = new Integer[10];
//		//int[] numCount=new int[10];
//		for(int i=0;i<nums.length;i++) {
//			switch(nums[i]) {
//			case 0: numCount[0]++;
//			case 1: numCount[1]++;
//			case 2: numCount[2]++;
//			case 3: numCount[3]++;
//			case 4: numCount[4]++;
//			case 5: numCount[5]++;
//			case 6: numCount[6]++;
//			case 7: numCount[7]++;
//			case 8: numCount[8]++;
//			case 9: numCount[9]++;
//			}
//		}
//		int intArrayFreq=(int)Collections.max(Arrays.asList(numCount));//数组的频度
		List<Integer> maxNums = new ArrayList<>();// maxNumber记录频率最大的几个数
		Map<Integer, Integer> freq = new HashMap<>();// fre记录数的频率
		Map<Integer, int[]> degree = new HashMap<>();// degree记录每个数出现的初始位置和最新位置
		int max = Integer.MIN_VALUE;//频度最高的数
		int min=Integer.MAX_VALUE;//最短连续子数组长度
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			System.out.println("n="+n);
			int f = freq.containsKey(n) ? freq.get(n)+1 : 1;//erro
			System.out.println("f="+f);
			if (f > freq.getOrDefault(max, 0)) {
				max = n;
				maxNums.clear();
				maxNums.add(max);
				//System.out.println("111");
			}
			if (f == freq.getOrDefault(max, 0)) {
				max = nums[i];
				maxNums.add(max);
				System.out.println("...");
			}
			freq.put(n, f);
			// int d = degree.getOrDefault(nums[i], new int[]{i, i})[0];
			int[] d = degree.containsKey(n) ? degree.get(n) : new int[] { i, i };
			degree.put(n, new int[] { d[0], i });
			System.out.println("d[]=["+degree.get(n)[0]+","+degree.get(n)[1]+"]");
		}
		for(int mn:maxNums) {
			System.out.println(mn);
			int len=degree.get(mn)[1]-degree.get(mn)[0]+1;
			min=(len<min)?len:min;
			System.out.println("最短距离="+min);
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,1,2,1,3,3,3,1,3,1,3,2};
		findShortestSubArray(a);
		
	}
}
