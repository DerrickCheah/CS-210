// Derrick Cheah
// CS 210
// HW Core Topics: For Loops, Static Methods, Print/Println Statements, Class Constant
//
// This program will produce an ASCII Art Firecracker with a size specified by a class constant.

public class Firecracker {

   public static final int SIZE = 4;

   public static void main(String[] args) {
      cone(SIZE);
      i_equals(SIZE);
      equals(SIZE);
      upper_body(SIZE);
      i_equals(SIZE);
      equals(SIZE);
      lower_body(SIZE);
      i_equals(SIZE);
      equals(SIZE);
      tail(SIZE);
   }
   
   //This method prints the cone portion of the firecracker
   public static void cone(int size) {
      for (int line = 1; line <= (size + 1); line++) {
         space(-line + (size + 1));
         System.out.print("/");
         
         for (int x = 1; x <= ((2 * line) - 1); x++) {
            System.out.print("x");
         }
         
         System.out.print("\\");
         space(-line + (size + 1));
         System.out.println();
      }
   }
   
   //This method prints out multiple spaces within the firecracker. 
   //This method was written to save some lines of repetitive code.
   public static void space(int size) {
      for (int space = size; space >= 1; space--) {
         System.out.print(" ");
      }
   }
   
   //This method prints out the first connection portion of the firecracker denoted by various "I=" statements.
   public static void i_equals(int size) {
      System.out.print("[=");
      
      for (int i = 1; i <= size; i++) {
         System.out.print("I=");
      }
      
      System.out.print("]");
      System.out.println();
   }
   
   //This method prints out the second connection portion of the firecracker denoted by "=" signs.
   public static void equals(int size) {
      for (int equals = 1; equals <= (2*size + 3); equals++) {
         System.out.print("=");
      }
      
      System.out.println();
   }
   
   //This method prints out the upper portion of the body of the firecracker.
   public static void upper_body(int size) {
      for (int line = 1; line <= (size - 2); line++) {
      
         System.out.print("  |");
         
         for (int l = 1; l <= (size - 1); l++) {
            System.out.print("-|");
         }
         
         System.out.print("  ");
         System.out.println();
      }
   }
   
   
   //This method prints out the lower portion of the body of the firecracker.
   public static void lower_body(int size) {
      for (int line = 1; line <= size; line++) {
         
         System.out.print(" |");
         
         dots(line - 1);
         
         for (int tilde = 1; tilde <= (-2 * line + (2 * size + 1)); tilde++) {
            System.out.print("~");
         }
         
         dots(line - 1);
         
         System.out.print("| ");
         System.out.println();
      }
   }
   
   //This method prints out the dots used in the lower portion of the firecracker body.
   //This method was written to save some lines of repetitive code.
   public static void dots(int n) {
      for (int dots = 1; dots <= n; dots++) {
         System.out.print(".");
      }
   }
   
   //This method prints out the tail of the firecracker.
   public static void tail(int size) {
      for (int line = 1; line <= (size - 1); line++) {
         
         space(-line + (size+2));
         
         for (int forward = 1; forward <= (line - 1); forward++) {
            System.out.print("/");
         }
         
         System.out.print("|");
         
         for (int back = 1; back <= (line - 1); back++) {
            System.out.print("\\");
         }
         
         System.out.println();
      }
   }
}