package OOPExample;

public class OOPExerCise4 {
	
	static boolean isNumber(String str)
	{
		try
		{
			Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(str + " �� ���� �Դϱ�? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + " �� ���� �Դϱ�? " + isNumber(str));

	}

}

