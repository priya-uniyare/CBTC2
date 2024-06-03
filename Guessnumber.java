import java.util.Random;
import java.util.Scanner;

public class Guessnumber {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        int maxAtt=10;//maximum Attempt
        int totalRound=3;
        int score=3;
        System.out.println("welcome the Gusses the number!");
        System.out.println("You have maximum of"+maxAtt+" attemps to gusse the number each round");  
        System.out.println("The game will be play for"+totalRound+"round."); 
        System.out.println("you will earn a point bassed on the number attempts you take gusse th number"); 
        for(int i=1;i<=totalRound;i++) 
        {
          int numtoguess=r.nextInt(100)+1;  
          int numofatt= 0;
          boolean hasGuessedcorrectly = false;
         
          System.out.println(" \n Round"+" "+i+"of"+" "+totalRound+" "+"begins!");
          System.out.println("I have selected a number between 1 and 100.can you guess what it is?"); 
          
          while(numofatt<maxAtt&& !hasGuessedcorrectly )
          {
            System.out.println("Enter your guess:");
            int userguess = sc.nextInt();
            numofatt++;

            if(userguess < numtoguess)
            {
              System.out.println("Your guess is too low.Tey again.");

            }
            else if(userguess>numtoguess)
            {
              System.out.println("your guess is too high .Try again.");
            }
            else
            {
              System.out.println("Congratulations ! you've guessed the correct number.");
              hasGuessedcorrectly=true;
            }
          }

          if(hasGuessedcorrectly)
          {
            int pointsEarned =maxAtt-numofatt+1;
            score += pointsEarned;
            System.out.println("you guessed the number in "+numofatt+"attempts and earned"+pointsEarned+"points.");

          }
          else
          {
            System.out.println("you've used all"+maxAtt+"attempts without guessing the correct number.");
            System.out.println("The correct number was:"+numtoguess);
          }
        }  
        System.out.println("\n Game over! your tatal score is:"+score); 
        sc.close();
    }
}
