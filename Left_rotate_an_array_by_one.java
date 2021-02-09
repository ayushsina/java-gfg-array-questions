package java_gfg_array;

public class Left_rotate_an_array_by_one {
	static void rotate(int array[])
	{
		int n =5;
		int temp=array[0];
		for(int i=0;i<n-1;i++)
		{
			array[i]=array[i+1];
		}
		array[n-1]=temp;
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		rotate(array);

	}

}
