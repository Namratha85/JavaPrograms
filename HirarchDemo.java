package inheritance;
class A1{
	int a=10;
	void display() {
		System.out.println(" A1 is parent class");
	}
}
class B1 extends A{
	int b=20;
	void show() {
		System.out.println("B1 is child class of A");
	}
}
class C1 extends A{
	int c=30;
	void view() {
		System.out.println("C1 is child class of A");
	}
}
public class HirarchDemo {

	public static void main(String[] args) {
// create object for both the child class
		C1 ob=new C1();
		ob.display();
		ob.view();
		
		B1 ob1= new B1();
		ob1.show();
		ob1.display();
		
	}

}