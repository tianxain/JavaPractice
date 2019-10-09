
public class Test {
	public static void main(String args[]){
		ChinaPeople chinaPeople=new ChinaPeople();
		AmericanPeople americanPeople=new AmericanPeople();
		BeijingPeople beijingPeople=new BeijingPeople();
		chinaPeople.speakHello();
		americanPeople.speakHello();
		beijingPeople.speakHello();
		chinaPeople.averageHeight();
		chinaPeople.averageWeight();
		americanPeople.averageHeight();
		americanPeople.averageWeight();
		beijingPeople.averageHeight();
		beijingPeople.averageWeight();
		chinaPeople.chinaGongfu();
		americanPeople.americanBoxing();
		beijingPeople.beijingOpera();
		beijingPeople.chinaGongfu();
	}
}
