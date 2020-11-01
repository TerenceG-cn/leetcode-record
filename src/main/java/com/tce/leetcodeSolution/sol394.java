package com.tce.leetcodeSolution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sol394 {
    /*
    ���ʹ�ù�ϣ���ϴ洢Ԫ�أ�������� O(1)O(1) ��ʱ�����ж�һ��Ԫ���Ƿ��ڼ����У��Ӷ�����ʱ�临�Ӷȡ�
    ����ʹ���������Ϸֱ�洢���������е�Ԫ�أ�Ȼ�������С�ļ��ϣ��ж����е�ÿ��Ԫ���Ƿ�����һ�������У�
    ���Ԫ��Ҳ����һ�������У��򽫸�Ԫ����ӵ�����ֵ���÷�����ʱ�临�Ӷȿ��Խ��͵� O(m+n)O(m+n)��
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
        int[] result = list.stream().mapToInt(Integer::valueOf).toArray();//List-������ todo
        return result;
    }
}
