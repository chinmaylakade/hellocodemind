package newjavaproject;

public class array2 {
	
	public static void main(String[] args) {
		
	int[] num = new int[10];
		
		num[0] = 6;
		num[1] = 8;
		num[2] = 9;
		num[3] = 4;
		num[4] = 9;
		num[5] = 10;
		num[6] = 3;
		num[7] = 4;
		num[8] = 3;
		num[9] = 5;
		
		array2 obj = new array2();
		
		int result = obj.addNumber(10, 20);
		
		System.out.println(result);
		
		obj.iterateArray(num);
	}
	
	void iterateArray(int[] arr) {
		
		System.out.println("In Iterate Array");
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}

	int addNumber(int a, int b) {
		
		System.out.println("In addNumber Method");
		
		int res = a + b;
		
		return  res ;
	
	}
}

