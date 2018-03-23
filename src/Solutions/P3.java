package Solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;
import setIntersectionFinders.AbstractIntersectionFinder;
/**
 * 
 * @author Luis M. Cintron Zayas
 *
 * @param <E>
 */
public class P3<E> extends AbstractIntersectionFinder<E> {

	public P3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This implementation of intersectSets is based on Programmer's 3 
	 * solution. It takes the array of sets then adds every element into an ArrayList
	 * That list is then sorted, after that we count the frequency of each element if it 
	 * appears m times then that element is added to the Set of type Set2 
	 */
	public MySet<E> intersectSets(MySet<E>[] set) {

		int m = set.length;

		Set2<E> t = new Set2<E>(); 
		ArrayList<E> allElements = setsToList(set);
		allElements.sort(null);         
		E e = allElements.get(0); 
		Integer c = 1;
		for (int i=1; i < allElements.size(); i++) {
			if (allElements.get(i).equals(e)) 
				c++;
			else { 
				if (c==m) { 
					t.add(e);
				}

				e = allElements.get(i); 
				c = 1; 
			} 
		}
		if (c == m)
			t.add(allElements.get(allElements.size()-1));

		return t;
	}

	/**
	 * 
	 * @param t
	 * @return An arrayList containing all the elements in T
	 * 
	 */
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
