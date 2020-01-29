// Jose Franco Baquera
// September 16, 2016
// Lab_5; CS-111
// Algorithm that allows user to input numbers and sort them in both accending and decending order
// NOTE: For this assignment, the original 8 items in the list were eliminated because they were irrelevant to the code 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Lab5 {
 
    public static void main(String[] args) {

        List L = new ArrayList();
        Scanner input = new Scanner( System.in );
        int n=-1;
        
        while (n !=0)
        {  System.out.print("Please Give Me A Number (0 to quit)");// Allows users to input numbers. Once "0" is inputed, the while loop stops
           n=input.nextInt();
           L.add(n);
        }
               
        Collections.sort(L);// Sorts the list in accending order
        printme(L); // Prints list in accending order
        
        Collections.sort(L,Collections.reverseOrder());//Sorts the list in decending order
        printme(L); // Prints list in decending order
                
        }// of main
     
        private static void printme(List A)
         {
          for (int i=0;i<A.size(); i++) //Prints out each element of the list with space in between
          {System.out.print(" " + A.get(i));
         }
         System.out.println();  
               
          } // end of printme
         } // of Lab5