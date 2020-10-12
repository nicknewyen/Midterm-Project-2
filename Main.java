// Author:	Nicholas Nguyen
// Date:	10/11/2020
// Class:	CS 3310.02

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
	
	// Fill array with random integers
	public static void fillWithRandomInts(int[] array) {
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(200)-100; // Fill array with random numbers;
		}
		Arrays.sort(array);
	}
	
	// Brute Force  (Traverses twice)
	// Uses nested for loop to find the mark value 
	private int[] twoSumBrute(int[] value, int mark) {
		
		int[] pair = new int[2];
	    for (int i = 0; i < value.length; i++) {
	        for (int j = i + 1; j < value.length; j++) {
	            if (value[j] == mark - value[i]) {
	            	pair[0] = value[i];
	            	pair[1] = value[j];
	                return pair;
	            }
	        }
	    }
	    throw new IllegalArgumentException("Error: Cannot find a pair!");
	}
	
	// Optimal Solution (Only traverses ONCE)
	// 1. Use a hashmap to store the value
	// 2. Use a for loop to traverse the list searching for a complement value, which gives the mark value
	private int[] twoSumHash(int[] value, int mark) {
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    int[] hashPair = new int[2];
	    for (int i = 0; i < value.length; i++) {
	        map.put(value[i], i);
	    }
	    for (int i = 0; i < value.length; i++) {
	        int complement = mark - value[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	        	hashPair[0] = value[i];
	        	hashPair[1] = complement;
	        	return hashPair;
	        }
	    }
	    throw new IllegalArgumentException("Error: Cannot find a pair!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main brute = new Main();
		Random rand = new Random();
		
		int randomSum1 = rand.nextInt(200)-100;
		int randomSum2 = rand.nextInt(200)-100;
		int randomSum3 = rand.nextInt(200)-100;
		int randomSum4 = rand.nextInt(200)-100;
		int randomSum5 = rand.nextInt(200)-100;
		
		int array1[] = new int[100];
		int array2[] = new int[100];
		int array3[] = new int[100];
		int array4[] = new int[100];
		int array5[] = new int[100];
		
		fillWithRandomInts(array1);
		fillWithRandomInts(array2);
		fillWithRandomInts(array3);
		fillWithRandomInts(array4);
		fillWithRandomInts(array5);
		
		int[] solution = new int[2];
		System.out.println("Randomly Generated Number for Array 1: " + randomSum1 + " \n");
		System.out.println("BRUTE FORCE METHOD:");
		long nano_array1_startTime = System.nanoTime();
		solution = brute.twoSumBrute(array1, randomSum1);
        long nano_array1_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array1_endTime-nano_array1_startTime) + " ns \n");
        
        System.out.println("HASH MAP METHOD");
		long nano_array2_startTime = System.nanoTime();
		solution = brute.twoSumHash(array1, randomSum1);
        long nano_array2_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array2_endTime-nano_array2_startTime) + " ns \n\n=============================================================================\n");
        // ===================================================================================================
        
		System.out.println("Randomly Generated Number for Array 2: " + randomSum2 + "\n");
		System.out.println("BRUTE FORCE METHOD:");
		long nano_array3_startTime = System.nanoTime();
		solution = brute.twoSumBrute(array2, randomSum2);
        long nano_array3_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array3_endTime-nano_array3_startTime) + " ns \n");
        
        System.out.println("HASH MAP METHOD");
		long nano_array4_startTime = System.nanoTime();
		solution = brute.twoSumHash(array2, randomSum2);
        long nano_array4_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array4_endTime-nano_array4_startTime) + " ns \n\n=============================================================================\n");
        // ===================================================================================================
        
		System.out.println("Randomly Generated Number for Array 3: " + randomSum3 + "\n");
		System.out.println("BRUTE FORCE METHOD:");
		long nano_array5_startTime = System.nanoTime();
		solution = brute.twoSumBrute(array3, randomSum3);
        long nano_array5_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array5_endTime-nano_array5_startTime) + " ns \n");
        
        System.out.println("HASH MAP METHOD");
		long nano_array6_startTime = System.nanoTime();
		solution = brute.twoSumHash(array3, randomSum3);
        long nano_array6_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array6_endTime-nano_array6_startTime) + " ns \n\n=============================================================================\n");
        // ===================================================================================================
        
		System.out.println("Randomly Generated Number for Array 4: " + randomSum4 + "\n");
		System.out.println("BRUTE FORCE METHOD:");
		long nano_array7_startTime = System.nanoTime();
		solution = brute.twoSumBrute(array4, randomSum4);
        long nano_array7_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array7_endTime-nano_array7_startTime) + " ns \n");
        
        System.out.println("HASH MAP METHOD");
		long nano_array8_startTime = System.nanoTime();
		solution = brute.twoSumHash(array4, randomSum4);
        long nano_array8_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array8_endTime-nano_array8_startTime) + " ns \n\n=============================================================================\n");
        // ===================================================================================================
        
		System.out.println("Randomly Generated Number for Array 5: " + randomSum5 + "\n");
		System.out.println("BRUTE FORCE METHOD:");
		long nano_array9_startTime = System.nanoTime();
		solution = brute.twoSumBrute(array5, randomSum5);
        long nano_array9_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array9_endTime-nano_array9_startTime) + " ns \n");
        
        System.out.println("HASH MAP METHOD");
		long nano_array10_startTime = System.nanoTime();
		solution = brute.twoSumHash(array5, randomSum5);
        long nano_array10_endTime = System.nanoTime();
        System.out.println("Pair Found: " + solution[0] + " + " + solution[1] + " = " + (solution[1] + solution[0]));
        System.out.println("Elapsed time: " + (nano_array10_endTime-nano_array10_startTime) + " ns \n");
        // ===================================================================================================
        
        
	}
}
