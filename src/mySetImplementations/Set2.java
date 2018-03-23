package mySetImplementations;

import java.lang.reflect.MalformedParametersException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import interfaces.MySet;
/**
 * Luis M.Cintron Zayas
 * Est# 841-14-1275
 * CIIC 4020- sec 030
 */
public class Set2<E> extends AbstractMySet<E> {
	   private HashMap<E, E> elements; 
	   public Set2() { 
	       elements = new HashMap<>(); 
	   }
	   public int size() { 
		   return elements.size(); 
	   } 
	   public boolean contains(E e) { 
	      return elements.containsValue(e);  
	   } 
	   public void add(E e) { 
	      elements.put(e, e); 
	     
	   } 
	   public void remove(E e) { 
	      elements.remove(e); 
	   } 
	   public Iterator<E> iterator() {   
	      return elements.keySet().iterator(); 
	   }  
	   public Object clone() throws CloneNotSupportedException { 
		   Set2<E> setClone = new Set2<>(); 
		   setClone.elements = (HashMap<E,E>)this.elements.clone(); 
		   return setClone; 
	   }
	   

}
