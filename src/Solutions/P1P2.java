package Solutions;

import interfaces.MySet;
import setIntersectionFinders.AbstractIntersectionFinder;

public class P1P2<E> extends AbstractIntersectionFinder<E> {


	public P1P2(String name) {
		super(name);
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public MySet<E> intersectSets(MySet<E>[] t) {
		
		MySet<E> t1;
		try {
			t1 = (MySet<E>) t[0].clone();
			for(int j = 1 ;j < t.length;j++) {
				for(E e: t[0]) 
					if(!t[j].contains(e)) {
						t1.remove(( e));
					}

			}
			return t1;
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
		
		
	}
}
