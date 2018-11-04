//Derrick Cheah
//CS 210
//HW Core Topics: Line-based and token-based file processing, writing to a file, string methods
//
//This program takes in a file containing diary entries, processes each line and token for information, and writes to a 
//new file whether or not the day was good or bad.

import java.util.*;
import java.io.*;

public class DiaryAnalysis {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner(new File("diary.txt"));
      entries(input);
   }
   
   public static void entries(Scanner input) throws FileNotFoundException{
      PrintStream output = new PrintStream(new File("summary.txt"));
      int count = 0;
      String unique_month = "";
      while (input.hasNextLine()) {
         String entry = input.nextLine();
         Scanner line = new Scanner(entry);
         String date = line.next();
         String analysis = analysis(line);
         String month = date.substring(0,3);
         if (!month.equals(unique_month)) {
            unique_month = month;
            output.println(date.substring(0,3));
         }
         output.println(" - " + date.substring(3) + " " + analysis);
         count++;
      }
      output.println();
      output.println(count + " total days analyzed.");                   
   }
   
   public static String analysis(Scanner input) {
      String analysis = "";
      while (input.hasNextLine()) {
         int good_count = 0;
         int bad_count = 0;
         String entry = input.nextLine();
         Scanner line = new Scanner(entry);
         while (line.hasNext()) {
            String token = line.next();
            if (token.toLowerCase().contains("good") || token.toLowerCase().contains("great") || token.toLowerCase().contains("yay")) {
               good_count++;
            } else if (token.toLowerCase().contains("terrible") || token.toLowerCase().contains("horrible") || token.toLowerCase().contains("awful")) {
               bad_count++;
            }
         }
         if (good_count > bad_count) {
            analysis += ":) ";
         } else if (bad_count > good_count) {
            analysis += ":( ";
         } else {
            analysis += ":| ";
         }
      }
      return analysis;      
   }
}