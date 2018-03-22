package Solutions;


import java.util.Iterator;

import interfaces.MySet;
import setIntersectionFinders.AbstractIntersectionFinder;

public class P1P2<E> extends AbstractIntersectionFinder<E> {


	public P1P2(String name) {
		super(name);
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	
		
		public MySet<E> intersectSets(MySet<E>[] t) {
			// TODO Auto-generated method stub
			MySet<E> intersection = t[0];
			for(int i=1; i<t.length; i++) {
				MySet<E> s = t[i];
				Iterator<E> iterator = intersection.iterator();
				while(iterator.hasNext()) {
					E e = iterator.next();
					if(!(s.contains(e)))
						iterator.remove();
				}
			}
			return intersection;
	
		
	}
}
