package pack;

import java.util.Scanner;

public class Task6 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		for(int c = 0; c < a.length; c++) {
			a[c] = sc.nextInt();
		}
		
		int max = a[0];
		for(int c = 1; c < a.length; c++) {
			max = Math.max(max, a[c]);
		}
		
		int min = a[0];
		for(int c = 1; c < a.length; c++) {
			min = Math.min(min, a[c]);
		}
		
		String maxS = "Най-високи резултати през: ";
		String minS = "Най-ниски резултати през: ";
		
		for(int c = 0; c < a.length; c++) {
				if(a[c] == max) {
					maxS += (c > 3 ? c + 9 - 12 : c + 9) + " ";
				}
				else if(a[c] == min) {
					minS += (c > 3 ? c + 9 - 12 : c + 9) + " ";
				}
		}
		
		System.out.println(maxS + "  " + minS);
		
		sc.close();
	}

}
