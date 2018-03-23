package ExperimentalClases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

import dataGenerator.DataGenerator;

/**
 * This class represents an object data type that is able to carry the 
 * necessary experiments to estimate execution times of particular 
 * strategies to solve the set intersections problem as in p1_40354020_172. 
 * 
 * @author pedroirivera-vega
 *
 */
public class ExperimentController<E>{
	
	private int initialSize;           // initial size to be tested
	private int repetitionsPerSize;    // experimental repetitions per size
	private int incrementalSizeStep;   // change of sizes (size delta)
	private int finalSize;             // last size to be tested
	private int paramN;				   // Parameters of the number of Companies N
	private int paramM;                // Parameters of the number of crime events M
	
	private ArrayList<StrategiesTimeCollection<E>> resultsPerStrategy; 
	
	public ExperimentController(int n, int m, int is, int fs, int iss, int rps) { 
		paramN = n;
		paramM = m;
		initialSize = is; 
		repetitionsPerSize = rps; 
		incrementalSizeStep = iss; 
		finalSize = fs; 
		resultsPerStrategy = new ArrayList<>(); 
		

	}
	
	public void addStrategy(StrategiesTimeCollection<E> strategy) { 
		resultsPerStrategy.add(strategy); 
	}

	public void run() throws CloneNotSupportedException, FileNotFoundException { 
		if (resultsPerStrategy.isEmpty())
			throw new IllegalStateException("No strategy has been added."); 
		for (int size=initialSize; size<=finalSize; size+=incrementalSizeStep) { 
			// For each strategy, reset the corresponding variable that will be used
			// to store the sum of times that the particular strategy exhibits for
			// the current size size
			for (StrategiesTimeCollection<E> strategy : resultsPerStrategy) 
				strategy.resetSum();  
			
			// Run all trials for the current size. 
			for (int r = 0; r<repetitionsPerSize; r++) {
				// The following will be the common dataset to be used in the current 
				// trial by all the strategies being tested.
				Object[][][] data = generateData(size);  
				
				// Apply each one of the strategies being tested using the previous 
				// dataset (of size size) as input; and, for each, estimate the time
				// that the execution takes. 
				for (StrategiesTimeCollection<E> strategy : resultsPerStrategy) {  
					// no need to clone the data set to be used by each strategy since
					// no modification of it is done in the process...
					long startTime = System.nanoTime(); // System.currentTimeMillis();   // time before

					strategy.runTrial((Integer[][][]) data.clone());   // run the particular strategy...
					
					long endTime = System.nanoTime(); // System.currentTimeMillis();    // time after

					// accumulate the estimated time (add it) to sum of times that
					// the current strategy has exhibited on trials for datasets
					// of the current size. 
					strategy.incSum((int) (endTime-startTime));    
					
				}
			}
			
			for (StrategiesTimeCollection<E> strategy : resultsPerStrategy) { 
				strategy.add(new AbstractMap.SimpleEntry<Integer, Float>
				(size, (strategy.getSum()/((float) repetitionsPerSize)))); 
			}

			

		}
	}
	
	private Object[][][] generateData(int size) {
		DataGenerator dg = new DataGenerator(paramN, paramM, size);
		Object[][][] data = dg.generateData();  

		return data;
	}

	public void saveResults() throws FileNotFoundException { 
		PrintStream out = new PrintStream(new File("experimentalResults", "allResults.txt"));
		out.print("Size");
		for (StrategiesTimeCollection<E> trc : resultsPerStrategy) 
			out.print("\t" + trc.getStrategyName()); 
		out.println();

		int numberOfExperiments = resultsPerStrategy.get(0).size(); 
		for (int i=0; i<numberOfExperiments; i++) {
			out.print(resultsPerStrategy.get(0).get(i).getKey());
			for (StrategiesTimeCollection<E> trc : resultsPerStrategy)
				out.print("\t" + trc.get(i).getValue());
			out.println(); 
		}
			
		out.close();
		
	}
}