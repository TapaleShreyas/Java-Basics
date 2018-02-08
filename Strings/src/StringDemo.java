
public class StringDemo {

	public static void main(String[] args) {
		
		String s1="Shreyas";
		String s2="Shreyas";
		String s3=new String("Shreyas");
		
		if(s1==s2){
			System.out.println("(s1=s2) Equals..");
		}else{
				System.out.println("(s1=s2)Note Equals");
			
		}
		if(s1==s3){
			System.out.println(" (s1=s3)Equals..");
		}else{
				System.out.println(" (s1=s3)Note Equals");
			
		}
		
		 char[] chars=s1.toCharArray();
		 for (char c : chars) {
			System.out.println(c);
		}
	}

}
