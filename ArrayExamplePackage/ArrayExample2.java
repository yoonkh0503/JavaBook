package ArrayExamplePackage;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] arr = new int[5]; // 배열은 한번 생성하면 길이를 바꿀 수 없음.
	
		System.out.println("arr.length : " + arr.length);
		System.out.println(arr);
		
		int[] score = new int[5];
		
		for(int i=0; i<score.length; i=i+1) // 배열의 모든 요소 출력.
		{
			System.out.println("score["+ i +"] = " + score[i]);
		}
		// 배열의 초기화, 배열은 생성 시 자동으로 초기화가 됨.

		
		// int[] score;
		// score = {50,60,70,80,90}; 에러, new int[]를 생략할 수 없음.
		
		score = new int[]{50,60,70,80,90};
		
	}

}
