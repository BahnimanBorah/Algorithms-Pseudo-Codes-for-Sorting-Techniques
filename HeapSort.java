//the following pseudo code is for the common heap sorting technique that uses a binary tree as a data structure to contain the elements
//the program is written in JAVA
//simplified variable names are used for an easy understanding of the code
public class HeapSort {

	static void sort(int[] arr) {
		int n = arr.length;
		for(int index = (n/2)-1; index>=0;index--)
			heapify(arr,n,index);
		for(int index=n-1;index>=0;index--) {
			int temp = arr[0];
			arr[0] = arr[index];
			arr[index] = temp;
			heapify(arr,index,0);
		}
		
	}
	static void heapify(int[] arr,int n,int element) {
		int largest = element;
		int left = 2*element+1;
		int right = 2*element+2;
		if(left<n && arr[left]>arr[largest])
			largest = left;
		if(right<n && arr[right]>arr[largest])
			largest = right;
		if(largest != element) {
			int swap = arr[element];
			arr[element] = arr[largest];
			arr[largest] = swap;
			heapify(arr,n,largest);
		}
	}
	public static void main(String[] args) {
		

		int[]	arr = {65,74,42,63,546,755,34,34,21,3,4,63,32};
		System.out.println("Array before sorting...");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sort(arr);
		System.out.println("Array after sorting...");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
