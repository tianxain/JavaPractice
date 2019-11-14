package com.itheima.example26;
//����һ������ʽ�ӿ�
@FunctionalInterface
interface PersonBuilder {
	Person buildPerson(String name);
}
//����һ��Person�࣬������вι��췽��
class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
//���������
public class Example26 {
	public static void printName(String name, PersonBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
	}
	public static void main(String[] args) {
		// ʹ��Lambda���ʽ��ʽ
		printName("����ӱ", name -> new Person(name));
		// ʹ�ù��������õķ�ʽ
		printName("����ӱ", Person::new);
	}
}


