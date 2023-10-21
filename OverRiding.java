package polymerphsim.edu;
//overriding is runtime polymorphsim
//when child class is not satisfied with parent method
class Parents{
	public void properties() {
		System.out.println("gold+money+land");
	}
	public void marry() {
		System.out.println("parents like thresiamma|sreelakshmi");
	}
}
class Child extends Parents{
	public void marry() {
		System.out.println("child likes sneha|neha|pooja|dhanya");
	}
}

public class OverRiding {

	public static void main(String[] args) {
		Parents p=new Parents();
		p.marry();
		
		Child c=new Child();
		c.marry();
		c.properties();
		
		Parents ob =new Child();
		ob.marry();
		ob.properties();
		
		
		

	}

}
