package com.itheima;
import java.util.HashSet;
public class Example09 {
	public static void main(String[] args) {
		HashSet set = new HashSet();     // 创建HashSet集合
		set.add("Jack");                 // 向该Set集合中添加元素
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");                // 向该Set集合中添加重复元素 
		// 遍历输出Set集合中的元素
		set.forEach(o -> System.out.println(o));
	}
}
