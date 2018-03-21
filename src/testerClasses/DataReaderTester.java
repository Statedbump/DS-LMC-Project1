package testerClasses;

import java.io.FileNotFoundException;

import dataGenerator.DataReader;

public class DataReaderTester {
public static void main(String[] args) throws FileNotFoundException {
	DataReader dr = new DataReader();
	dr.readDataFiles();
	dr.printSets();
	
}
}
