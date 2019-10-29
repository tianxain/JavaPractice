package disizhang;

public class Student {
	protected String name;
	protected int age;
    public Student(String name,int age)
    {
    	this.name=name;
    	this.age=age;
    }
    void show()
    {
    	System.out.println("name:"+this.name);
    	System.out.println("age:"+this.age);
    }
}
