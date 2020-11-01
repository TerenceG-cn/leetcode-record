package com.tce.leetcodeSolution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sol394 {
    /*
    如果使用哈希集合存储元素，则可以在 O(1)O(1) 的时间内判断一个元素是否在集合中，从而降低时间复杂度。
    首先使用两个集合分别存储两个数组中的元素，然后遍历较小的集合，判断其中的每个元素是否在另一个集合中，
    如果元素也在另一个集合中，则将该元素添加到返回值。该方法的时间复杂度可以降低到 O(m+n)O(m+n)。
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
            set1.add(nums1[i]);
        for(int j=0;j<nums2.length;j++)
            set2.add(nums2[j]);
        return getIntersection(set1,set2);
    }

    private int[] getIntersection(Set<Integer> s1,Set<Integer> s2){
        if(s1.size()>s2.size()) return getIntersection(s2,s1);
        List<Integer> list=new ArrayList<>();
        int k=0;
        for (Integer i:s1) {
            if(s2.contains(i))
                list.add(i);
        }
        int[] result = list.stream().mapToInt(Integer::valueOf).toArray();//List-》数组 todo
        return result;
    }
}
