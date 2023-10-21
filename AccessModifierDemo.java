package com.edu1;

public class AccessModifierDemo {
	public static void display() { //static method
		System.out.println("static method");
	}
	public void display1() {
		System.out.println("public method");
	}
	public int addition(int a ,int b) {
		int sum=a+b;
		System.out.println("addition of two numbers is "+(a+b));
		return sum;
	}
	public int multiplication(int a ,int b) {
		int sum1 =a*b;
		System.out.println("multiplication of two numbers is "+(a*b));
		return sum1 ;
	}
	public int subtraction(int a ,int b) {
		int sum2=a-b;
		System.out.println("subtraction of two numbers is "+(a-b));
		return sum2;
	}
	public int division(int a ,int b) {
		int sum3=a/b;
		System.out.println("division of two numbers is "+(a/b));
		return sum3;
	}

	public static void main(String[] arg ){ 
		AccessModifierDemo ob =new AccessModifierDemo();
		ob.display1();
		display(); //static method
		ob.addition(30, 50);
		ob.multiplication(3,9);
		ob.subtraction(100, 50);
		ob.division(200, 20);
	}

}
