package pack;

import java.util.Scanner;

public class Task3 {

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
		
		String fin = "";
		for(int e : a) {
			for(int el : b) {
				if(e == el) {
					fin += e + " ";
					break;
				}
			}
		}
		
		System.out.println(fin);
		
		sc.close();
	}
}
