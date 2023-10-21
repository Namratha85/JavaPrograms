package inheritance;
class Company {
	public void name() {
		System.out.println("Shalini");
	}
}
class Ename extends Salary{
	public void salary(){
		System.out.println("Shalini salary is 20000");
	}
}
class Department extends Ename{
	public void department() {
		System.out.println("computer science");
	}
}
public class MultiDemo {
	

	public static void main(String[] args) {
		Department ob=new Department();
		ob.name();
		ob.salary();
		ob.department();

	}

}
