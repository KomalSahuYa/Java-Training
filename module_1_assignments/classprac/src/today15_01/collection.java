package today15_01;
import java.util.*;

public class collection {
	public static void main(String[] args) {
		//crreate 
		List<String> list= new ArrayList<>();
		list.add("Foo");
		list.add("bar");
		list.add("abc");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		int index=Collections.binarySearch(list, "abx");
		//iterat
		//iterator samjhte hai, two types - iterator and listiterator
	
	}

}
