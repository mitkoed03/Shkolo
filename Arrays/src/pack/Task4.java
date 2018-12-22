package pack;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ���������� �� 1-��� �����:");
		int n = sc.nextInt();
		
		System.out.println("�������� ������� �� ������ �����.");
		int[] a = new int[n];
		for(int c = 0; c < a.length; c++) {
			a[c] = sc.nextInt();
		}
		
		System.out.println("�������� ���������� �� 2-��� �����:");
		int m = sc.nextInt();
		
		System.out.println("�������� ������� �� ������ �����.");
		int[] b = new int[m];
		for(int c = 0; c < b.length; c++) {
			b[c] = sc.nextInt();
		}
		
		int[] mrg = new int[m + n];
		
		for(int c = 0; c < mrg.length; c++) {
			if(c < (m < n ? m : n)*2 - 1) {
				if(c%2 == 0) {
					mrg[c] = a[c/2];
				}else {
					mrg[c] = b[c/2];
				}
			}else {
				if(m < n) {
					mrg[c] = a[c - m];
				}else {
					mrg[c] = b[c - n];
				}
			}
		}
		
		for(int e : mrg) {
			System.out.print(e + " ");
		}
		
		sc.close();
	}

}
