package ArrayExamplePackage;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] arr = new int[5]; // �迭�� �ѹ� �����ϸ� ���̸� �ٲ� �� ����.
	
		System.out.println("arr.length : " + arr.length);
		System.out.println(arr);
		
		int[] score = new int[5];
		
		for(int i=0; i<score.length; i=i+1) // �迭�� ��� ��� ���.
		{
			System.out.println("score["+ i +"] = " + score[i]);
		}
		// �迭�� �ʱ�ȭ, �迭�� ���� �� �ڵ����� �ʱ�ȭ�� ��.

		
		// int[] score;
		// score = {50,60,70,80,90}; ����, new int[]�� ������ �� ����.
		
		score = new int[]{50,60,70,80,90};
		
	}

}
