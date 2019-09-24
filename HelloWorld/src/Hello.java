public class Hello {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setInfo("tianxian", '男', true, 90, 92, 91.0);
		System.out.println("name:" + stu.name);
		System.out.println("sex:" + stu.sex);
		System.out.println("srgister:" + stu.srgister);
		System.out.println("javaNormalScore:" + stu.javaNormalScore);
		System.out.println("javaMidScore:" + stu.javaMidScore);
		System.out.println("javaFinalScore:" + stu.javaFinalScore);
	}
}

class Student {
	String name;
	char sex;
	boolean srgister;
	int javaNormalScore;
	float javaMidScore;
	double javaFinalScore;

	public void setInfo(String name, char sex, boolean srgister, int javaNormalScore, float javaMidScore,
			double javaFinalScore) {
		this.name = name;
		this.sex = sex;
		this.srgister = srgister;
		this.javaNormalScore = javaNormalScore;
		this.javaMidScore = javaMidScore;
		this.javaFinalScore = javaFinalScore;
	}

}
