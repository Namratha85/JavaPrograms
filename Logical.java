package OPERATORS;

public class Logical {

	public static void main(String[] args) {
		int x=40;
		int y=45;
		if (++x <40 | ++y >45)// check || && | &
		{
			x++;
		}
		else
		{
			y++;
		}
System.out.println("x="+x);
System.out.println("y="+y);

	}

}
