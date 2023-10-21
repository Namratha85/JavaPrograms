package polymerphsim.edu;
class Demo1 {
	public void add() {
		System.out.println("first method");
	}
	public void add(int a) {
		System.out.println("2nd method");
	}
	public void add(float a) {
		System.out.println("3rd method");
	}
}
public class Demo {

	public static void main(String[] args) {
		Demo1 ob=new Demo1();
		ob.add();
		ob.add(20);
		ob.add();

	}

}
