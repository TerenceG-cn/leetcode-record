package com.tce.leetcodeSolution;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class sol316 {
    /**
     * 每次处理一个字符（最左最小字符)
     * @param s
     * @return
     */
    public String removeDuplicateLetters(String s) {
        int[] cnt =new int[26];//记录26个字母在字符串出现次数
        for(int i=0;i<s.length();i++)
            cnt[s.charAt(i)-'a']++;
        int pos=0;//记录最小左侧字符下标
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<s.charAt(pos)) pos=i;
            if(--cnt[s.charAt(i)-'a']==0) break;
        }
        return StringUtils.isBlank(s)?"":s.charAt(pos)+ removeDuplicateLetters(
                s.substring(pos + 1).replaceAll("" + s.charAt(pos), "")//删除后续子串中所有s.charAt(pos)
        );
    }
    public String removeDuplicateLetters2(String s) {// TODO: 2020/8/9 flag不能正确表示 
        boolean[] flag=new boolean[26];
        for(int i=0;i<26;i++)
            flag[i]=false;
        HashMap<Character,Integer> last_occ=new HashMap<>();
        for(int i=s.length()-1;i>=0;i--)
            if(!last_occ.containsKey(s.charAt(i)))
                last_occ.put(s.charAt(i), i);
        Deque<Character> stack=new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!flag[c-'a']){
                while (!stack.isEmpty() && c < stack.peek() && last_occ.get(stack.peek()) > i) {
                    stack.pop();
                    flag[c-'a']=false;
                }
            }
            stack.push(c);
            flag[c-'a']=true;
        }
        StringBuilder sb = new StringBuilder(stack.size());
        for (Character c : stack) sb.insert(0,c.charValue());
        return sb.toString();
    }
}
