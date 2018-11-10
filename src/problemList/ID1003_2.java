package problemList;

import java.util.Arrays;
import java.util.Scanner;

class ID1003_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int arraysum = sc.nextInt();
			for (int arraytemp = 1; arraytemp <= arraysum; arraytemp++) {
				int arraylength = sc.nextInt();
				int[] array = new int[arraylength];
				for (int temp = 0; temp < arraylength; temp++) {
					array[temp] = sc.nextInt();
				}
				int[] result = end(array);
				System.out.println("Case " + arraytemp + ":");
				System.out.println(result[0] + " " + result[1] + " " + result[2]);
				System.out.println();
			}
		}

	}

	public static int[] end(int list[]) {
		int[] sum = new int[list.length];
		int[] array = new int[3];
		int end = 0;
		int start = 0;
		// 创建sum数组。
		for (int jb = 0; jb < list.length; jb++) {
			sum[0] = list[0];
			for (int sumjb = 1; sumjb < list.length; sumjb++) {
				sum[sumjb] = sum[sumjb - 1] + list[sumjb];
			}
		}
		//选取sum数组中最大的数。
		for (int jb = 0; jb < list.length; jb++) {
			if (jb != 0) {
				if (sum[jb] > sum[jb - 1]) {
					end = jb;
				}
			} 
			else if (jb==0) {
				if(sum[jb] > sum[end])
				end = jb;
			}
		}
		//创建newsum数组。
		int [] newsum = new int[list.length];
		newsum[list.length-1] = list[list.length-1];
		for (int jb = list.length-2; jb>=0;jb--) {
			newsum[jb] = newsum[jb+1] + list[jb];
		}
		int [] finalsum = Arrays.copyOfRange(newsum, 0, end+1);
		//选取finalsum数组中最大的数。
		for (int jb = finalsum.length-1; jb >= 0; jb--) {
			if (jb==finalsum.length-1) {
				if(finalsum[jb] >= finalsum[end])
					start = jb;
			}
			else if (jb != finalsum.length-1) {
				if (finalsum[jb] >= finalsum[jb + 1]) {
					start = jb;
				}
			} 

		}
		int maxsum = 0;
		for(int a = start;a<=end;a++) {
			maxsum += list[a];
		}
		array[0] = maxsum;
		array[1] = start+1;
		array[2] = end+1;
		return array;
	}
}
