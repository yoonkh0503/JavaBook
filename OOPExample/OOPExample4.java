package OOPExample;

public class OOPExample4 {

	public static void main(String[] args) {
		Mymath mm = new Mymath();
		long result1 = mm.add(5L,3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(12);
		
		System.out.println("add(5L,3L) = " + result1);
		System.out.println("subtract(5L,3L) = " + result2);
		System.out.println("multiply(5L,3L) = " + result3);
		System.out.println("divide(5L,3L) = " + result4);

	}

}

class Mymath
{
	void printGugudan(int dan)
	{
		if(!(dan >=2 && dan <= 9)) { return; }
		for(int i = 1; i <= 9; i++)
		{
			System.out.printf("%d * %d = %d", dan, i, dan * i);
			System.out.println();
		}
	}
	long add(long a, long b)
	{
		long result = a + b;
		return result;
		// return a + b;
	}
	
	long max(long a, long b)
	{
		if(a > b) { return a; }
		else { return b; }
	}
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a , double b)
	{
		return a / b;
	}
}