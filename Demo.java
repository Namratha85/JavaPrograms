package encapusulation;
// this will give security
// encapsulation=wraping data+binding data
public class Demo {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		Demo ob=new Demo();
		ob.setBalance(300000);
		System.out.println(ob.getBalance());

	}

}
