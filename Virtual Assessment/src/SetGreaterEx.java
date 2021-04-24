import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetGreaterEx {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(44);
		list.add(10);
		list.add(15);
		list.add(71);
		list.add(5);
		System.out.println(list);
	
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		
		
	}
}
