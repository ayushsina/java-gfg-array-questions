package java_gfg_array;

public class Deletion_array {
	static void Delete(int arr[],int num,int tot)
	
	{
		int i;
		for( i=0;i<tot;i++)
		{
			if(arr[i]==num)
			{
				break;
			}
			
		}
		for(int j=i;j<tot;j++)
		{
			arr[j]=arr[j+1];
		}
		for(int k=0;k<tot;k++)
		{
			System.out.println(arr[k]);
		}
		
	}

	public static void main(String[] args) {
		int arr []= {10,50,500,20,40,60};
		Delete(arr,500,5);
		
		

	}

}
