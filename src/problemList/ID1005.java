package problemList;

import java.util.Scanner;

class ID1005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int n = sc.nextInt();
			if (A == 0 && B == 0 && n == 0)
				break;
			int[] f = f(A, B);
			if (n % 49 == 0)
				System.out.println(f[49]);
			else {
				System.out.println(f[(n % 49) - 1]);
			}

		}
	}

	public static int[] f(int A, int B) {
		int[] f = new int[49];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < 49; i++) {
			f[i] = (A * f[i - 1] + B * f[i - 2]) % 7;
		}
		return f;
	}
}
