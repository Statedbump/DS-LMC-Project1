package p1MainClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dataGenerator.DataReader;
import interfaces.IntersectionFinder;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;

public class UnionOfSets<E> { 
	
	

@SuppressWarnings({ "rawtypes", "unchecked" })
public MySet[] Union( Object [][][]  data, String s) throws FileNotFoundException {
	
	String parentDirectory = "inputFiles"; 
	Scanner parameters = new Scanner(new File(parentDirectory, "parameters.txt")); 
	int n = parameters.nextInt(); 
	int m = parameters.nextInt();
	parameters.close();
	MySet[] t = this.setArrInitializer(s,m);

	for(int j = 0 ; j<m ; j++ ) {
		for(int i = 0 ; i <n ;i++) {
			for(int k = 0 ; k < data[i][j].length; k++) {
				t[j].add(data[i][j][k]);
			}
		}
	
	}
	return t;
	
}

@SuppressWarnings("rawtypes")
public MySet[] setArrInitializer(String s,int size) {
	if(s.equalsIgnoreCase("P1")) {
		Set1[] t = new Set1[size];
		for(int i = 0 ; i < t.length;i++) {
			t[i] = new Set1<E>();
		}
		return t;
	}
		else if(s.equalsIgnoreCase("P2")||s.equalsIgnoreCase("P3")
				||s.equalsIgnoreCase("P4")) {
			Set2[] t = new Set2[size];
			for(int i = 0 ; i < t.length;i++) {
				t[i] = new Set2<E>();
			}
			return t;
			
		}
	return null;
	

	
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
