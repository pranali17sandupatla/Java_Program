//Creating array
/*class ArrayElement
{
	public static void main(String args[])
	{
		int arr1[]=new int[]{1,2,3,4,5,6,7};
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
*/

//Creating array and pritnt all total values of index
class ArrayElement
{
	public static void main(String args[])
	{
		int arr1[]=new int[]{10,20,3,4,5,6,7};
		int total = 0;
		for(int i=0;i<arr1.length;i++)
			
		{
			//System.out.println(arr1[i]);
			total += arr1[i]; // Add the value at each index to the total
			System.out.println("Total value of index :"+total);
			//System.out.println("index value of 2 :"+arr1[2]);

		}
	}
}


