package Week2.day2;

import java.util.Iterator;

public class toFindPalindrome {

	public static void main(String[] args) {
		
		int num=34343;
		int temp =num;
		int a=0;
		int r;
		
		for (;num>0;num/=10)
		{
			r=num%10;
			a= (a*10)+r;
		}
		
		if(temp == a)
		{
			System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("the given number is not a palindrome");
		}
				}
}

	

