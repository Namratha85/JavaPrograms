package polymerphsim.edu;
//overloading class having two methods having same name but different parameters

class Demo1{
	public void add() {
		System.out.println("1st method");
	}
	public void add(int a) {
		System.out.println("2nd method: "+(a+a));
	}
	public void add(int b,int c) {
		System.out.println("3rd method:"+(b+c));
	}
	public void add(float a,int d) {
		System.out.println("4th method: "+(a+d));
	}
	public void add(int a,float b) {
		System.out.println("5th method:"+(a+b));
	}
}

public class PolymerphsimDemo1 {
	

	public static void main(String[] args) {
		Demo1 ob=new Demo1();
		ob.add();
		ob.add(12);
		ob.add(20, 30);
		ob.add(4.2f, 20);
		ob.add(20, 4.2f);

	}

}
