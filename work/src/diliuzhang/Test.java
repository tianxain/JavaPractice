package diliuzhang;

import java.util.*;

public class Test {
	public static void main(String[] args)
	{
		HashSet<Person> hashset=new HashSet<Person>();
		
		Person person1=new Person("张三",11);
		Person person2=new Person("李四",12);
		Person person3=new Person("王五",13);
		hashset.add(person1);
		hashset.add(person2);
		hashset.add(person3);
		System.out.println(hashset);
	}
}
