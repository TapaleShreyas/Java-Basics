package Methods;

public class Operations {
	
	public static void Addition(String s1,String s2){
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result=d1+d2;
		System.out.println(" Addition is: "+result);
	}
	
	
	public static void Subtraction(String s1,String s2){
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result=d1-d2;
		System.out.println(" Subtraction is: "+result);
	}
	
	
	public static void Multiplication(String s1,String s2){
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result=d1*d2;
		System.out.println(" Multiplication is: "+result);
	}
	
	
	
	public static void Division(String s1,String s2){
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		double result=d1/d2;
		System.out.println(" Division is: "+result);
	}

}
