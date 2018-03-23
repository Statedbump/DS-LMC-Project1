package p1MainClasses;

import java.io.FileNotFoundException;

import ExperimentalClases.ExperimentController;
import ExperimentalClases.StrategiesTimeCollection;
import Solutions.P1P2;
import Solutions.P3;
import Solutions.P4;

public class Part2Main {

	private static int[] parms = {20,50,1000,50000,1000,200};
	// min size, max size, size increment, number of trials per size/strategy
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException {
		if (args.length > 6)
			System.out.println("Unexpected number of parameters.");
		for (int i=0; i<args.length; i++)
			parms[i] = Integer.parseInt(args[i]); 
		
		// Parm1: n
		// Parm2: m
		// Parm3: initial size
		// Parm4: final size to consider
		// Parm5: incremental steps (size)
		// Parm6: trials per size
		
		ExperimentController p2m = new ExperimentController(parms[0], parms[1], parms[2], parms[3], parms[4], parms[5]); 
		
	
		p2m.addStrategy(new StrategiesTimeCollection(new P1P2("P1")));
		p2m.addStrategy(new StrategiesTimeCollection(new P1P2("P2")));
		p2m.addStrategy(new StrategiesTimeCollection(new P3("P3")));
		p2m.addStrategy(new StrategiesTimeCollection(new P4("P4")));
		p2m.run();    // run the experiments on all the strategies added to the controller object (ec)
		
		// save the results for each strategy....
		try {
			p2m.saveResults();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
