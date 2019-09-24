package JavaAPI;

public class Api {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = new String();
		String str3 = new String("ab");
		char[] charArray1 = new char[] { 'a', 'b', 'c' };
		String str4 = new String(charArray1);
		String str5 = "  a b c d e f g h ";
		String str6 = "羽毛球-乒乓球-篮球";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("字符串的长度为：" + str1.length());
		System.out.println("字符串中第一个字符：" + str1.charAt(0));
		System.out.println("字符h第一次出现的位置：" + str1.indexOf('h'));
		System.out.println("字符h最后一次出现的位置" + str1.lastIndexOf('h'));
		System.out.println("将字符串转换为字符数组后的结果为：");
		char[] charArray = str1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray.length - 1 != i) {
				System.out.print(charArray[i] + ",");
			} else {
				System.out.println(charArray[i]);
			}
		}
		System.out.println("将int型转换为String类型之后：" + String.valueOf(12));
		System.out.println("将字符串转换为大写之后的结果：" + str1.toUpperCase());
		System.out.println("将abcd替换成dcba的结果为：" + str1.replace("abcd", "dcba"));
		System.out.println(str5);
		System.out.println(str5.trim());
		System.out.println(str5.replace(" ", ""));
		System.out.println("判断字符串是否以ab开头：" + str1.startsWith("ab"));
		System.out.println("判断字符串是否以cd结尾：" + str1.endsWith("cd"));
		System.out.println("判断字符串是否包含bc：" + str1.contains("bc"));
		System.out.println("判断字符串是否为空：" + str2.isEmpty());
		System.out.println("从第五个字符截取到末尾的结果：" + str6.substring(5));
		System.out.println("从第五个字符截取到第六个字符的结果：" + str6.substring(4, 6));
		System.out.print("分割后字符串数组中的元素依次为：");
		String[] strArray = str6.split("-");
		for (int i = 0; i < strArray.length; i++) {
			if (strArray.length - 1 != i) {
				System.out.print(strArray[i] + ",");
			} else {
				System.out.println(strArray[i]);
			}
		}
	}
}
