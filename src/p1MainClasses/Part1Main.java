package p1MainClasses;

import java.io.FileNotFoundException;

import Solutions.P1P2;
import Solutions.P3;
import Solutions.P4;
import dataGenerator.DataReader;
import interfaces.MySet;
import mySetImplementations.Set1;
import mySetImplementations.Set2;

public class Part1Main<E> {


	private static MySet[] t;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws FileNotFoundException {

		Object[][][] dataSet;
		args = new String[1];
		args[0] = null;

		if (args.length<=1) {

			System.out.println("Crime Event Solutions");

			try {

				DataReader input = new DataReader();

				try {

					dataSet = input.readDataFiles();
					UnionOfSets union = new UnionOfSets();


					if (args[0] == "1") {
						//TODO: P1
						P1P2 p1 = new P1P2("P1");
						t = union.Union(dataSet, p1.getName());

						System.out.print("Final set by P1: ");
						System.out.println(p1.intersectSets(t));

					}

					if (args[0] =="2") {
						//TODO: P2
						P1P2 p2 = new P1P2("P2");
						t = union.Union(dataSet, p2.getName());

						System.out.print("Final set by P2: ");
						System.out.println(p2.intersectSets(t));

					}

					if (args[0] =="3") {
						//TODO: P1

						P3 p3 = new P3("P3");
						t = union.Union(dataSet, p3.getName());

						System.out.print("Final set by P3: ");
						System.out.println(p3.intersectSets(t));

					}

					if (args[0] =="4") {
						//TODO: P1
						P4 p4 = new P4("P4");
						t = union.Union(dataSet, p4.getName());

						System.out.print("Final set by P4: ");
						System.out.println(p4.intersectSets(t));
					}

					if (args[0] == null) {


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

				} catch (FileNotFoundException e) {
					System.out.println("File Not Found in directory");
					throw new Exception("ERROR");
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		else {
			System.out.println("Please choose of of the Programers Solution"
					+ "\n for P1 write 1," + "\n for P2 write 2,"
					+ "\n for P3 write 3,"+ "\n for P4 write 4,"
					+ "\n for all  press enter");			

		}
	}
}