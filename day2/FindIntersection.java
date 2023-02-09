package Week2.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		  int arr[] = {3, 2, 11, 4, 6, 7};
		  int b[] = {1, 2, 8, 4, 9, 7};
		  int j;
		  for(int i=0;i<arr.length;i++)
		  {
			  for(j=i;j<b.length;j++)
			  {
				  if(arr[i]==b[j])
				  {
					 System.out.println("the same value in first array "+arr[i]);
				  }
			  }
				  
		  }
	}

}
