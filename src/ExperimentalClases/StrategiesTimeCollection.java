package ExperimentalClases;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;

import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;
import p1MainClasses.UnionOfSets;

/**
 * Luis M.Cintron Zayas
 * Est# 841-14-1275
 * CIIC 4020- sec 030
 */

/**
 * An object of this type will contain the results of random experiments
 * to estimate the average execution time per size of a particular strategy. 
 * It also stores the partial sum of the times that the particular strategy
 * has taken during the experimental trials. 
 * 
 * An object of this type will embed a particular strategy. When that particular
 * strategy is executed from an ExperimentController object, this object will 
 * contain the computed average execution times for each input size that it
 * has experimented with. 
 * 
 * Notice that this is implemented as a subclass of 
 * ArrayList<Matp.Entry<Integer, Float>>
 * 
 * @author pedroirivera-vega
 *
 */
public class StrategiesTimeCollection<E> 
extends ArrayList<Map.Entry<Integer, Float>> {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IntersectionFinder<Integer> strategy;  
  
   
    public  UnionOfSets<E> union = new UnionOfSets<E>();// the strategy
    private float sum;   
    // variable to accumulate the sum of times that different
    // executions for the same time take. It is eventually used
    // to determine the average execution time for a particular 
    // size.....
    
    public StrategiesTimeCollection(IntersectionFinder<Integer> strategy) { 
        this.strategy = strategy; 
    } 
    
    public String getStrategyName() { 
        return strategy.getName(); 
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void runTrial(Object[][][] data) throws FileNotFoundException { 
        	MySet[] t =  union.Union(data, getStrategyName());
    	
        strategy.intersectSets(t);
    	
    }
    
    public void resetSum() { 
    	sum = 0.0f; 
    }
    
    public void incSum(float t) { 
    	sum += t; 
    }
    
    public float getSum() { 
    	return sum; 
    }
    
}