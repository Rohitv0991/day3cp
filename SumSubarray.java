import java.util.Scanner;

public class SumSubarray {
	
	static int sumSub(int[] arr) {
		int sum = 0;
		int max = 0;
		// used kadene algo to find max contiguous sub array
		for(int i  = 0; i < arr.length; i++) {
			sum += arr[i];
			if(max <  sum) max = sum;
			if(sum <= 0) sum = 0; 
		}
		return max;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int s = sumSub(a);
		System.out.print(s);
}
}
	
