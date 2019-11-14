package com.itheima;
import java.util.HashSet;
class Student {
	String id;
	String name;		    		 
	public Student(String id,String name) {	     // �������췽��
		this.id=id;
		this.name = name;
	}
	public String toString() {			         // ��дtoString()����
		return id+":"+name;
	}
    // ��дhashCode����
	public int hashCode() { 
		return id.hashCode();  // ����id���ԵĹ�ϣֵ
	}
    // ��дequals����
	public boolean equals(Object obj) { 
		if (this == obj) {    // �ж��Ƿ���ͬһ������
			return true;	  // ����ǣ�ֱ�ӷ���true
		}
		if (!(obj instanceof Student)) {	// �ж϶�����ΪStudent����
			return false;	 // ���������Student���ͣ�����false
		}
		Student stu = (Student) obj;	    // ������ǿתΪStudent����
	     boolean b = this.id.equals(stu.id);// �ж�idֵ�Ƿ���ͬ
		return	b;	         // �����жϽ��
	}

}
public class Example10 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();		           // ����HashSet����
		Student stu1 = new Student("1", "Jack");   // ����Student����
		Student stu2 = new Student("2", "Rose");
		Student stu3 = new Student("2", "Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}
}

