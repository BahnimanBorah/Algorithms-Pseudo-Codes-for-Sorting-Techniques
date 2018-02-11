//Program is written in JAVA

public class ShellSort {
	
	static void shellSort(int[] arr) {
		int n = arr.length;
		for(int gap = n/2; gap>0; gap/=2) {
			for(int index = gap; index<n; index++) {
				int temp = arr[index];
				int element;
				for(element = index; element>=gap && arr[element-gap]>temp;element-=gap) {
					arr[element] = arr[element-gap];
				} 
				arr[element] = temp;
			}
		}

	}
	
	static void print(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {

		int[] arr = {23,43,54,5,223,7,5,454,2,43,54,5};
		System.out.println("Array before sorting...");
		print(arr);
		shellSort(arr);
		System.out.println();
		System.out.println("Array after sorting...");
		print(arr);
		
	}

}
