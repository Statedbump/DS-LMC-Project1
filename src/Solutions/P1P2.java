package Solutions;


import java.util.Iterator;


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

public class P1P2<E> extends AbstractIntersectionFinder<E> {


	public P1P2(String name) {
		super(name);

	}
	

	
	@SuppressWarnings("unchecked")
	@Override
	/**
	 * This implementation of the intersection finder is based on 
	 * Programmers 1 and 2 solutions. If P1 is being implemented
	 * then Set1 is used, if not Set2 is used.
	 */
	public MySet<E> intersectSets(MySet<E>[] t) {
		
		MySet<E> T;
		try {
			if(this.getName().equals("P1")) {
				// The set at index 0 is first cloned
				T = (Set1<E>)t[0].clone();
				
				}else {
				T = (Set2<E>)t[0].clone();
				}
			
			for(int j = 1 ;j < t.length;j++) {
				for(E e: t[0]) 
					if(!t[j].contains(e)) {
						//For each elements in t[0], the element is not in any of the
						//other sets T[j]  then it is removed from the cloned set.
						T.remove(( e));
					}

			}
			return T;
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;


	}
}
