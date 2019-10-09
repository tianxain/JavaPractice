package Bank;

public class Bank {
	int saveMoney;
	int year;
	double interest;
	double interestRate=0.29;
	public double computerInterset(){
		interest=year*interestRate*saveMoney;
		return interest;
	}
	public void setIntersetRate(double rate){
		interestRate=rate;
	}
}
