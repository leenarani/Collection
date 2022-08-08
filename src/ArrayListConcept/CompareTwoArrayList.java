package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		l1.retainAll(l2);
		System.out.println(l1);
	
		
		

	}

}
