import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int grade = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("请输入一个成绩为：");
			grade = in.nextInt();
			if (grade >= 90) {
				System.out.println("该成绩为优！");
			} else if (grade >= 80) {
				System.out.println("该成绩为良！");
			} else if (grade >= 70) {
				System.out.println("该成绩为中！");
			} else if (grade >= 60) {
				System.out.println("该成绩为差！");
				System.out.println("该成绩不及格！");
			}
		}
	}
}
