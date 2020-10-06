package com.tce.leetcodeSolution;
/**
* @author tce E-mail:
* @version Create Time��2019��6��3�� ����11:22:31
* Description:
* ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�

��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������

ע���㲻���������Ʊǰ������Ʊ��

ʾ�� 1:

����: [7,1,5,3,6,4]
���: 5
����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
     ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�
ʾ�� 2:

����: [7,6,4,3,1]
���: 0
����: �����������, û�н������, �����������Ϊ 0��
*/
public class sol121 {
//	�д��Ľ���
//	ִ����ʱ : 349 ms, ��Best Time to Buy and Sell Stock��Java�ύ�л�����16.81% ���û�
//	�ڴ����� : 38.8 MB, ��Best Time to Buy and Sell Stock��Java�ύ�л�����36.69% ���û�
	public int maxProfit(int[] prices) {
        int result=0,tmp;
        for(int i=0;i<prices.length-1;i++) {
        	for(int j=i+1;j<prices.length;j++) {
                tmp=prices[j]-prices[i];
        		if(tmp<=0) continue;
        		result=result>tmp?result:tmp;
        	}
        }
        return result;
    }
}
