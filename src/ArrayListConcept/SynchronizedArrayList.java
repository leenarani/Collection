package ArrayListConcept;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("Tom");
		list.add("Steve");
		list.add("Jerry");
		list.add("Cherry");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
