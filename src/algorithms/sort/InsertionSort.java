package algorithms.sort;

import java.util.Arrays;

public class which need to learnnsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {1, 123, 455, 6565, 4, 11, 0, 111};
		
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {
		for (int out = 1; out < arr.length; out++){
			for(int in = out ; in > 0 ; in--){
				if (arr[in] < arr[in-1]){
					int tmp = arr[in];
					arr[in] = arr[in-1];
					arr[in-1] = tmp;
				}
			}
		}
	}
}
