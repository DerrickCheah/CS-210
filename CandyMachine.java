//Derrick Cheah
//CS 210
//HW Core Topics: Method Calling, Returns, Parameters, Conditional Statements, Print Formatting, Scanner.
//
//This program will create a candy machine that prompts user for money, displays items available, prompts for selection, and determines if user can afford selection.

import java.util.*;

public class CandyMachine {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      initialization();
      double money = money(console);
      double cost = candy(console);
      dispense(money, cost);
   }
   
   //Initialize the candy machine program by providing a greeting.
   public static void initialization() {
      System.out.println("Welcome to Bellevue College's Computer Candy Machine!");
      System.out.println("(All candy provided is virtual.)");
      System.out.println();
   }
   
   //Asks user how much money they have.
   public static double money(Scanner console) {
      System.out.print("How much money do ya got? > $");
      double money = console.nextDouble();
      
      while (!(money >= 0)) {
         System.out.print("Please enter a valid amount. > ");
         money = console.nextDouble();
      }
      
      System.out.println();
      System.out.printf("$%.2f, that's all?\n", money);
      System.out.println();
      return money;
   }
   
   //Provides all items available in the candy machine, prompts for selection, and returns cost of selection.
   public static double candy(Scanner console) {
      System.out.println("Well, lemme tell ya what we got here.");
      
      System.out.println("A $0.65 Twix");
      System.out.println("B $0.50 Chips");
      System.out.println("C $0.75 Nutter Butter");
      System.out.println("D $0.65 Peanut Butter Cup");
      System.out.println("E $0.55 Juicy Fruit Gum");
      
      System.out.println();
      
      System.out.print("So, What'll ya have? > ");
      String choice = console.next();
      
      while (!(choice.equals("a") || choice.equals("b") || choice.equals("c") || choice.equals("d") || choice.equals("e"))) {
         System.out.print("Please enter a valid option. > ");
         choice = console.next();
      }
      
      System.out.println();
      
      if (choice.toLowerCase().equals("a")) {
         return 0.65;
      } else if (choice.toLowerCase().equals("b")) {
         return 0.50;
      } else if (choice.toLowerCase().equals("c")) {
         return 0.75;
      } else if (choice.toLowerCase().equals("d")) {
         return 0.65;
      } else if (choice.toLowerCase().equals("e")) {
         return 0.55;
      }
      
      return 0;
   }
   
   //Checks to see if user can afford the selected candy and provides suitable output.
   public static void dispense(double money, double cost) {
      if (money >= cost) {
         double change = money - cost;
         System.out.println("Thanks for purchasing candy through us.");
         System.out.printf("Please take your candy and your $%.2f change!", change);
      } else {
         System.out.printf("You're broke. Take your $%.2f and go elsewhere.\n", money);
      }
   }
}