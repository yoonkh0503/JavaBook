package ConditionalExamplePackage;

public class LoopExample4 {

	public static void main(String[] args) {
		
		/* 1 + (-2) + 3 + (-4) ... ���� ������ ��� ���س����� �� ����� ���ؾ�
		������ 100 �̻��� �Ǵ��� ���Ͻÿ�.
		 */
		
		int num = 0;
		int sum = 0;
		
		while(true)
		{
			num = num + 1;
			
			if(num % 2 == 0)
			{
				sum -= num;
			}
			else
			{
				sum += num;
			}
			System.out.println("num : " + num);
			System.out.println("sum : " + sum);
			if(sum >= 100)
			{
				break;
			}
		}
		System.out.println(sum);
	}
}
