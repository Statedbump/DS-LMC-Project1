package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import interfaces.MySet;
import mySetImplementations.Set2;
import setIntersectionFinders.AbstractIntersectionFinder;

public class P4<E>  extends AbstractIntersectionFinder<E>{

	public P4(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MySet<E> intersectSets(MySet<E>[] t) {
		
		ArrayList<E> allElements = setsToList(t);
		allElements.sort(null);
		
		HashMap<E, Integer> map = new HashMap<E,Integer>(); 
		for (E e : allElements) { 
		     Integer c = map.getOrDefault(e, 0); 
		     map.put(e, c+1); 
		}
		Set2<E> t1 = new Set2<E>(); 
		for (Map.Entry<E, Integer> entry : map.entrySet())
		     if (entry.getValue() == t.length) 
		        t1.add(entry.getKey());

		return t1;
	}
	
	public  ArrayList<E> setsToList(MySet<E>[] t){
		ArrayList<E> theList = new ArrayList<E>();
		for(int i = 0 ; i < t.length ; i++) {
			for(E e: t[i]) {
				theList.add(e);
			}
		}
		return theList;
		
	}

}
