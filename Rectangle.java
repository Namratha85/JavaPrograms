package basicprograms;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		System.out.println("enter the breadth");
		int b=sc.nextInt();
		double a=l*b;
		System.out.println(a);

	}

}
