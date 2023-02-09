package Week2.day2;

public class Fibonacci {

	public static void main(String[] args) {
	
	        int t1 = 0, t2 = 1;
	        int sum=0;
	     
	        for (int i = 1; i <= 8; i++)
	        {
	        	System.out.print(t1 + " ");
	             sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }

	}

}
