package OOPExample;

public class OOPExample11 
{
	static int[] arr = new int[10];
	
	static {
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random()* 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		// 멤버변수의 초기화 예제
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("arr["+i+"] : " + arr[i]);
		}

	}
}
