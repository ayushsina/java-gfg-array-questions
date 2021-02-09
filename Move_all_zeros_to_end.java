package java_gfg_array;

public class Move_all_zeros_to_end {
	static void move(int arr[])
	{
		int n=arr.length;
		int count =0;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
			 temp=arr[i];
			 arr[i]=arr[count];
			 arr[count]=temp;
			 count++;
			  	
			}
			
		}
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j]);
		}
	}

	public static void main(String[] args) {
		int array[]= {10,15,20,14,0,45,0,14,0,78,0};
		move(array);
		
		

	}

}
