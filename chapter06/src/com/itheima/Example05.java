package com.itheima;
public class Example05 {
	static String[] strs = { "aaa", "bbb", "ccc" };
	public static void main(String[] args) {
		// 1��foreachѭ����������
		for (String str : strs) {
			str = "ddd";
		}
		System.out.println("foreachѭ���޸ĺ������:" + strs[0] + ","
                                 + strs[1] + "," + strs[2]);
		// 2��forѭ����������
		for (int i = 0; i < strs.length; i++) {
			strs[i] = "ddd";
		}
		System.out.println("��ͨforѭ���޸ĺ������:" + strs[0] + ","
                               + strs[1] + "," + strs[2]);
	}
}


