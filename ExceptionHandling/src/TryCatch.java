
public class TryCatch {

	public static void main(String[] args) {
		
		try{
		String[] s1={"ABCD"};
		System.out.println(s1[1]);
		}catch(Exception e){
			System.out.println(" Exception is: "+e);
		}
		System.out.println(" Application is still Running..");
	}

}
