package ConditionalExamplePackage;

public class LoopExample1 {

	public static void main(String[] args) {
		 /* 다음의 for 문을 while 문으로 변경하시오.
		for(int dan = 2; dan < 10; dan ++)
		{
			for(int gob = 1; gob < 10; gob++)
			{
				System.out.println(dan + " * " + gob + " = " + dan*gob);
			}
		}
		*/
		
		int dan = 2;

		int result = 0;
		
		while(dan<10)
		{
			int gob = 1; // 여기서 다시 초기화를 해주지 않으면 다음 while문에서 gob은 10이 되어 반복되지 않음.
			while(gob < 10)
			{
				result = dan * gob;
				System.out.println(dan + " X " + gob + " = " + result);
				gob = gob + 1;
			}
			dan = dan + 1;
		}
		

	}

}
