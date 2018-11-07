package problemList;

import java.util.Scanner;

class ID1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int sum = 0;
			int a = 1;
			int n = sc.nextInt();
			for (; a <= n; a++) {
				sum += a;
			}
			System.out.println(sum);
			System.out.println();
		}
		sc.close();
	}
}
