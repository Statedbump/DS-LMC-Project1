package p1MainClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dataGenerator.DataReader;
import interfaces.MySet;
import mySetImplementations.Set1;

public class UnionOfSets { 
	
	

@SuppressWarnings({ "rawtypes", "unchecked" })
public MySet[] UnionfoSets( DataReader dr, MySet[] t) throws FileNotFoundException {

	
	Integer[][][] data = (Integer[][][]) dr.readDataFiles();
	
	for(int j = 0 ; j<dr.getM() ; j++ ) {
		for(int i = 0 ; i <dr.getN() ;i++) {
			for(int k = 0 ; k < data[i][j].length; k++) {
				t[j].add(data[i][j][k]);
			}
		}
	}
	return t;
	
}
/**
 * String parentDirectory = "inputFiles"; 
			Scanner parameters = new Scanner(new File(parentDirectory, "parameters.txt")); 
			int n = parameters.nextInt(); 
			int m = parameters.nextInt();
			parameters.close();
			DataReader dr = new DataReader();
			Integer[][][] data = (Integer[][][])dr.readDataFiles();
			MySet<?>[] t = new Set1<?>[m]; 
			for (int i = 0; i < t.length; ++i) {
			    t[i] = new Set1<Integer>();
			}
			
			for(int j = 0 ; j<m ; j++ ) {
				for(int i = 0 ; i < n ;i++) {
					for(Integer e : data[i][j]) {
						((Set1<Integer>)t[j]).add(e);
					}
				}
			}
			return (Set1<Integer>[])t;
	}
**/

}
