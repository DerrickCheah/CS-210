import java.util.*;

public class GuessingGame {

   public static final int RANGE = 10;

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      char play = 'y';
      int num_games = 0;
      int total_guesses = 0;
      int best = 0;
      
      introduction();
      
      while (play == 'y') {
         int guesses = game(console);
         
         total_guesses += guesses;
         
         num_games++;
         if (num_games == 1) {
            best = guesses;
         }
         
         if (guesses < best) {
            best = guesses;
         }
         
         System.out.print("Do you want to play again? ");
         String ans = console.next();
         play = ans.toLowerCase().charAt(0);
         System.out.println(); 
      }
      
      stats(num_games, total_guesses, ((double)total_guesses/num_games), best);
      
      
   }
   
   public static void introduction() {
      System.out.printf("This program allows you to play a guessing game.\n" + 
                         "I will think of a number between 1 and %d\n" +
                         "and will allow you to guess until you get it.\n" +
                         "For each guess, I will tell you whether the right\n" +
                         "answer is higher or lower than your guess.\n", RANGE);
   }
   
   public static int game(Scanner console) {
   
      Random rand = new Random();
      int num = rand.nextInt(RANGE);
      
      System.out.println(num);
      
      System.out.printf("I'm thinking of a number between 1 and %d...\n", RANGE);
      System.out.print("Your guess? ");
      int guess = console.nextInt();
      
      int count = 1;
      
      while (guess != num) {
         if (guess > num) {
            System.out.println("It's lower");
         } else {
            System.out.println("It's higher");
         }
     
         count++;
         
         System.out.print("Your guess? ");
         guess = console.nextInt();
      }
      
      if (count == 1) {
         System.out.println("You got it right on the first guess!!");
      } else {
         System.out.printf("You got it right in %d guesses\n", count);
      }
      
      return count;
      
   }
   
   public static void stats(int num_games, int total_guesses, double average, int best) {
      System.out.println("Game statistics:");
      System.out.println("\t total games   = " + num_games);
      System.out.println("\t total guesses = " + total_guesses);
      System.out.println("\t guesses/game  = " + average);
      System.out.println("\t best game     = " + best);
   }
   
   
}
      
      