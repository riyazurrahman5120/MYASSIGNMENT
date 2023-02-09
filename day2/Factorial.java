package Week2.day2;

public class Factorial {

	public static void main(String[] args) {
		
		int n=5;
		int i;
		int a=1;
		
		for(i=1;i<=n;i++)
		{
			 a = a*i;
		}
		System.out.println("Factorial of "+n+ "is" +a);

	}

}
