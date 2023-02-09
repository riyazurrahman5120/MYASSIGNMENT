package week1.day1;

public class MobileFunction {
	
	public void makeCall()
	{
		System.out.println("Mobile Specification");
		String mobileBrand = "Samsung";
		float mobileWeight = 160;
		System.out.println("My mobile is "+mobileBrand);
		System.out.println("MobileWeight is "+mobileWeight);
	}
	public void sendMsg()
	{
		boolean isFullCharged = true;
		long mobileCost = 13000;
		System.out.println("if charge is 100% "+isFullCharged);
		System.out.println("The cost is "+mobileCost);
	}

	public static void main(String[] args) {
		
		MobileFunction obj = new MobileFunction();
		System.out.println("This is my mobile");
	    obj.makeCall();
		obj.sendMsg();
				
		

	}

}
