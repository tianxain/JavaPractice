package disizhang;

public class Undergraduate extends Student {
	protected String degree;

	public Undergraduate(String name, int age,String degree) {
		super(name, age);
		this.name=name;
    	this.age=age;
    	this.degree=degree;
	}
	void show()
    {
    	System.out.println("name:"+this.name);
    	System.out.println("age:"+this.age);
    	System.out.println("degree:"+this.degree);
    }
}
