package student;
interface Shape{
	double area(double n);
}
class Square implements Shape{
	public double area(double n) {
		return n*n;
	}
}
class Circle implements Shape{
	public double area(double n) {
		return 3.14*n*n;
	}
}
public class exercise4_6_2 {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square=new Square();
		Circle circle=new Circle();
		System.out.println("正方形的面积为："+square.area(2.0));
		System.out.print("圆的面积为："+circle.area(2.0));
		
	}

}
