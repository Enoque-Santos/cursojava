package entities;

public class Hahahahaha {

	private int number = 0;;
	private String holder;
	private double balance;
	
	
	
	public Hahahahaha(int number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}



	public Hahahahaha() {
		super();
		
	}



	@Override
	public String toString() {
		return "Hahahahaha [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}



	public int getNumber() {
		return number;
	}




	public String getHolder() {
		return holder;
	}



	public void setHolder(String holder) {
		this.holder = holder;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
