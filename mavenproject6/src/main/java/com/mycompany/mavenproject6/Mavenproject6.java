/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author almadkhal6
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        
       // Java Program to illustrate the use of continue statement
// inside the While loop

	// Main driver method
	
	{
	// Initializing a variable say it count to a value
		// greater than the value greater among the loop
		// values
		int count = 20;
		// While loop for iteration
		while (count >= 0) {
			if (count == 7 || count == 15) {
				count--;
				// Decrementing variable initialized above
				// Showing continue execution inside loop
				// skipping when count==7 or count==15
				continue;
			}
			// Printing values after continue statement
			System.out.print(count + " ");

			// Decrementing the count variable
			count--;
		}
	} 
        
   
        
        
        
        
        
        
        
        
        System.out.println("Hello World!");
    }
}
