package pack;

public class Exercises {
	
	public static void main(String args[]) {
		leftPrint(547);
	}
	
	public static int sumUpTo(int n) {
		if(n == 1)
			return n;
		else
			if(n < 0)
				return -(Math.abs(n) + sumUpTo(Math.abs(n + 1)));
			else
				return n + sumUpTo(n - 1);
	}
	
	public static int sumDigits(int x) {
		x = Math.abs(x);
		if(x < 10)
			return x;
		else
			return x%10 + sumDigits(x/10);
	}
	
	public static void leftPrint(int x) {
		if(x < 10) {
			System.out.print(x);
		}
		else {
			leftPrint(x/10);
			System.out.print(x%10);
		}
	}
	
	public static void rightPrint(int x) {
		if(x < 10)
			System.out.println(x);
		else
			System.out.println(x%10);
			rightPrint(x/10);
	}
}
