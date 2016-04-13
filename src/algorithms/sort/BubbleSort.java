package algorithms.sort;

public class BubbleSort {

	private int[] a = new int[]{1, 123, 455, 6565, 4, 1, 0, 1};
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.display();
		bs.bubbleSort();
		bs.display();
	}
	
	
	private void display() {
		for (int aa : a)
			System.out.print(aa + " ");
		System.out.println();
	}


	public void bubbleSort(){
		int out, in;
		for (out = a.length - 1; out > 1; out--)
			for (in = 0; in < out; in++)
				if (a[in] > a[in+1]){
					int temp = a[in];
					a[in] = a[in+1];
					a[in+1] = temp;
				}
	}

}
