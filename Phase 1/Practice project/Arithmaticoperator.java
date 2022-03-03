import java.util.Scanner;
import calculator.calculator;
public class Arithmaticoperator 
{
	public static void main(String[] args, Scanner scan) 
	{
		//Arithmaticoperator obj = new Arithmaticoperator();
		float c;
		Scanner sc= new Scanner(System.in); 
		System.out.println("enter first number");
		float a1= sc.nextFloat();  
	 
		System.out.println("enter second number");
		float a2 = sc.nextFloat();		
       
		int ch;
		if(ch==2){
			System.out.println(" Addition");
			c=a1+a2;
			
			
		}else if(ch==3) {
			
				System.out.println("subrtraction");
				c=a1-a2;
			
				
		}else if(ch==4) {
			
				System.out.println("multiplication");
				c = a1*a2;
			
				
		}else if(ch==5) {
			
				System.out.println("Division");
				c = a1/a2;
		}else{
			System.out.println("give your choice ");
		}

		
	}
}	
					
		
					
		
					
			


