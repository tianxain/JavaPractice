package com.itheima;
import java.util.Random;
public class Example16 {
	public static void main(String[] args) {
        Random r = new Random();
		System.out.println("����boolean���͵��������"
		                        + r.nextBoolean());
		System.out.println("����double���͵��������"
		                        + r.nextDouble());
		System.out.println("����float���͵��������"
                                 + r.nextFloat());
		System.out.println("����int���͵��������"
                                 + r.nextInt());
		System.out.println("����0��10֮��int���͵��������"
                                 + r.nextInt(10));
		System.out.println("����long���͵��������"
                                 + r.nextLong());
	}
}

