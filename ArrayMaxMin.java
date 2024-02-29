//creating min max array 
class ArrayMaxMin
{
	public static void main(String args[])
	{
		int arr1[]=new int[]{10,20,30,40,50,66,70};//declaring array or initialization 
		int min = arr1[0];
        int max = arr1[0];
		for(int i=0;i<arr1.length;i++)
		{
			if (arr1[i] < min) 
			{
                min = arr1[i];
			}
			if (arr1[i] > max) 
			{
                max = arr1[i];
			}
		}
			System.out.println("Minimum value :" + min);
			System.out.println("Maximum value :" + max);
	}
}