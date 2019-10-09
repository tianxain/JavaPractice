package Bank;

public class BankOfDalian extends Bank{
	double year;
	public double computerInterset(){
		super.year=(int)year;
		double r=year-(int)year;
		int day=(int)(r*1000);
		double yearInterest=super.computerInterset();
		double dayInterest=day*0.00012*saveMoney;
		interest=yearInterest+dayInterest;
		System.out.println(saveMoney+"元钱存在大连银行"+super.year+"年"+day+"天的利息为："+interest+"元");
		return interest;
	}
}
