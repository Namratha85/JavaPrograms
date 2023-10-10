package OPERATORS;

public class TernaryOperator {

	public static void main(String[] args) {
//		int a=10;
//		int b=20;
//		int c=(a < b) ? a:b;
//	System.out.println(c);
		
		int a=10;
		int b=50;
		int c=30;
		int d=100;
		int r=120;
		int Max = (a>b && a>c && a>d && a>r)?a:(b>a && b>c && b>d && b>r)?b:(c>a && c>b && c>d && c>r)?c:(d>a && d>b && d>c && d>r)?d : r;
		System.out.println("largest number is "+Max);
				 
	}

}



