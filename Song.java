// Derrick Cheah
// CS 210
// HW #1: All You Hungry Children
//
// This program will produce a cumulative song in which successive verses build on previous verses.

public class Song {
   public static void main(String[] args) {
      verse1();
      verse2();
      verse3();
      verse4();
      verse5();
      verse6();
      verse7();
      eat();
   }
   
   public static void verse1() {
      System.out.println("Today is Monday, Today is Monday");
      monday();
   }
     
   public static void monday() {
      System.out.println("Monday, String Beans");
      eat();
      System.out.println();
   }
   
   public static void verse2() {
      System.out.println("Today is Tuesday, Today is Tuesday");
      tuesday();
   }
   
   public static void tuesday() {
      System.out.println("Tuesday, Spaghetti");
      monday();
   }
   
   public static void verse3() {
      System.out.println("Today is Wednesday, Today is Wednesday");
      wednesday();
   }
   
   public static void wednesday() {
      System.out.println("Wednesday, Zoooop");
      tuesday();
   }
   
   public static void verse4() {
      System.out.println("Today is Thursday, Today is Thursday");
      thursday();
   }
   
   public static void thursday() {
      System.out.println("Thursday, Roast Beef");
      wednesday();
   }
   
   public static void verse5() {
      System.out.println("Today is Friday, Today is Friday");
      friday();
   }
   
   public static void friday() {
      System.out.println("Friday, Fresh Fish");
      thursday();
   }
   
   public static void verse6() {
      System.out.println("Today is Saturday, Today is Saturday");
      saturday();
   }
   
   public static void saturday() {
      System.out.println("Saturday, Chicken");
      friday();
   }
   
   public static void verse7() {
      System.out.println("Today is Sunday, Today is Sunday");
      sunday();
   }
   
   public static void sunday() {
      System.out.println("Sunday, Ice Cream");
      saturday();
   }
   
   public static void eat() {
      System.out.println("All you hungry children, come and eat it up!");
   }
   
}

/*
 ----jGRASP exec: java Song
 Today is Monday, Today is Monday
 Monday, String Beans
 All you hungry children, come and eat it up!
 
 Today is Tuesday, Today is Tuesday
 Tuesday, Spaghetti
 Monday, String Beans
 All you hungry children, come and eat it up!
 
 Today is Wednesday, Today is Wednesday
 Wednesday, Zoooop
 Tuesday, Spaghetti
 Monday, String Beans
 All you hungry children, come and eat it up!
 
 Today is Thursday, Today is Thursday
 Thursday, Roast Beef
 Wednesday, Zoooop
 Tuesday, Spaghetti
 Monday, String Beans
 All you hungry children, come and eat it up!
 
 Today is Friday, Today is Friday
 Friday, Fresh Fish
 Thursday, Roast Beef
 Wednesday, Zoooop
 Tuesday, Spaghetti
 Monday, String Beans
 All you hungry children, come and eat it up!
 
 Today is Saturday, Today is Saturday
 Saturday, Chicken
 Friday, Fresh Fish
 Thursday, Roast Beef
 Wednesday, Zoooop
 Tuesday, Spaghetti
 Monday, String Beans
 All you hungry children, come and eat it up!
 
 Today is Sunday, Today is Sunday
 Sunday, Ice Cream
 Saturday, Chicken
 Friday, Fresh Fish
 Thursday, Roast Beef
 Wednesday, Zoooop
 Tuesday, Spaghetti
 Monday, String Beans
 All you hungry children, come and eat it up!
 
 All you hungry children, come and eat it up!
 
  ----jGRASP: operation complete.

*/