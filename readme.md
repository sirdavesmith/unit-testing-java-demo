# Overview #
This demo project was created in response to an interview challenge. 

## Project Requirements Part 1 ##
1. Write a “Hello world” command line application. Use this as a starting point for the rest of the exam.
2. Create an interface with a method that can add two numbers:
    2. Create any necessary automated unit tests
    2. Hint: consider using a unit test framework or the equivalent
3. Implement a class that adds two numbers
    3. Add a feature that returns the mathematical result as a string 
4. Implement classes that subtract and multiply two numbers
    4. Add a feature to output the calculation to the command line
    4. Hint: consider implementing a base class
5. Create an array containing at least one of each of these three classes
    5. Iterate the array and output the results to the command line 
6. Read the following values from file and do the specified calculation: 
    6. +;1;2
    6. -;3;4
    6. *;5;-6
    6. Output results to the command line
    6. Add any additional values for testing purposes
7. Implement a class that performs the 1/x calculator operation
    7. Add tests and data that demonstrate this new feature

## Project Requirements Part 2 ##
NamesCount is a component for analyzing the proportion of names in a set of names.

For example:
NamesCount namesCount = new NamesCount(); namesCount.addName("James"); namesCount.addName("John"); namesCount.addName("Mary"); namesCount.addName("Mary");

Running namesCount.nameProportion("John") should return 0.25. And running namesCount.nameProportion("Mary") should return 0.5.

Fix the bugs in the code on the next page to accomplish these objectives, feel free to use your favorite ide. Write Tests for your methods.

Code Example

```
#!java
import java.util.HashMap;

public class NamesCount { 
    private int count;

    private HashMap<String, Integer> counts = new HashMap<String, Integer>(); 

    /**
    * Adds the name.
    * @param name Name. 
    */
    public void addName(String name) {
        Integer nameCount = counts.get(name);

        if (nameCount == null) { 
            nameCount = 0;
            counts.put(name, nameCount);
        }

        nameCount++;
        count++; 
    }

    /**
    * Returns proportion of parameter name in all calls to addName.
    * @param name Name.
    * @return Double in interval [0, 1]. Returns 0 if AddName has not been called. 
    */
    public double nameProportion(String name) { 
        return counts.get(name) / count;
    }

    public static void main(String[] args) {
        NamesCount namesCount = new NamesCount();

        namesCount.addName("James"); 
        namesCount.addName("John"); 
        namesCount.addName("Mary"); 
        namesCount.addName("Mary");

        System.out.println("Fraction of Johns: " + namesCount.nameProportion("John")); 
        System.out.println("Fraction of Marys: " + namesCount.nameProportion("Mary"));
    }
}

```

## Creating the Solution ##
Project Language: Java

Project Libraries and Technologies: Selenium, Maven, TestNG, and Lombok.

I spent just under two hours completing all project requirements. 

In order to see the project in action, I included a test.txt file under src > main > resources. 

This file is needed for the Math console application to work. 

On a Windows machine, it needs to be copied to the following location: c:\temp. 

This is due to the way I read in the file as noted in Main class operateOnTextFile() method on line 14.