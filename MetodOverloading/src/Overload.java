
public class Overload {

	public static void main(String[] args) {
			
		int result=addValues(10,20);
		System.out.println("Result is: " +result);
		
		 result=addValues(10,20,30);
		System.out.println("Result is: " +result);
		
		String s1="20";
		String s2="30";
		 result=addValues(s1,s2);
		System.out.println("Result is: " +result);
		
	}
	private static int addValues(int int1,int int2){
		return int1+int2;
	}
	
	private static int addValues(int int1,int int2,int int3){
		return int1+int2+int3;
	}
	
	private static int addValues(String a,String b){
		int s1=Integer.parseInt(a);
		int s2=Integer.parseInt(b);
		return s1+s2;
	}
}
