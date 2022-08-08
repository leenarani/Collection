package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Leena");
		ar.add("Sidhath");
		ar.add("Subudhi");
		ar.add("Samal");
		
		for(int i =0; i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		System.out.println("===================");
		
		for(String s: ar) {
			System.out.println(s);
			
		}
		
		System.out.println("======================");
		//lambda
		ar.stream().forEach(ele->System.out.println(ele));
		
		System.out.println("======================");
		//iterator
		
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		
		
	}
	
	

}
