package problemList;

import java.util.Scanner;

class ID1004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int colornum = sc.nextInt();
			if (colornum == 0)
				break;
			String[] colorlist = new String[colornum];
			for (int temp = 0; temp < colornum; temp++) {
				colorlist[temp] = sc.next();
			}
			String[] maxcolor = pickmax(colorlist);
			for (int i = 0; i < maxcolor.length; i++) {
				if (maxcolor[i] != null) {
					System.out.println(maxcolor[i]);
				}
			}

		}
		sc.close();
	}

	public static String[] pickmax(String colorlist[]) {
		int length = colorlist.length;
		int[] colornum = new int[length];
		String[] maxcolor = new String[length];
		for (int temp = 0; temp < length; temp++) {
			int count = 1;
			int back = temp + 1;
			if (temp != length - 1)
				for (; back < length; back++) {
					if (colorlist[temp].equals(colorlist[back])) {
						count++;
					}
					colornum[temp] = count;
				}
			else {
				colornum[temp] = 1;
			}

		}
		int max = colornum[0];
		for(int i = 0; i<length;i++) {
			if(max < colornum[i])
				max = colornum[i];
		}
		int maxcolortemp = 0;
		for(int p = 0; p<length; p++) {
			if(max == colornum[p]) {
				maxcolor[maxcolortemp] = colorlist[p];
				maxcolortemp++;
			}
		}

		return maxcolor;

	}

}
