package p1MainClasses;

import java.io.FileNotFoundException;

import Solutions.P1P2;
import Solutions.P3;
import Solutions.P4;
import dataGenerator.DataReader;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;

public class P1Main {
	

		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) throws FileNotFoundException {
		DataReader dr = new DataReader();

		P1P2 intersec = new P1P2("set2");
		P3 intersec2 = new P3("set3");
		P4 intersec4 = new P4("set4");
		
		UnionOfSets union = new UnionOfSets();
		Set1 [] arr = new Set1[dr.getM()];
		Set2 [] arr2 = new Set2[dr.getM()];
		for(int i =0 ; i<arr.length&& i<arr2.length;i++) {
			arr[i] = new Set1<Integer>();
			arr2[i] = new Set2<Integer>();
		}

		union.UnionfoSets(dr, arr);
		union.UnionfoSets(dr, arr2);
		Set2<Integer>s2 = (Set2<Integer>)intersec.intersectSets(arr2);
		Set1<Integer>s1 = (Set1<Integer>)intersec.intersectSets(arr);
		Set1<Integer>s3 = (Set1<Integer>)intersec2.intersectSets(arr2);
		Set2<Integer>s4 = (Set2<Integer>)intersec4.intersectSets(arr2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
//		for(int i = 0; i< arr2.length;i++) {
//			System.out.println(arr2[i].toString());
//			
//		}
		
	
		
		}
		

	
			

}
