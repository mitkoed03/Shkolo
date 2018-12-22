package pack;

public class Recursion {
	
	public static void main(String args[]) {
		System.out.println(fib(10));
	}

	public static int factorial(int x) {
		if(x < 0)
			return -1;
		else if(x < 2)
			return x;
		else
			return x*factorial(x - 1);
	}
	
	public static int sum(int x, int y) {
		if(x == 0)
			return y;
		else if(y == 0)
			return x;
		else if(x > y)
			return sum(x + 1, y - 1);
		else
			return sum(x - 1, y + 1);
	}
	
	public static int fib(int n) {
		if(n <= 2)
			return n - 1;
		else
			return fib(n - 1) + fib(n - 2);
	}
}
