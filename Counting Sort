//following code contains the pseudo code for counting sort. the range of the count array is static and small. change according to desire
//the program is in JAVA

public class CountingSort {
	
	static void countingSort(int[] arr)
	{
		int n = arr.length;
		int[] output = new int[n];
		int [] count = new int[20];
		for(int i = 0;i<20;++i) //initializing count array
			count[i]=0;
		for(int i = 0; i<n ; ++i) //storing count for characters
			++count[arr[i]];
		for(int i = 1; i<=19; ++i) //assigning actual position of characters
			count[i]+=count[i-1];
		for(int i = 0; i<n ; ++i)
		{
			output[count[arr[i]]-1] = arr[i];
			--count[arr[i]];
		}
		for(int i=0;i<n;++i)
			arr[i]=output[i];
		
		
	}
	static void print(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;++i)
			System.out.print(arr[i]);
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = {10,3,7,4,2,1,6,5,11,12};
		System.out.println("Array before sorting..");
		print(arr);
		countingSort(arr);
		System.out.println("Array after sorting...");
		print(arr);
		
	}

}
