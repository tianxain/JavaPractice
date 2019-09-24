package disanzhang;

public class Test {
public static void main(String []args) {
	Student stu1=new Student();
	Student stu2=new Student(90.0,"tianxian");
	stu1.setName("naodai");
	stu1.setScore(100.0);
	System.out.println("姓名："+stu1.getName());
	System.out.println("成绩："+stu1.getScore());
	System.out.println("姓名："+stu2.getName());
	System.out.println("成绩："+stu2.getScore());
}
}
