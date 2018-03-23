package testerClasses;

import java.io.FileNotFoundException;
import java.util.Random;

import Solutions.P1P2;
import Solutions.P3;
import Solutions.P4;
import dataGenerator.DataGenerator;
import dataGenerator.DataReader;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;
import p1MainClasses.UnionOfSets;
/**
 * Luis M.Cintron Zayas
 * Est# 841-14-1275
 * CIIC 4020- sec 030
 **/
public class P1tester {
	
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) throws FileNotFoundException {
		DataGenerator dg = new DataGenerator(3,5,100);
		Integer[][][] data = (Integer[][][]) dg.generateData();
		P1P2 intersec1 = new P1P2("P1");
		P1P2 intersec2 = new P1P2("P2");
		P3 intersec3 = new P3("P3");
		P4 intersec4 = new P4("P4");
		
		UnionOfSets union = new UnionOfSets();
		MySet [] arr = union.Union(data,intersec1.getName());
		MySet [] arr2 = union.Union(data,intersec2.getName());
		MySet [] arr3 = union.Union(data,intersec3.getName());
		MySet [] arr4 = union.Union(data,intersec4.getName());
	
		
		
		
		Set1<Integer>s1 = (Set1<Integer>)intersec1.intersectSets(arr);
		Set2<Integer>s2 = (Set2<Integer>)intersec2.intersectSets(arr2);
		Set2<Integer>s3 = (Set2<Integer>)intersec3.intersectSets(arr3);
		Set2<Integer>s4 = (Set2<Integer>)intersec4.intersectSets(arr4);
		
		System.out.println("The Sets for testing are: ");
		dg.printSets();
		
		System.out.println("The Solutions for the intersections are:" );
		
		System.out.println("P1 solution: " + s1.toString());
		System.out.println("P2 solution: " + s2.toString());
		System.out.println("P3 solution: " + s3.toString());
		System.out.println("P4 solution: " + s4.toString());
		
	
	}

}
