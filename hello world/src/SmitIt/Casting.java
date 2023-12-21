package SmitIt;
import java.util.Scanner;
public class Casting {
	Scanner sc= new Scanner(System.in);
	void add()
	{
		System.out.println("value 1: ");
		int a = sc.nextInt();
		System.out.println("value 2: ");
		int b = sc.nextInt();
		System.out.println(a+b);
	}
	void multi()
	{
		System.out.println("value 1: ");
		int a = sc.nextInt();
		System.out.println("value 2: ");
		int b = sc.nextInt();
		System.out.println(a*b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casting obj1 = new Casting();
		obj1.add();
		obj1.multi();
	     }

}
