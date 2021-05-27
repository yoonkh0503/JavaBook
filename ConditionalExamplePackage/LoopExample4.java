package ConditionalExamplePackage;

public class LoopExample4 {

	public static void main(String[] args) {
		
		/* 1 + (-2) + 3 + (-4) ... 같은 식으로 계속 더해나갔을 때 몇까지 더해야
		총합이 100 이상이 되는지 구하시오.
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
