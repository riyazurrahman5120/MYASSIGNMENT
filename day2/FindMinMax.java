package Week2.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		
		int max = 0;
		int min = 0;
		
  int arr[] = {22, 3981, -19, 82, 0, 45, 37};
  
    for (int i=0;i<arr.length;i++)
    {

	  if(arr[i] > max)
		{
			max = arr[i];
		}
	  else if(arr[i] < min)
	  {
		min  = arr[i];
	  }
    }
    System.out.println("Max value is :"+max);
    System.out.println("Min value is :"+min);
	}
}

		