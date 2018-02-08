package Methods;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class AcceptInputs {

	public static String getinput(String ask){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println();
		
		System.out.print(ask);	
		try{
			return br.readLine();
		}catch(Exception e){
			return"Exception Caught: "+e;
		}
		
			
	}	
}
