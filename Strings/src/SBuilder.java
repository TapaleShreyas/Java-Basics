
public class SBuilder {

	public static void main(String[] args) {
		
		
		String s1="Shreyas";
		s1=s1+" Tapale";
		
		System.out.println(s1);
		
		StringBuilder sb=new StringBuilder(s1);
		
		sb.append(" From Saswad");
		System.out.println(sb);
	}

}
