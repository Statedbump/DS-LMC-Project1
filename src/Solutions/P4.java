package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import interfaces.MySet;
import mySetImplementations.Set2;
import setIntersectionFinders.AbstractIntersectionFinder;
/**
 * Luis M.Cintron Zayas
 * Est# 841-14-1275
 * CIIC 4020- sec 030
 **/

/**
 * 
 * @author Luis M.Cintron Zayas
 *
 * @param <E>
 */
public class P4<E>  extends AbstractIntersectionFinder<E>{

	public P4(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This is programer's 4 implementation, of intersectSets by counting frequency.
	 * Here we take all the elements in the array of sets and add them to an ArrayList
	 * After adding them to the list afterwards a  HashMap is created and elements will be put in that
	 * map, if the element is there we get the value and add one to it if it isn't we get a default value of 0 and add one 
	 * to the value when the element is added.
	 * Then a set of type 2 will be created and in there we will add all the keys in the map that contain as its value
	 * the number of crime events which is m 
	 * This set is the return value
	 * 
	 */
	@Override
	public MySet<E> intersectSets(MySet<E>[] t) {
		
		ArrayList<E> allElements = setsToList(t);
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
