package p1MainClasses;

import java.io.File;


import java.io.FileNotFoundException;
import java.util.Scanner;

import dataGenerator.DataReader;
import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;

/**
 * 
 * @author Luis M. Cintron Zayas
 *
 * @param <E>
 */
public class UnionOfSets<E> { 
	
	
	/**
	 * 
	 * This class is used to construct a set with the union of of all the given data Files ij, 
	 * as specified by Mrs. Espargata's plan. Depending on which of the suggested
	 * solutions we need it will initialize the sets inside as type Set1 or Set2
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	/**	 
	 * @param data  
	 * @param the String name  should be the name of the suggested solution P1,P2,P3 or P4
	 * @return 
	 * @throws FileNotFoundException
	 */
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MySet[] Union(Object[][][] data, String name) throws FileNotFoundException{
		int m = data[0].length; //This is the parameter m, which signifies the number of crime events
		int n = data.length;    //This is the parameter n, which signifies the number of companies
		MySet[] T = new MySet[m];
		// An array of sets is created with a size which is the number of crime events
		for(int j = 0 ; j<m; j++ ) {
			if(name.equals("P1")){
				//Because P1 is the only one of the solutions that uses sets of type Set1  
				// if the name of the intersection is not P1 then the sets will be initialized as Set2 
				T[j] = new Set1<E>();
			}
			else{
				T[j] = new Set2<E>();
			}
			for(int i=0; i<n; i++) {
				for(int k = 0 ; k < data[i][j].length; k++) {
					T[j].add(data[i][j][k]); 
				}
			}
		}
		return T; //return union set
	}
}

