# DS-LMC-Project1
## Luis M. Cintron Zayas
## 841-14-1275
## CIIC4020 - 030

## Execution of Program

  The program can be executed from the terminal(linux/unix) or the command prompt. To do so make sure
  you are in the correct directory path. If the program will be executed from an IDE, then head to
  p1MainClasses and run Part1Main or Part2Main.
  
 ### Part1Main
  To execute Part1Main from the terminal, head to the correct directory and write the following command
  java -classpath ./bin  p1MainClasses/Part1Main n
  
      Where n Specifies the Solutions:
      
        n = 1 ----> Executes P1's solution
        n = 2 ----> Executes P2's solution
        n = 3 ----> Executes P3's solution
        n = 4 ----> Executes P4's solution
        
     If no n or an invalid n is provided then the program will execute all solutions.
     
 ### Part2Main
 To execute Part2Main from the terminal, head to the correct directory and write the following command
  java -classpath ./bin  p1MainClasses/Part2Main n m isize fsize istep rep
  
    The followin parameters signify how the data will be generated:
    n-----> Number of Companies
    m-----> Number of Crime Events
    isize -----> Initial size for the data that will be generated
    fsize ------> The final size of the generated data
    isetp -------> Incremental size Step, how the much the size of data will increase per trial
    rep --------> The number of repetitions per size to find the average time of each implementation per size
    
 ## Part1Explination
 
  This part contains a working version of the four set intersection implementations (P1,P2,P3,P4)
  To further test each of these classes a P1tester.Class was added to the testerClasses package. Here each solution was tested with
  smaller parameters. To properly test if all solutions where properly implemented. 

## Part2 Explanation
 This part generates all results for the execution times of each one of the four strategies we provided
 and adds them to a text file.  "experimentalResults/allResults.txt". 
 
 ## Code Overview
  Here the name of each class that was created for this project and it what package they are will be provided.
  To completely understand the hierarchy of the classes please look at the uml design "Luis M.CintronZayas CIIC4020-030 -UMLDesign.ucls"
  
    
  ### dataGenerator
    
    ----> DataGenerator.java (This Class generates that data that will be added to the inputFiles folder
    ----> DataReader.java (This class is used to read all the files that were generated.
    
  ### ExperimentalClasses
    
    ----> ExperimentalController.java (This class is important for part two because it is the one that runs all the provided solutions and saves the results)
    ----> StrategiesTimeCollection.java (This class is used to run the trails of each solution and collects the time.
  
  ### Interfaces
  
    ---->IntersectionFinder.java (Provides all the method that will be used in the solutions of each programmer)
    ---->MySet.java (Provides the methods that each of the implemented sets will used)
  
  ### mySetImplementation
  
    ---->AbstractMySet.java (Provides the methods that are general to each of the sets that where implemented and add abstract methods
        that will have to be implemented different depending on the set.)
    ---->Set1.java (Implementation of mySet using ArrayList)
    ---->Set2.java (Implementation of mySet using HashMaps)
    
  ### p1MainClasses
  
    ---->FilesGeneratorMain.java (This main class creates all the files using the DataGenerator class of the DataGenerator package)
    ---->Part1Main.java (Provides the implementation of all solutions as stated above)
    ---->Part2Main.java (Collects the times of each trial of all solutions as stated above)
  
  ### setIntersectionFinder
    
    ---->AbstractIntersectionFinder.java (This class provides the constructor and getName method that will be used by each of the 4         solutions
    
 ### Solutions
 
    ----->P1P2.java (Provides an implementation of intersect sets of P1 and P2 where P1 uses Set1 for his implementation and P2 uses Set2 for his, they both have generally the same idea but there set implementations they used are really different from each other.
    ----->P3.java (Provides an implement of P3's solution where all elements are put in a sorted ArrayList and the elements that are repeated m times are added to a set of type Set2
    ----->P4.java (Provides an implement of P4's solution where all elements are put in a ArrayList and then those elements are added to a hash map with the value of how many times they appear, after that the elements that have a value equal to m are added to a set of type Set2.)
    
### TesterClases

    ----->DataGeneratorTester.java  (Tests if the data is generated properly and prints the sets and their sizes)
    ----->DataReaderTester.java(Tests if the data if being properly read from each file in the inputFiles folder of F_i_j)
    ----->P1tester.java (Testes all solutions (P1,P2,P3,P4) with smaller values)
 

## Conclusion
    This README file provides just simple instructions on how to run the program and a small overview of each class used in the project. For more information including the output of the testers and graph see the "LuisM.Cintron-CIIC4020.pdf" which will contain what is in this text file and more information.
    
  
    
     
    
