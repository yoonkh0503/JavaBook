package ArrayExamplePackage;

public class ArrayExample4 {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100,88,100,100,90};
		
		for(int i=0; i < score.length; i=i+1)
		{
			sum += score[i];
		}
		
		average = sum / (float)score.length; // 계산 결과를 float 타입으로 얻으려 형변환
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
		

	}

}
