/**
Timothy Bain
11/15/18
COSC 220

The purpose of this program is to accept a file
that contains a series of numbers as an array
and lists the highest, lowest, total numbers, and 
the average of numbers in the array.*/

import java.util.Scanner;//imports scanner class
import java.io.*;//allows file input

public class NumAnalysis2 {//class header

   public NumAnalysis2(String fileInput){//constructor

   String fileName = fileInput;
   
   }
   
   public static void main(String[] args) throws IOException{
   
   int[] NumArray = new int[10];//creates empty array for file
      
   //hardcodes the location of the file
   String fileLocation = "C:\\Program Files (x86)\\jGRASP\\NumberSeries.txt";
   
   File numFile = new File(fileLocation); //loads the file
   Scanner fileReader = new Scanner(numFile); //scanner objectreads the file
   
      for (int i = 0; i < NumArray.length; i++){ //Loop prints the contents of file
                                                //into NumArray.
      int printNum = fileReader.nextInt();
      
      NumArray[i] = printNum;
      
      }
      
   numDisplay(NumArray);
   
   }
   
   public static void numDisplay (int[] numberList){
   
   int value = 0;
   int sum = 0; //gathers sum of numbers
   double avg; //gets average of numbers
   
   for (int i = 0; i < numberList.length; i++){
      
      sum = sum + numberList[i]; //calculates the sum of numbers
   
   }
   
   avg = sum / numberList.length; //gets average
   
   System.out.println("Lowest Number: " + numberList[0]);
   System.out.println("Highest Number: " + numberList[9]);
   System.out.println("Total Numbers: " + numberList.length);
   System.out.println("Average of Numbers: " + avg);
   
   }



}