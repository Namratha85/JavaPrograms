package BasicPrograms;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter 1st number ");
		int a =sc.nextInt();
		System.out.println("Enter the 2nd number ");
		int b =sc.nextInt();
		System.out.println(a);
		double area = (0.5*a*b);
		System.out.println(area);
		
		
	}

}
