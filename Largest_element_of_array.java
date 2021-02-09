package java_gfg_array;

public class Largest_element_of_array {
	static void largest(int arr[],int tot)
	{
		int k=0;
				for(int i=0;i<tot;i++)
				{
					if(arr[i]>k)
					{
						k=arr[i];
					}
				}
				System.out.println(k);
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,50,40};
		largest(arr,4);
		

	}

}
