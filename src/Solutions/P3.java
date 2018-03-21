package Solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;
import setIntersectionFinders.AbstractIntersectionFinder;

public class P3<E> extends AbstractIntersectionFinder<E> {

	public P3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//This implementation May only be used with type set 2
	// I need to find a way to not accept if its not Set2 possibly throw an exception
	@Override
	public MySet<E> intersectSets(MySet<E>[] t) {

		int m = t.length;
		
		ArrayList<E> allElements = this.setsToList(t);
		allElements.sort(null);
		
		MySet<E> t1 = new Set1<E>(); 
		E e  = allElements.get(0);
		System.out.println(allElements.toString());

		
		Integer c = 1;
		for (int i=1; i < allElements.size(); i++) {
		    if (allElements.get(i).equals(e)) 
		       c++;
		    else { 
		       if (c == m) {
		          t1.add(e); }   // m is as in the previous discussion
		       e = allElements.get(i); 
		       c = 1; 
		    } 
		}
		if (c == m)
		    t1.add(allElements.get(allElements.size()-1));

		
		
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
