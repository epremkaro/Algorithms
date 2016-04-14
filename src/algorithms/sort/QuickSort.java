package algorithms.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int [] arr = {1, 3, 56, 7, 8, 8, 12, 8, 123, 45, 6};
		
		System.out.println(Arrays.toString(arr));
		int left = 0;
		int right = arr.length - 1;
		quickSort(arr, left, right);
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
	}

	private static void quickSort(int [] arr, int left, int right){
		
		if (arr == null || arr.length == 0)
			return;
		if (left > right)
			return;
		
		int middle = left + (right - left)/2;
		int pivot = arr[middle];
		
		int l = left, r = right;
		
		while (l <= r){
			while (arr[l] < pivot)
				l++;
			while (arr[r] > pivot)
				r--;
			
			if (l <= r){
				int tmp = arr[l];
				arr[l] = arr[r];
				arr[r] = tmp;
				l++;
				r--;
			}
		}
		
		if (left < r)
			quickSort(arr, left, r);
		if (right > l)
			quickSort(arr, l, right);
		
	}
	
	
}
