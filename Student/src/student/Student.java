package student;

public class Student {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String addr;
 
	public Student() {
		super();
	}
 
	public Student(int id, String name, int age,String sex,String addr) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.addr = addr;
		
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
 
	public String getSex() {
		return sex;
	}
 
	public void setSex(String sex) {
		this.sex = sex;
	}
 
	public String getAddr() {
		return addr;
	}
 
	public void setAddr(String addr) {
		this.addr = addr;
	}
 
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ",sex=" + sex + ", addr=" + addr;
	}
 
}
