public class MetodosBanco {
	private String name;
	private double balance;

	public MetodosBanco(String name, double balance) {
		name = this.name;
		balance = this.balance;
	}

	public String getName(){
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double newDeposit) {
		setBalance(getBalance() + newDeposit);
	}

	public void withDraw(double newWithdraw) {
		setBalance(getBalance() - newWithdraw);
	}
}
