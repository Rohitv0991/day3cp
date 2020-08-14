import java.util.Scanner;

public class SelectionSort {
	
	static int[] selection(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int min = i;
			
			for(int j = i+1; j < arr.length; j++) 
				if(arr[j] < arr[i]) min = j;
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
		return arr;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		a = selection(a);
		
		for(int e : a) {
			System.out.print(e + " ");
		}
	}
}
