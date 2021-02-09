package java_gfg_array;

public class Reverse_of_an_array {
	static void reverse(int array[])
	{
		int n=array.length;
		int l=n-1;
		for (int i=0;i<n/2;i++)
		{
			int temp=array[i];
			array[i]=array[l];
			array[l]=temp;
			l--;
			
		}
		
		for(int k=0;k<n;k++)
		{
			System.out.print(array[k]+" ");
		}
	}

	public static void main(String[] args) {
		int array[]= {10,15,20,25,30,40};
		reverse(array);

	}

}
