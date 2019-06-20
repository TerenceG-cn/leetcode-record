package com.tce.leetcodeSolution;

public class sol598 {
	public int maxCount(int m, int n, int[][] ops) {
        int row=0,col=0;
        row=Math.min(m, find_minRow(ops));
        col=Math.min(n, find_minCol(ops));
        return row * col;
    }
	private int find_minRow(int [][]ops){
		int min=Integer.MAX_VALUE;
		for(int[] a:ops)
			min=min>a[0]?a[0]:min;
		return min;
	}
	private int find_minCol(int [][]ops){
		int min=Integer.MAX_VALUE;
		for(int[] a:ops)
			min=min>a[1]?a[1]:min;
		return min;
	}
}
//better Soulution
//class Solution {
//    public int maxCount(int m, int n, int[][] ops) {
//        if(ops.length==0)return m*n;
//        int min1=Integer.MAX_VALUE;
//        int min2=Integer.MAX_VALUE;
//        for(int i=0;i<ops.length;i++){
//            min1=Math.min(min1,ops[i][0]);
//            min2=Math.min(min2,ops[i][1]);
//        }
//        return min1*min2;
//    }
//}
