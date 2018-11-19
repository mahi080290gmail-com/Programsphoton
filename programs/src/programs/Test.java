package programs;
abstract class Test1
{
	public static void m1()
	{
		System.out.println("m1");
	}
	abstract public  void m2();
	
}
class Test2 extends Test1
{

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	
}
public class Test {

	public static void main(String[] args) {
		

	}

}
