package p1MainClasses;

import java.io.FileNotFoundException;

import Solutions.P1P2;
import Solutions.P3;
import Solutions.P4;
import dataGenerator.DataReader;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;
/**
 * Luis M.Cintron Zayas
 * Est# 841-14-1275
 * CIIC 4020- sec 030
 */
public class Part1Main<E> {


	private static MySet[] t;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws FileNotFoundException {
		

		Object[][][] dataSet;
		DataReader input = new DataReader();
		UnionOfSets union = new UnionOfSets();
		

		if (args.length ==1) {

			System.out.println("Crime Event Solutions");

			try {

				
				
				try {

					dataSet = input.readDataFiles();
					


					if (args[0].equals("1")) {
						//TODO: P1
						P1P2 p1 = new P1P2("P1");
						t = union.Union(dataSet, p1.getName());

						System.out.print("Final set by P1: ");
						System.out.println(p1.intersectSets(t));

					}

					if (args[0].equals("2")) {
						//TODO: P2
						P1P2 p2 = new P1P2("P2");
						t = union.Union(dataSet, p2.getName());

						System.out.print("Final set by P2: ");
						System.out.println(p2.intersectSets(t));

					}

					if (args[0].equals("3")) {
						//TODO: P1

						P3 p3 = new P3("P3");
						t = union.Union(dataSet, p3.getName());

						System.out.print("Final set by P3: ");
						System.out.println(p3.intersectSets(t));

					}

					if (args[0].equals("4")) {
						//TODO: P1
						P4 p4 = new P4("P4");
						t = union.Union(dataSet, p4.getName());

						System.out.print("Final set by P4: ");
						System.out.println(p4.intersectSets(t));
					}

					



					

				} catch (FileNotFoundException e) {
					System.out.println("File Not Found in directory");
					throw new Exception("ERROR");
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		else {
			dataSet = input.readDataFiles();

			P1P2 p1 = new P1P2("P1");
			P1P2 p2 = new P1P2("P2");
			P3 p3 = new P3("P3");
			P4 p4 = new P4("P4");


			System.out.print("Final set by P1: ");
			System.out.println(p1.intersectSets(union.Union(dataSet, p1.getName())));
			System.out.print("Final set by P2: ");
			System.out.println(p2.intersectSets(union.Union(dataSet, p2.getName())));
			System.out.print("Final set by P3: ");
			System.out.println(p3.intersectSets(union.Union(dataSet, p3.getName())));
			System.out.print("Final set by P4: ");
			System.out.println(p4.intersectSets(union.Union(dataSet, p4.getName())));		

		}
	}
}