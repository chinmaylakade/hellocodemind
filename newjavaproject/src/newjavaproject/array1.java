package newjavaproject;

public class array1 {
public static void main(String[] args) {
		
		
		int[] num = new int[10];
		
		num[0] = 6;
		num[1] = 8;
		num[2] = 9;
		num[3] = 4;
		num[4] = 20;
		num[5] = 10;
		num[6] = 3;
		num[7] = 4;
		num[8] = 3;
		num[9] = 5;
		
	array1 obj = new array1();
		 
		int[] resArray = obj.findMinMaxFrmArray(num);
		
		for (int i : resArray) {
			System.out.println(i);
		}
		
	}
	
	int[] findMinMaxFrmArray(int[] arr) {
		
		int[] minMaxValue = new int[2];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i : arr) {
			
			if(i < min) {
				min = i;
			}
			
			if(i > max) {
				max = i;
			}
		}
		
		minMaxValue[0] = min;
		minMaxValue[1] = max;
		
		return minMaxValue;
		
	}

}
