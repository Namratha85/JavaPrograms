package constructor;

public class DemoEmployee {
	
	String Ename;
	int Age;
	int Salary;
	String Department;
	
	DemoEmployee(String Ename,int Age,int Salary,String Department){
		this.Ename=Ename;
		this.Age=Age;
		this.Salary=Salary;
		this.Department=Department;	
	}
	public static void main(String[] args) {
		DemoEmployee ob=new DemoEmployee("Namratha",22,40000,"Computer science");
		System.out.println(ob.Ename);
		System.out.println(ob.Age);
		System.out.println(ob.Salary);
		System.out.println(ob.Department);
		
		System.out.println();
		
		DemoEmployee ob1=new DemoEmployee("Rakesh",26,80000,"Testing");
		System.out.println(ob1.Ename);
		System.out.println(ob1.Age);
		System.out.println(ob1.Salary);
		System.out.println(ob1.Department);
		
		System.out.println();
		
		DemoEmployee ob2=new DemoEmployee("Shalini",24,30000,"Developer");
		System.out.println(ob2.Ename);
		System.out.println(ob2.Age);
		System.out.println(ob2.Salary);
		System.out.println(ob2.Department);
		
		System.out.println();
		
		DemoEmployee ob3=new DemoEmployee("Dhanush",25,45000,"Creative Head");
		System.out.println(ob3.Ename);
		System.out.println(ob3.Age);
		System.out.println(ob3.Salary);
		System.out.println(ob3.Department);
		
	}

}
