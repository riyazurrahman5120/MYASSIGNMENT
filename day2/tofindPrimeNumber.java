package Week2.day2;

public class tofindPrimeNumber {

	public static void main(String[] args) {
		
		int x=13;
		System.out.println("Enter the Number:");
		int count=0;
		
		
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(x+ " is a Prime Number");
     	}
			}
	}
      /* Only if the given value is divided by 1 and itself is called as prime number,
          so we divide the given value from inital declared value to given value by using for loop
          inside the for loop we checked that if the given value is divide by increment values
          then we use if condition outside the for loop,whether the count =2,then print it's prime number.
       */




