package problemList;

import java.util.Scanner;

class ID1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			if (1 <= a && a <= 20) {
				int temp = 1;
				String[] mylist = new String[a * 2];
				int listnum = 0;
				for (; temp <= a; temp++) {
					if (sc.hasNext()) {
						mylist[listnum] = sc.next();
						mylist[listnum + 1] = sc.next();
					}
					listnum += 2;
				}

				listnum = 0;
				temp = 1;
				for (; temp <= a; temp++) {
					System.out.println("Case " + temp + ":");
					System.out.println(mylist[listnum] + " + " + mylist[listnum + 1] + " = "
							+ add(mylist[listnum], mylist[listnum + 1]));
					if (a != temp)
						System.out.println();
					listnum += 2;
				}
			}
		}
		sc.close();

	}

	public static String add(String a, String b) {
		int al = a.length();
		char[] as = new char[al];
		for (int k = 0; k < al; k++) {
			as[k] = a.charAt(al - 1 - k);
		}
		int bl = b.length();
		char[] bs = new char[bl];
		for (int k = 0; k < bl; k++) {
			bs[k] = b.charAt(bl - 1 - k);
		}

		int length = al;
		if (length < bl)
			length = bl;

		char[] res = new char[length + 1];
		int jw = 0;
		for (int j = 0; j <= length; j++) {
			int aa = 0;
			int bb = 0;
			if (j < as.length)
				aa = as[j] - '0';
			if (j < bs.length)
				bb = bs[j] - '0';
			int s = aa + bb + jw;
			jw = 0;
			if (s > 9) {
				jw = 1;
				res[length - j] = (char) (s - 10 + '0');
			} else {
				res[length - j] = (char) (s + '0');
			}
		}
		String rs = String.valueOf(res);
		if (rs.startsWith("0")) {
			rs = rs.substring(1, rs.length());
		}
		return rs;
	}
}
