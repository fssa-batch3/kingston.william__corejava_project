package day04.solved;

class WithString {

	private String accNo;

	private String name;

	private double balance;

	// Default Constructor
	public WithString() {

	}

	// Creating a Constructor which accepts all the attributes: Constructor
	// Overloading
	public WithString(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
    public String toString() {
        return "Account [accNo=" + accNo + ", name=" + name + ", balance="  + balance + "]";
    }

}
