// Jose Franco Baquera
// September 30, 2016
// Algorithm that allows users to input numbers (0 to stop) and prints the numbers inputted in accending order
// The SUM and AVERAGE are also printed

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner; // Load the scanner utility

class Lab7 {
 
    public static void main(String[] args) {
        
        double n; // Inizializes the varible "n"
        double sum; // Inizializes the variable "sum"
        double average; // Inizializes the variable "average"
        
        Scanner input = new Scanner( System.in ); //Define the scanner
         
        List L = new ArrayList(); // Assigns L to arrarylist
       
        n=1.0;// Read in the floats
        
        while ( n != 0.0 ) // While loop that allows user to input numbers (stops when 0 is inputted) 
          {
             System.out.println("Please input a number");
             n = input.nextDouble();
             if ( n != 0.0) L.add(n);
             System.out.println("read in " + n);
          
          }
        
        sum =0; // "sum" varibale is set equal to zero
        Collections.sort(L); // List is sorted in accending order

        for (int i=0; i< L.size(); i= i+1)// For loop
         {
           System.out.println(i+1 + "  " + L.get(i));// Prints numbers inputted
           sum = sum+(double)L.get(i); // "sum" variable is updated           
         }
       
        average=sum/(double)L.size(); // Variable "average" is "sum" divided by list size 
        System.out.println("SUM: " + sum); // Prints out the sum veriable
        System.out.println("AVERAGE: " + average); // Prints out the "average" variable
        
         }// End of main
        } // End of Lab7
      
      
