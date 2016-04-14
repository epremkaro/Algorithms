package algorithms.sort;

import java.util.Arrays;

public class BinarySearch {

	private int[] a = new int[]{1, 123, 455, 6565, 4, 11, 0, 111};
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		//comment
		Arrays.sort(bs.a);
		bs.display(bs.find(11));
	}
	
	
	private void display(int index) {
		if (index == -1)
			System.out.println("There is no such element.");
		else
			System.out.println("The element defined. The index is [" + index + "].");
	}


	private int find(int searchKey) {
		
		int floor = 0;
		int roof = a.length-1;
		int currPos;
		
		while (true){
			currPos = (floor + roof)/2;
			if (a[currPos] == searchKey)
				return currPos;
			else if (floor > roof)
				return -1;
			else{
				if (a[currPos] < searchKey)
					floor = currPos + 1;
				else
					roof = currPos - 1;
			}
		}
		
	}
	
}
