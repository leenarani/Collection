package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,4,3,3,3,5,5,6,6,4,5,6,7,8,9,10));
//		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(arr);
//		ArrayList<Integer> ar1 = new ArrayList<Integer>(linkedHashSet);
//		System.out.println(ar1);
		List<Integer> lst = arr.stream().distinct().collect(Collectors.toList());
		System.out.println(lst);
//		
		

	}

}
