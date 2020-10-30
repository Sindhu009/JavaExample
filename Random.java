package xwork.com.FunctionalInterfaceFourTypes;

import java.util.function.Supplier;

public class Random {// example for Supplier Interface
	public static void main(String args[]) 
    { 
  
        // This function returns a random value. 
        Supplier<Double> randomValue = () -> Math.random(); 
  
        // Print the random value using get() 
        System.out.println(randomValue.get()); 
    } 



}
