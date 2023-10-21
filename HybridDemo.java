package interfacedemo;
class Animal{
void eat()
{
	System.out.println("animal is eating");
}
}
interface Swimmer{
	void swim();
}
interface Flyer{
	void fly();
}
class Fish extends Animal implements Swimmer{

	@Override
	public void swim() {
		System.out.println("Fish is swimming");
		
	}
	
}
class Bird extends Animal implements Flyer{

	@Override
	public void fly() {
		System.out.println("Bird is flying");
		
	}
	
}
public class HybridDemo {

	public static void main(String[] args) {
		Fish ob=new Fish();
		ob.swim();
		Bird ob1=new Bird();
		ob1.fly();
	}

}
