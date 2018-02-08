import java.util.ArrayList;


public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> s1=new ArrayList<String>();
		
		s1.add("ABC");
		s1.add("EFG");
		s1.add("HIJ");
		System.out.println(s1);
		
		s1.remove("EFG");
		System.out.println(s1);
		
		s1.add("LMN");
		s1.add(2, "PQR");
		System.out.println(s1);
		
		String s2=s1.get(1);
		System.out.println(s2);
		
		s1.set(3,"TUV");
		System.out.println(s1);
	}

}
