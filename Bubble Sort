//the program is written in JAVA
//the variable names are simplied for beginner understanding
//focus on indentations used
public class BubbleSort {
	
  //function kept static for easy understanding
	static public void bubbleSort(int[] arr) throws IOException {
		int n = arr.length;
		int temp;
		for(int pointer=0;pointer<n-1;pointer++) {
			for(int element=1;element<n;element++) {
				if ( arr[element-1]>arr[element]) {
					temp=arr[element-1];
					arr[element-1]=arr[element];
					arr[element]=temp;
				}
			}
		}
	}

	
	public static void main(String[] args)  {

		
		int[] arr = {23,43,65,878,45,34,5};
		System.out.print("Array before sorting..\n");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.print("Array after sorting..\n");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
