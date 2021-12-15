
public class Testaccount2 {
	public static void main(String[]  args) {
		Accountsfactory factory = new Accountsfactory();
		
		Bank c1 = factory.openAccount("polo","Current");
		c1.summary();
		
		c1.withdraw(3000);
		c1.withdraw(5000);
		c1.summary();
		
		c1.deposit(2000);
		c1.deposit(3000);
		c1.summary();
		
		account a1 = c1;
		a1.withdraw(100);
		
		Saving s1 = new Savings("lili");
		account a2 = s1;
		
		Bank b = s1;
		s1.withdraw(100);
	}
}
