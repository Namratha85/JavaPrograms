package basicprograms;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num % 2==0)
			System.out.println("is even "+num);
		else
			System.out.println("is odd "+num);
	}

}
