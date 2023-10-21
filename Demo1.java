package encapusulation;

class Person {
	private String name;
	private int age;
	

	public void Demo1(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


}
public class Demo1 {
	
	
	public static void main(String[] args) {
		Person ob=new Person("nivea",10);
		
		System.out.println("name:"+ob.getName());
		System.out.println("age:"+ob.getAge());
		
		ob.setName("bob");
		ob.setAge(12);
		
		System.out.println("updated name:"+ob.getName());
		System.out.println("updates age:"+ob.getAge());
		
	}

}
