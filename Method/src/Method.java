import java.io.*;
public class Method{
	public static void main(String[] args) {
		//doSomethig();
		String s1=getInput("Enter the Number: ");
		String s2=getInput("Enter the Number: ");
		
		double result=addTwoValues(s1,s2);
		System.out.println("Result is: " +result);
		
		double result1=addValues(1,2,3,4);
		System.out.println("Result is: " +result1);
		// loopMe();
	}
	
	private static double addTwoValues(String s1,String s2){
		double d1=Double.parseDouble(s1);
		double d2=Double.parseDouble(s2);
		
		double result=d1+d2;
		return result;
	}
	private static String getInput(String prompt){
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(prompt);
		System.out.flush();
		
		try{
			return stdin.readLine();
		}catch(Exception e){
			return "Error: " +e.getMessage();
		}
	}
	

//	private static void loopMe() {
//		int top=10;
//		 for (int i = 0; i <top; i++) {
//			System.out.println("Number is : "+ i);
//		}
//	}
//	private static void doSomethig(){
//		System.out.println("\n Helo shreyas..");
//	}
		private static double addValues(double ...values){
			double result=0d;
			for (double d : values) {
				result+=d;
			}
			return result;
		}
}
