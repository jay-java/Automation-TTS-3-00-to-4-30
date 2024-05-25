package core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class P025_Set {
	public static void main(String[] args) {
		Set list = new HashSet();
		list.add(1);
		list.add("java");
		list.add(3243.3);
		list.add(false);
		list.add('f');
		list.add(34655465);
		System.out.println(list);
		list.add(4654);
		list.add(1);
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
