package practice;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = sum(4);
		System.out.println(temp);
	}

	public static int sum(int num) {
		if (num == 1) {
			return 1;
		}
		return factorial(num) + sum(num - 1);
	}

	public static int factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}
}
