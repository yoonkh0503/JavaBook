package ConditionalExamplePackage;

public class LoopExample6 {

	public static void main(String[] args) {
		
		// ������ for ���� while ������ �����Ͻÿ�.
		/*
		for(int i=0; i<=10; i++) { 
			for(int j=0; j<=i; j++) 
				System.out.print("*"); System.out.println(); 
		} 
		*/
		
		int i = 0,j = 0;
		
		while(i<=10)
		{
			j = 0;
			while(j<=i)
			{
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
		
		
	}

}
