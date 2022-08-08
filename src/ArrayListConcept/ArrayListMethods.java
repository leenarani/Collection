package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Steve","Lisa", "Tom","seema"));
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>((Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
		
       
       ArrayList<Integer> subList = new ArrayList<Integer>(numbers.subList(2, 6));
		System.out.println(subList);
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Robert","Lisa", "Tom","seema"));
		Object obj[] = newList.toArray();
	System.out.println(Arrays.toString(obj));
	for(Object o : obj) {
		System.out.println((String)o);
		
	}
		
	}

}
