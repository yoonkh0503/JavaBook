package ArrayExamplePackage;

import java.util.Arrays;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[] iArr = {100,95,80,70,60};
		
		for(int i=0; i<iArr.length; i=i+1) // 배열의 요소를 순서대로 출력
		{
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr)); // Arrays.toString 메서드를 사용.
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		//int[] iArr3 = new int[]{100,95,80,70,60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a','b','c','d'};
		
		for(int i=0; i<iArr1.length; i=i+1)
		{
			iArr1[i] = i + 1;
		}
		
		for(int i=0; i<iArr2.length; i=i+1)
		{
			iArr2[i] = (int)(Math.random()* 10) + 1; // 1~10의 값을 배열에 저장.
		}
		
		for(int i=0; i<iArr1.length; i=i+1)
		{
			System.out.print(iArr1[i] + " , ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		
		
		
	}
}
