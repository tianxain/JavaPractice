package student;

class test_lk{
	String name;
	int age;
	public test_lk() {
		
	}
	public test_lk(String name1,int age1) {
		name=name1;
		age=age1;
	}
	void show()
	{
		System.out.print(name+"  ");
		System.out.print(age+"  ");
	}	
}
class Undergraduate extends test_lk{
	String degree;
	public Undergraduate() {
		
	}
	public Undergraduate(String name2,int age2,String degree2) {
		super(name2,age2);
		degree=degree2;
	}
	void show()
	{
		super.show();
		System.out.println(degree);
	}	
	
}
public class exercise4_6_1 {
  public static void main(String[] args) {
	  test_lk stu1=new test_lk("十七",17);
	  Undergraduate stu2=new Undergraduate("十八",18,"研究生");
	  stu1.show();
	  System.out.print('\n');
	  stu2.show();
	 // System.out.println("hello");
  }
}
