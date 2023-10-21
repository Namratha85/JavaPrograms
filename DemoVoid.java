package com.edu1;

public class DemoVoid {
	public void addition(int a ,int b) {
		int sum=a+b;
		System.out.println("addition of two numbers is "+sum);
	}
		public void subratction(int a ,int b) {
			int sum1=a-b;
			System.out.println("subraction of two numbers is "+sum1);
		}
		
			public void multiplication(int a ,int b) {
				int sum2=a*b;
				System.out.println("multiplication of two numbers is "+sum2);
			}
				public void division(int a ,int b) {
					int sum3=a/b;
					System.out.println("division of two numbers is "+sum3);
				}

	public static void main(String[] args) {
		DemoVoid ob=new DemoVoid();
		ob.addition(10, 20);
		ob.subratction(100,27);
		ob.multiplication(30,7);
		ob.division(200, 2);
	}

}
