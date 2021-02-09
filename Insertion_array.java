package java_gfg_array;

public class Insertion_array {
static void Insertion(int arr[],int n,int x,int cap,int pos) {
	if(n<cap)
	{
		for(int i=n-1;i>=pos;i--)
		{
			arr[n-1]=arr[i];
		}
		arr[pos]=x;
		for(int j=0;j<5;j++)
		{
			System.out.println(arr[j]);
			
		}
		
	
	}
	
	
	
}
public static void main(String[]arg)
{
	int arra[]=new int[5];
	arra[0]=10;
	arra[1]=200;
	arra[3]=30;
	Insertion(arra,3,20,5,1);
	
}
}
