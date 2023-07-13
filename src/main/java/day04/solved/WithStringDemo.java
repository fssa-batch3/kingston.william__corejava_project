package day04.solved;

public class WithStringDemo {
	public static void main(String[] args) {
		// create Account using Setter methods and Default constructor
		WithString acct1 = new WithString();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);
		
		System.out.println(acct1);
	}
}