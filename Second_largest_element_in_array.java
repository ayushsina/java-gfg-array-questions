package java_gfg_array;

public class Second_largest_element_in_array {
	static void secondLarge(int arr[],int tot)
	{
		int large=0;
		int l=1;
		for(int i=0;i<tot;i++)
		{
			if(arr[i]>large)
			{
				
				large=arr[i];
			}
			else 
			{
				System.out.println("ayush");
				if(arr[i]>arr[l])
				{
					l=i;
				}
			}
		}
		System.out.println(l);
		
		
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		secondLarge(arr,5);
		

	}

}
