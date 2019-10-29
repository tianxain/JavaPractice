package diwuzhang;

public class Test {
	public static void main(String [] args) {
		String s="AaBbCcDd";
		char[] charArray=s.toCharArray();		
		StringBuffer str=new StringBuffer();
		int i=0;
		String c;
		for(i=charArray.length-1;i>=0;i--)
		{
			
			if(charArray[i]>='A'&&charArray[i]<='Z')
			{
				c=String.valueOf(charArray[i]).toLowerCase();
				str.append(c);
			}
			else if(charArray[i]>='a'&&charArray[i]<='z')
			{
				
				c=String.valueOf(charArray[i]).toUpperCase();
				str.append(c);
			}
			else
			{
				str.append(charArray[i]);
			}
		}
		System.out.println("输出前："+s);
		System.out.println("变换后："+str);
	}
}
