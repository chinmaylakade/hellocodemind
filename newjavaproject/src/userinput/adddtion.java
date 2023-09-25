package userinput;
import java.util.Scanner;

public class adddtion {
	
	public static void main (String arg []) {
		
		int i,j,sum;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the first number ");
		i=sc.nextInt();
		
		Scanner sc1=new Scanner (System.in);
		System.out.print("enter the second number ");
		j=sc1.nextInt();
		
		
		sum=i+j;
		System.out.println("sum of two number "+sum);
				
		
		

}
}