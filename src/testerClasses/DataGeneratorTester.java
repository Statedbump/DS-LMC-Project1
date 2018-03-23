package testerClasses;

import java.io.FileNotFoundException;

import dataGenerator.DataGenerator;
import dataGenerator.DataReader;
import mySetImplementations.Set1;
import p1MainClasses.UnionOfSets;
/**
 * Luis M.Cintron Zayas
 * Est# 841-14-1275
 * CIIC 4020- sec 030
 **/
public class DataGeneratorTester {

	public static void main(String[] args) throws FileNotFoundException {
		int totalSize = 300; 
		int n = 3, m = 5; 
		DataGenerator dg = new DataGenerator(n, m, totalSize);
		dg.generateData(); 
		dg.printSizes();
		dg.printSets();
		
	
		}
		
	
	}
	


