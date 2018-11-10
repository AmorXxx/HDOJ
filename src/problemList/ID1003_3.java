package problemList;

import java.util.Scanner;

public class ID1003_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i=0;i<n;i++) {
			int a = scanner.nextInt();
			int arr[] = new int[a];
			
			int sum = 0;
			int max = -1001;
			int start = 0;
			int end = 0;
			int temp = 1;
			
			for (int j=0;j<a;j++) {
				arr[j] = scanner.nextInt();
				sum += arr[j];
				if (sum>max) {
					max = sum;
					start = temp;
					end = j+1;
				}
				
				if (sum < 0) {
					sum = 0;
					temp = j+2;
				}
				
			}
			System.out.println("Case "+(i+1)+":");
			System.out.println(max+" "+start+" "+end);
			if (i!=n-1) {
				System.out.println();
			}
		}
	}
}