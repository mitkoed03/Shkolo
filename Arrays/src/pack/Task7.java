package pack;

import java.util.Scanner;

public class Task7 {
	
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
		int k = sc.nextInt();
		
		if(k >= n) {
			System.out.println("������");
			System.exit(0);
		}
		
		System.out.println("�������� ������� �� ������ �����.");
		int[] b = new int[k];
		for(int c = 0; c < b.length; c++) {
			b[c] = sc.nextInt();
		}
		
		n = 0;
		for(int e: b) {
			for(int el : a) {
				if(e == el) {
					n++;
					break;
				}
			}
		}
		
		if(n == k) {
			System.out.println("��");
		}
		else {
			System.out.println("��");
		}
		
		sc.close();
	}

}
