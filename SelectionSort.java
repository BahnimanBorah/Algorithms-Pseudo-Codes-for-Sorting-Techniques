//the program is written in JAVA
//the variable names are simplied for beginner understanding
//focus on indentations used
public class SelectionSort {

  //function for selection sort (function kept static for easy understanding)
	static void selectionSort(int arr[]) {
		int n=arr.length;
		for(int key = 0 ; key<n-1 ; key++) {
			int min_index = key;
			for(int element=key+1 ; element<n ; element++)
				if(arr[element]<arr[min_index])
					min_index=element;
			int temp = arr[min_index];
			arr[min_index] = arr[key];
			arr[key] = temp;
			
		}
	}
	
  //function to print array
	static void printArray(int arr[]) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {

		int[] arr = {98,776,555,4,3,54,645,3443,23,54,6764,65};
		System.out.println("Unsorted array is...");
		printArray(arr);
		selectionSort(arr);
		System.out.println("Sorted array is...");
		printArray(arr);
		
	}

}
