
public class QuickSort {
	// arguments are passed using the text field below this editor
	public static void main(String[] args) {
		int arr[] = { 9, 5, 1, 100, 2, 3, 99, 101 };
	
//		int arr[] = { 2,12,111};

		quickSort(arr, 0, arr.length-1);

		for (int i : arr) {
			System.out.print(i + "   ");
		}

	}

	public static void quickSort(int arr[ ], int start, int end) {

		if (end <= start)
			return;
		else {
			int pivot = start;
			int i = start + 1;
			int j = end;

			while (i < j) {
				if (arr[i] >= arr[pivot]) {
					swap(arr, i, j);
					j--;
				} else {
					i++;
				}
			}

			
			if (arr[pivot] >= arr[i])
				swap(arr, pivot, i);
			

			quickSort(arr, start, i - 1);
			quickSort(arr, i , end);

		}

	}

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
