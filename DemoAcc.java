package com.edu1;
class Demo {
public void display() {
	System.out.println("public meth");
}
protected void display() {
	System.out.println("prot meth");
}
private void display() {
	System.out.println("private meth"); // cannot be accessed here
}
}
public class DemoAcc {
private void display3() {
	System.out.println("private meth");
}

	public static void main(String[] args) {
		Demo ob=new Demo();
		ob.display();
		DemoAcc ob1=new DemoAcc();
		ob1.display3();
		ob.display();

	}

}
