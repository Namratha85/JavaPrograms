package basicprograms;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
			System.out.println("enter the 1st number");
			int a=sc.nextInt();
			System.out.println("enter the 2nd number");
			int b=sc.nextInt();
			System.out.println(a<60 & a<b);
	}
}
