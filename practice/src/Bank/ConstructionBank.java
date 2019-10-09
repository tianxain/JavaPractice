package Bank;

public class ConstructionBank extends Bank{
	double year;
	public double computerInterset(){
		super.year=(int)year;
		double r=year-(int)year;
		int day=(int)(r*1000);
		double yearInterest=super.computerInterset();
		double dayInterest=day*0.0001*saveMoney;
		interest=yearInterest+dayInterest;
		System.out.println(saveMoney+"元钱存在建设银行"+super.year+"年"+day+"天的利息为："+interest+"元");
		return interest;
	}
}
