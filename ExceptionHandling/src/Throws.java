
public class Throws {

	public static void main(String[] args) {
		
		try {
			throwsExc();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Array Index Error: "+e);
		}
		System.out.println(" Application is still Running..");
	}

	private static void throwsExc() 
		throws ArrayIndexOutOfBoundsException{
		String[] s1={"ABCD"};
		System.out.println(s1[1]);
	}

}
