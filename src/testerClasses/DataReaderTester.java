package testerClasses;

import java.io.FileNotFoundException;

import dataGenerator.DataReader;
/**
 * Luis M.Cintron Zayas
 * Est# 841-14-1275
 * CIIC 4020- sec 030
 **/
public class DataReaderTester {
public static void main(String[] args) throws FileNotFoundException {
	DataReader dr = new DataReader();
	dr.readDataFiles();
	dr.printSets();
	
}
}
