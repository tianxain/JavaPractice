package disizhang;

public class Test2 {
	public static void main(String []args) {
		Square square=new Square();
		Circle circle=new Circle();
		System.out.println("边长为2的正方形面积为："+square.area(2.0));
		System.out.println("半径为3的圆面积为："+circle.area(2.0));
	}
}
