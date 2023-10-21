package encapusulation;

class Bank{
	
	static String BranchName;
	private String BankName;
	private String Name;
	private String accountNo;
	private String ifscNo;
	private double balance;
	
	public void BranchName() {
		System.out.println("Branch name: Jayanagara 3rd block");
	}
	
	//constructor
	public Bank(String bankName, String name, String accountNo, String ifscNo, double balance) {
		super();
		BankName = bankName;
		Name = name;
		this.accountNo = accountNo;
		this.ifscNo = ifscNo;
		this.balance = balance;
	}
	
	//getter and setter 
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getIfscNo() {
		return ifscNo;
	}

	public void setIfscNo(String ifscNo) {
		this.ifscNo = ifscNo;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public double deposit(double amount) {
		return balance+=amount;
		
	}
	public double withdrow(double amount) {
		if(amount>balance) {
			System.out.println("!!!!!!!!!!Insufficent balance!!!!!!!!!!!!");
		}
		else {
			System.out.println("Thank you");
		}
		
		return balance-=amount;
		
	}
}

public class BankBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank ob= new Bank("SBI","Ashi","SBI11234532","SBI10024", 6000);
		ob.BranchName();
		System.out.println("Bank Name: "+ob.getBankName());
		System.out.println("Accountholder name: "+ob.getName());
		System.out.println("Account Number: "+ob.getAccountNo());
		System.out.println("IFSC NO: "+ob.getIfscNo());
		System.out.println("Current balance: "+ob.getBalance());
		System.out.println("Balance after deposit: "+ob.deposit(9000));
		
		System.out.println();
		
		Bank ob1= new Bank("SBI","Lisha","SBI17230532","SBI10024", 6000);
		ob1.BranchName();
		System.out.println("Bank Name: "+ob1.getBankName());
		System.out.println("Accountholder name: "+ob1.getName());
		System.out.println("Account Number: "+ob1.getAccountNo());
		System.out.println("IFSC NO: "+ob1.getIfscNo());
		System.out.println("Current balance: "+ob1.getBalance());
		System.out.println("Balance after withdraw: "+ob1.withdrow(3000));
		
		
		

	}

}