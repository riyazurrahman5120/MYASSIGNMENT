package Week2.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
			for(int i=0;i<=arr.length-1;i++)
		{
				if(arr[i]!= (i+1))
				{
				     System.out.println("Missing number is "+(i+1));
					break;
				  
				}
			
		}

		
	}
}
		

