import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int grade = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("������һ���ɼ�Ϊ��");
			grade = in.nextInt();
			if (grade >= 90) {
				System.out.println("�óɼ�Ϊ�ţ�");
			} else if (grade >= 80) {
				System.out.println("�óɼ�Ϊ����");
			} else if (grade >= 70) {
				System.out.println("�óɼ�Ϊ�У�");
			} else if (grade >= 60) {
				System.out.println("�óɼ�Ϊ�");
				System.out.println("�óɼ�������");
			}
		}
	}
}
