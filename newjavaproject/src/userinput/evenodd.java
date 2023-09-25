package userinput;
import java.util.*;
import java.util.Scanner;


public class evenodd {
	
	 public void checkevenodd(int num) {
		 
		 if(num%2 == 0) {
			 System.out.println("number is even");
			 
		 }else {
			 
			 System.out.println("number is odd");
			 
			 
		 }
		 
	 }
 
	  public static void main(String args[]) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		

		evenodd obj=new evenodd();
		obj.checkevenodd(num);
		
		 
		
		
	}
	

}
