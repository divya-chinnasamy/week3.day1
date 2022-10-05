package week3.day1;

public class AxisBank extends BankInfo{

	public void deposit()  {
		System.out.println("This is deposit method from AxisBank");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab = new AxisBank();
		ab.savings();
		ab.fixed();
		ab.deposit();
		ab.deposit();
	}

}
