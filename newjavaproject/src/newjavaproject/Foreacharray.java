package newjavaproject;


	
	public class Foreacharray {
		
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
			
			
			System.out.println("Array Interdate using for Loop");
			
			for(int i =0; i < num.length; i++) {
				
				int val = num[i];
				
				System.out.println(val);
			}
			
			System.out.println("Array Iterate Using For Each Loop");
			
			for (int i : num) {
				System.out.println(i);
			}
			
			
		}

	}

