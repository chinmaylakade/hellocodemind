package controlstatement;
import java.util.*;


public class switchcase {
 void checkvowel(char c) {
	 System.out.println("character is vowel"+c);
	 
	 switch (c){
	 case 'A':
		 System.out.println("character is vowel and it is 'A");
	 break;
		 
		 case 'E':
			 System.out.println("character is vowel and it is 'E");
			 break;
			 
			 
		 case 'I':
			 System.out.println("character is vowel and it is 'I");
			 break;
				 
			 case 'o':
				 System.out.println("character is vowel and it is 'O");
				 break;
			
				 case 'u':
					 System.out.println("character is vowel and it is 'U");
					 break;
					 
					 default:
						 System.out.println("given character is vowel and "+c);
						 break;
	 }
	
 }
	 public static void main (String[] args) {
		  switchcase obj =new switchcase();
		  obj.checkvowel('a');
	 }
	 
 }
		
		
		
	


