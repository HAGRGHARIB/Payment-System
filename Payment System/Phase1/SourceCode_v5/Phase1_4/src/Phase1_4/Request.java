package Phase1_4;

public class Request {
	private String name;
	private double amount;

	public Request(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
