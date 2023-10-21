package interfacedemo;
//interface is blueprint of a class
// cannot create object for interface
//complete 100% abstraction in interface	
// 2 parent one child(multiple inheritance)
// interface will not allow u to write normal method inside interface
interface Parent1{
	public void parent1Method();	
	}
interface Parent2{
	abstract void parent2Method();
}
class Child implements Parent1,Parent2{

	@Override
	public void parent2Method() {
		System.out.println("Child class extends Parent2");
		
	}

	@Override
	public void parent1Method() {
		System.out.println("Child class extends Parent1");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.parent1Method();
		ob.parent2Method();

	}

}
