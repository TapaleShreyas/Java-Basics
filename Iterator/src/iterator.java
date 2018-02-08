import java.util.ArrayList;
import java.util.ListIterator;
public class iterator {

	public static void main(String[] args) {
		


		ArrayList<Integer> Numbers=new ArrayList<Integer>();
		Numbers.add(2);
		Numbers.add(5);
		Numbers.add(6);
		Numbers.add(7);
		Numbers.add(88);
		Numbers.add(9);
		System.out.println(" List is: "+Numbers);
		
		ListIterator<Integer>list1=Numbers.listIterator();
		while(list1.hasNext()){
			int value=list1.next();
			System.out.println(value);
		}
	}

}
