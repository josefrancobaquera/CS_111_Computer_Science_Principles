// Jose Franco Baquera
// September 23, 2016
// Lab 6: Definite Loops
// Algorithm that counts from 1 to an inputted number in strides and prints it in two columns
// Example of Definite Loops

import java.util.Scanner;

class Lab6 {
 
    public static void main(String[] args) 
         {
         
         int n;// Initializes the veriable n
         int k;// Initializes the veriable k
       
         Scanner input = new Scanner( System.in );// Makes it possible to input numbers
         
         System.out.println("Please give me the top number/value to count to");// Allows user to input the top number
         n = input.nextInt();// Assigns the number inputted to variable n
         
         System.out.println("Insert the stride");// Allows user to input the stride
         k = input.nextInt();// Assigns the number inputted to variable k

         for(int i=1; i< n; i=i+k)// Counts to number 'n' in strides 'k'; variable i does not count up until the counting in strides 'k' in j is finished
         for(int j=1; j< n; j=j+k)// Counts to number 'n' in strides 'k'; variable j finishes the counting in strides 'k'
          {
            System.out.println(i + " " + j);// Prints out the two columns; for each number, it prints all the other numbers counted to 'n' in strides 'k'
          }
           
         }// of main
      } // of Lab6


