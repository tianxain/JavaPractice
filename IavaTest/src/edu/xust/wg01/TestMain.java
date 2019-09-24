package edu.xust.wg01;

public class TestMain {
	public static void main(String[] args) {
		Driver dr = new Driver();
		Vehicle ve = new Vehicle();
		Destination de = new Destination();
		dr.setName("薛燕");
		ve.setName("腿");
		de.setName("临潼");
		System.out.println(dr.getName() + "用" + ve.getName() + "哒哒哒的去" + de.getName() + "!");

	}
}
