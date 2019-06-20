package com.tce.leetcodeSolution;
/**
* @author tce E-mail:
* @version Create Time：2019年6月15日 下午10:44:13
* Description
*/
public class sol020 {
	public boolean isValid(String s) {
        char[] chs=new char[s.length()];
        int top=-1;//栈顶的位置
        for(int i=0;i<s.length();i++) {
            chs[++top]=s.charAt(i);
            if(top>0)
                if(chs[top-1]=='('&&chs[top]==')')
                    top-=2;
                else if(chs[top-1]=='['&&chs[top]==']')
                    top-=2;
                else if(chs[top-1]=='{'&&chs[top]=='}')
                    top-=2;
        }
        return top==-1;
    }
}
