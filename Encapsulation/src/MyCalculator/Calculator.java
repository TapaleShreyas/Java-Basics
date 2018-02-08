package MyCalculator;
import Methods.AcceptInputs;
import Methods.Operations;



public class Calculator {

	public static void main(String[] args) {
		
		String s1=AcceptInputs.getinput(" Enter the No: ");
		String s2=AcceptInputs.getinput(" Enter the No: ");
		String ch=AcceptInputs.getinput(" \n Enter 1:Addition  2:Subtraction  3:Multiplication  4:Division  \n Choice is: ");
		
		int menu=Integer.parseInt(ch);
		
		switch (menu) {
		case 1:Operations.Addition(s1, s2);
			   break;
		case 2:Operations.Subtraction(s1,s2);
				break;
		case 3:Operations.Multiplication(s1,s2);
				break;
		case 4:Operations.Division(s1,s2);
			break;
		default:System.out.println("\n Enter a valid Choice....");
			
		}
		

	}
	
	
		

}
