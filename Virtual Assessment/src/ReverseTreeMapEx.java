import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class ReverseTreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> Obj = new TreeMap<Integer, String>();
		Obj.put(1, "Red");
		Obj.put(2, "Blue");
		Obj.put(3, "Green");
		Obj.put(4, "White");
		Set<Integer> reverse = Obj.descendingKeySet();
		Iterator<Integer> iterator = reverse.iterator();
		Integer key = null;
		while (iterator.hasNext()) {
			key = iterator.next();
			System.out.println(key + "->" + Obj.get(key));
		}
	}
}
