package problemList;

import java.util.Scanner;

class ID1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int listnum = sc.nextInt();
			for (int a = 1; a <= listnum; a++) {
				int listlength = sc.nextInt();
				System.out.println("Case"+" "+a+":");
				int[] list = new int[listlength];
				for (int jb = 0; jb < listlength; jb++) {
					list[jb] = sc.nextInt();
				}
				int[] sum = new int[listlength];
				int maxsum = 0;
				for (int jb = 0; jb < listlength; jb++) {
					sum[0] = list[0];
					for (int sumjb = 1; sumjb < listlength; sumjb++) {
						sum[sumjb] = sum[sumjb - 1] + list[sumjb];
					}
				}
				for (int jb = 0; jb < listlength; jb++) {
					if (jb != 0) {
						if (sum[jb] > sum[jb - 1]) {
							maxsum = jb;
						}
					} else {
						if (sum[0] > sum[maxsum]) {
							System.out.println("0");
						}
					}

				}

				System.out.println(sum[maxsum] + " " + "1" + " " + (maxsum + 1));
				System.out.println();
			}
		

		}
	}

}
