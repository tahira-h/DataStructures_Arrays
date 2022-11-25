package Arrays_1;
import java.io.Console;
import java.util.*;

public class DataStructureArrays {

// 1. Write a program to sum all the values of a given Array in Java.
	
	public static void main(String[] args) {
		String[] givenArray = {"Sara", "Jane", "Sam", "Allen", "Joe"}; 
		
		// .length
		int sumOfAll = givenArray.length;
		System.out.println(sumOfAll);
	}

// 2. What is the output?		//debug(i.e. correct the code given from instructions)
	public static void main_2(String[] args) {
		double[] exampleArray = {1,5,6,5,4,1}; 
		
		double maximum = exampleArray[0];
		
		int index = 0;
		
		for(int i=1; i<exampleArray.length; i++) {
			if(exampleArray[i] > maximum); {
				
				index = i;
			}
		}

		// print index here (i.e.scope)
		System.out.println(index);
		
		//practice print for toPower(4,2);
//		System.out.println(toPower(4,2));	// will not print here
	}
	
// 3. Write a public static method called "toPower" that takes in as parameters 
//	two integers called size and power. The method should return an array of 
//	size "size" with each array index raised to the value of "power." So, for example, 
//	if we passed in "size = 4" and "power = 2" to the "toPower," the method should 
//	return the following result: [0,1,4,9].
	
	public static ArrayList<Integer> toPower(Integer size, Integer power){
//		System.out.print(toPower(4,2));	// will not print here (i.e. tried print and println)
		ArrayList<Integer> arrayIndex = new ArrayList<Integer>();
		
		return(arrayIndex);
		
		// print for toPower(4,2);
//		System.out.println(toPower(4,2));	//will not work try above toPower() method
		
	}
	
// End of DataStructureArrays class
}
