package inheritance;
class Parent {
	public void properties() {
		System.out.println("child properties");
	}
}
class Child extends Parent{
	public void details() {
		System.out.println("aquried proerties from child class");
	}
}
public class InheritanceDemo1 {

	public static void main(String[] args) {

		Child ob =new Child();
		ob.properties();
		ob.details();
//		
//		 Parent ob1=new Parent();
//		 ob1.properties();
	}

}
