package Bank;

public class Test {
	public static void main(String args[]){
		int amount=8000;
		ConstructionBank bank1=new ConstructionBank();
		bank1.saveMoney=amount;
		bank1.year=8.236;
		bank1.setIntersetRate(0.035);
		double interest1=bank1.computerInterset();
		BankOfDalian bank2=new BankOfDalian();
		bank2.saveMoney=amount;
		bank2.year=8.236;
		bank2.setIntersetRate(0.035);
		double interest2=bank2.computerInterset();
		System.out.println("两个银行利息相差"+(interest2-interest1)+"元");
	}

}
