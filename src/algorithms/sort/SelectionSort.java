package algorithms.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {1, 123, 455, 6565, 4, 11, 0, 111};
		
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) {
		
		for (int out = 0; out < arr.length - 1; out++){
			int min = out;
			for (int in = out + 1; in < arr.length; in++){
				if (arr[in] < arr[min])
					min = in;
			}
			int tmp = arr[out];
			arr[out] = arr[min];
			arr[min] = tmp;
			
		}
		
	}


}
