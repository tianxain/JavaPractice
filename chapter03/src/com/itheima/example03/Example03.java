package com.itheima.example03;
class Person{
	String name;
    int age;
	public void speak(){
		System.out.println("�ҽ�"+name+",����"+age+"����");
	}
}
public class Example03 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "����";
		p.age = -18;
		p.speak();
	}
}

