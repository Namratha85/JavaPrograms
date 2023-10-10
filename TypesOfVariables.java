package ecom.edu;
// single line
/* multi line */

//local
//instance to access instance variable we need to create object 
//static 

class Test{
	static int a=30;
}
class Test1{
	static int a=40;
	int b=50;
}
public class TypesOfVariables {
	int a=20;

	public static void main(String[] args) {
		//classname objectname= new ty
		Test1 ob=new Test1();
		TypesOfVariables ob=new TypesOfVariables();
		int a=10; // local variable
		System.out.println(a);
		System.out.println(ob.a);
		System.out.println(Test.a);
		System.out.println(Test1.a);
	}

}
