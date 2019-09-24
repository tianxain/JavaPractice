package disanzhang;

import java.util.Scanner;

public class Test2 {  
	 public static void main(String[] args) {
		     System.out.println("请输入要求的第多少个斐波那契数：");
		     Scanner scanner=new Scanner(System.in);
		     int n=scanner.nextInt();
             long num = fibonacci(n);
             System.out.println(num);
         
         
     } 
    public static long fibonacci(int n) {
        if(n==1) 
        	return 0;
        if(n==2||n==3) 
        	return 1;
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }       
        
}  
