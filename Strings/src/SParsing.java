
public class SParsing {

	public static void main(String[] args) {
			
		String s1="How are You?";
		String s2="are";
		
		int index=s1.indexOf(s2);
		System.out.println(index);
		
		char c=s1.charAt(4);
		System.out.println(c);
		
		String news1=s1.replace("a","A");
		System.out.println(news1);
	}

}
