package polymerphsim.edu;
class Construct{
	Construct(){
		System.out.println("no arg constructor");
	}
	Construct(int a){
		System.out.println("one arg constructor");
	}
	Construct(int b,int a){
		System.out.println("two args constructor");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Construct ob=new Construct();
		Construct ob1=new Construct(12);
		Construct ob2 = new Construct(12,23);
		

	}

}
