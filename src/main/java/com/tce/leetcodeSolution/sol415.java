package com.tce.leetcodeSolution;
/**
* @author tce E-mail:
* @version Create Time：2019年6月15日 下午4:11:31
* Description:
* 执行用时 :15 ms, 在所有Java提交中击败了41.75%的用户
* 内存消耗 :38.1 MB, 在所有Java提交中击败了73.85%的用户
*/
public class sol415 {
    public String addStrings(String num1, String num2) {
        int flag=0;
        StringBuffer s=new StringBuffer();
        for(int i=0;i<num1.length()||i<num2.length();i++){    
            int n1 = (i<num1.length()?Integer.parseInt(String.valueOf(num1.charAt(num1.length()-i-1))):0);
            int n2 = (i<num2.length()?Integer.parseInt(String.valueOf(num2.charAt(num2.length()-i-1))):0);
            s.append((n1+n2+flag)%10);
            flag=(n1+n2+flag)/10;
        }
        if(flag!=0) s.append(flag);
        return s.reverse().substring(0);
    }
}