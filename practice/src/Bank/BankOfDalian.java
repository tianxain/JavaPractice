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
		System.out.println(saveMoney+"ԪǮ���ڴ�������"+super.year+"��"+day+"�����ϢΪ��"+interest+"Ԫ");
		return interest;
	}
}
