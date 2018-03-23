package setIntersectionFinders;

import interfaces.IntersectionFinder;

/**
 * Luis M.Cintron Zayas
 * Est# 841-14-1275
 * CIIC 4020- sec 030
 **/

public abstract class AbstractIntersectionFinder<E> 
implements IntersectionFinder<E> {
	private String name;   // to identify the strategy
	public AbstractIntersectionFinder(String name) {
		this.name = name; 
	}

	public String getName() { 
		return name; 
	}
}
