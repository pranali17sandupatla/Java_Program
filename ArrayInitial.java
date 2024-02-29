//Array initialization
class ArrayInitial
{
	public static void main(String args[])
	{
		int arr1[]=new int[5];//Declaring an Array
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		
		for(int i=0;i<5;i++)//we are printing the array using for loop
		{
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
	}
}