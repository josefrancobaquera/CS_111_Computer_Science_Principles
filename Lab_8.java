// Jose Franco Baquera
// October 10, 2016
// This allgorithm allows users to convert a decimal number to a binary number
// User inputs a positive number
// If number inputted is negative, allogrithm exists
// If done correctly, two lines with both the decimal number and the binary number are displayed
// I solved this problem by using previous labs and debugging the program 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner; 

class Lab8 {
    
      public static void main(String[] args) {
      
      List L = new ArrayList();// Initializes "list L"
      
      int n;// Inizializes variable "n"
      int r;// Inizializes variable "r"
      Scanner input = new Scanner( System.in );// Allows users to input numbers
      
      // The following three lines allows users to input a number
      
      System.out.println("Give me a number");// Prints out "Give me a number"
      n = input.nextInt();// Assigns the number inputted by user to variable "n"
      System.out.println("Decimal: " +n);// Prints out "Decimal:" PLUS the number inputted (ie. variable "n")     
      
      // The following if loop allows error checking
      
      if (n < 0)// if loop that allows allogrithm to stop if the number inputted (ie. variable "n") is less than zero
         {
         System.out.println("Input needs to be positive");// Prints out "Input needs to be positive" so user knows that the number inputted has to be positive
         System.exit(0);// The entire allgorithm/program ends
         }
      
      // The following while loop stores remainders in a list, as well as updating the variable "n"
      
      while (n > 0)// while loop that makes the allgorithm (only if "n" is greater than 0) assign the remainder when dividing "n" by 2 to r, then adds it to the list. In addition, the variable n is devided by 2 and updated
         {
         r = n % 2;// Assigns the remainder of dividing "n" by 2 
         n = n/2;// Updates the variable "n" by dividing it by 2
         L.add(0 , r); // Adds remainder to list L.
         }
      
      System.out.print("Binary: ");// Prints out "Binary:"
      
      // for loop that makes it possible to print the binary numbers (ie. in this case the list)
      
      for (int i=0; i< L.size(); i ++)// Definite for loop that initializes variable "i", and while "i" is smaller than the size of list L, it adds one to it
         
         System.out.print(L.get(i)); // Prints out Binary numbers 
         
         System.out.println(); // Leaves a space inbetween the Binary output list and the "jGRASP: operation complete"
      
     }// End Main

}//Lab 8