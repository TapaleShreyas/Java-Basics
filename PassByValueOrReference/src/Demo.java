
public class Demo {
	
	public static void main(String[] args) {
		
		int a=25;
		System.out.println(" Pass by Value Before Change: "+a);	
		Increment(a);
		System.out.println(" Pass by Value After Change : "+a);
		System.out.println();
		
		int[] original={10,11,12};
		System.out.println(" Pass By reference Before change: "+original[0]);
		IncrementArray(original);
		System.out.println(" Pass By Reference After change : "+original[0]);
		
		System.out.println();
		String s1="shayu";
		System.out.println(" String Before change: "+s1);
		string(s1);
		System.out.println(" String After change: "+s1);
	}
	
	static int Increment(int int1){
		int1++;
		System.out.println(" Pass by Value After Change in Method: "+int1);
		return int1;
	}

	
		static int IncrementArray(int[] original){
			original[0]=15;
			System.out.println(" After change in Method: "+original[0]);
			return original[0];
		}
		
		static String string(String value1){
			value1="ABCD";
			System.out.println(" String After change in Methd: "+value1);
			return value1;
		}
}
