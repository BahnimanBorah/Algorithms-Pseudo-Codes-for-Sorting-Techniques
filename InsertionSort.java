//following is the pseudo code for the famous insertion sort technique
//the program is written in JAVA
public class InsertionSort {

	static void insertionSort( int[] arr) {
		int n=arr.length;
		for(int marker=1;marker<n;marker++) {
			int front = arr[marker];
			int back = marker-1;
			while(back>=0 && arr[back]>front) {
				arr[back+1]=arr[back];
				back--;
			}
			arr[back+1]=front;
		}
	}
	public static void main(String[] args) {


		
		int[]	arr = {65,74,42,63,546,755,34,34,21,3,4,63,32};
		System.out.println("Array before sorting...");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		insertionSort(arr);
		System.out.println("Array after sorting..");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
