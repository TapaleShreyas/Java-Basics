import java.util.HashMap;


public class Hashmap {

	public static void main(String[] args) {

		HashMap<String, Integer> employees = new HashMap<String, Integer>();
		
		employees.put("ABCD",21);
		employees.put("EFGH",23);
		employees.put("HIJK",42);
		System.out.println(employees);
	
		employees.put("WXYZ", 29);
		System.out.println(employees);
		
		System.out.println("Age of EFGH "+employees.get("EFGH"));
		//System.out.println(s1);
		
		String s2= employees.get("ABCD").toString();
		System.out.println(s2);
	}

}
