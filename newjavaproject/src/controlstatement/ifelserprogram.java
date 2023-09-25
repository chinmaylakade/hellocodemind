package controlstatement;
import java.util.Scanner;

public class ifelserprogram {
	public static void main (String []arg) {
		
		System.out.println(" welcome to codemind");
	Scanner sc = new Scanner (System.in);
		
		
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		ifelserprogram obj=new ifelserprogram();
		obj.checkeliglibilty(age);
		
		
		
	}
	
	void checkeliglibilty(int age) {
		
		if(age >= 18 && age<60) {
			System.out.println("you are eliglible and you are senior citizen ");
			
		}else if (age >=18 && age>=60) {
				System.out.println("you are eliglible and you are not  senior citizen");
				
			}else {
				System.out.println("you are not eliglible");
			}
	}
}