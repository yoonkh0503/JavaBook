package OOPExample;

public class OOPExcerCise6 {

	static int abs(int var)
	{
		if(var < 0)
		{
			var = var * (-1);
		}
		else
		{
			var = var * (1);
		}
		return var;
	}
	public static void main(String[] args) {
		
		int value = 5;
		System.out.println(value + "의 절대값 : " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값 : " + abs(value));

	}

}
