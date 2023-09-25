package userinput;
import java.util.*;

	
	public class naturalnumber {
		
		int sumOfNaturalNumber() {
			
			System.out.println("Enter any number for Sum of NaturalNumbers");
			
			Scanner sc = new Scanner(System.in);
			 int num = sc.nextInt();
			 
			 int result = 0;
			 
			 for(int i=1; i <= num; i++ ) {
				 
				 //result = result+i;
				 result +=i;
			 }
			
			 return result;
			
		}
		
		public static void main(String[] args) {
			
			naturalnumber obj = new naturalnumber();
			int res = obj.sumOfNaturalNumber();
			
			System.out.println("Sum of Natural Number is-" +res);
			
		}

	}


