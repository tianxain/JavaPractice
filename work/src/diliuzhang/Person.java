package diliuzhang;

public class Person {
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.age=age;
		this.name=name;	
	}
	
	public String toString()
	{
		return name+":"+age+"岁";
	}
	
	public int HashCode()
	{
		return name.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		if(!(obj instanceof Person))
		{
			return false;
		}
		Person person=(Person)obj;
		boolean bool= this.name.equals(person.name);
		return bool;
	}
}
