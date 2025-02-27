package com.fundamental;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> counter = new HashSet<Integer>();
		//List<Integer> counter = new ArrayList<Integer>();
		counter.add(2);
		counter.add(23);
		counter.add(4);
		counter.add(43);
		counter.add(17);
		
		Iterator<Integer> it = counter.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);
			
			if(next == 17)
				it.remove();
		}
		
		System.out.println(counter);
	}

}
