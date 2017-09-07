
public class FindMax {

	public static int sumOfSquares(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] values = new int[5];
		int x = 1;
		int y = 2;
		int z = 3;
		for (int i = 0; i < 5; i++) {
			x = y + z;
			y = z - 3 * x;
			z = 4 * x + y * y;
			values[i] = x + y + z;
		}
		int total = sumOfSquares(5);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("total = " + total);
	}
}
