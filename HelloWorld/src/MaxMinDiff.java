import java.util.Arrays;

public class MaxMinDiff {
	public static void main(String args[]) {
		int[] arr = new int[] {5,3,1,7,10,0};
		Arrays.parallelSort(arr);
		int diff = 0;
	if(arr[0] > arr[arr.length-1]) {
			diff = arr[0] - arr[arr.length-1];
		}
	else
		diff = arr[arr.length-1] - arr[0];
		System.out.println(diff);
	}
}
