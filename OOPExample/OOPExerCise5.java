package OOPExample;

public class OOPExerCise5 {
	
	static int max(int[] arr)
	{
		if(arr == null) { return -999999;}
		else if(arr.length == 0) { return -999999;}
		
		int maxnum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(maxnum < arr[i])
			{
				maxnum = arr[i];
			}
		}
		return maxnum;
	}

	public static void main(String[] args) {
		
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));
		
	}

}