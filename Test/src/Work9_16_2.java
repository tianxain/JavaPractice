
public class Work9_16_2 {
	public static void main(String[] arg) {
		int i = 0;
		int j = 0;
		int temp = 0;
		int[] arr = new int[] { 25, 24, 12, 76, 101, 96, 28 };
		System.out.print("≈≈–Ú«∞£∫");
		for (i = 0; i < 7; i++) {
			System.out.print(arr[i] + " ");
		}
		for (j = 0; j < 6; j++) {
			for (i = 0; i < 6; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.print('\n' + "≈≈–Ú∫Û£∫");
		for (i = 0; i < 7; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
