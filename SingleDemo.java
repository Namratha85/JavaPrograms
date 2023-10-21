package inheritance;
class Employee {
	public void name() {
		System.out.println("Shalini");
	}
}
class Salary extends Employee{
	public void salary() {
		System.out.println("Shalini salary is 30000");
	}
}
public class SingleDemo {

	public static void main(String[] args) {
	Salary ob=new Salary();
	ob.name();
	ob.salary();

	}

}
