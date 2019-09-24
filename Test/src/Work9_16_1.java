
public class Work9_16_1 {
	public static void main(String[] arg) {
		int i = 1;
		int sum = 0;
		for (i = 1; i <= 99; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("sum=" + sum);
	}
}
