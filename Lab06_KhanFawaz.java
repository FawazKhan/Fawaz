import java.util.Scanner;
import java.util.Random;

public class Lab06_KhanFawaz
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Random num = new Random();
    
    int answer = num.nextInt(100) + 1;
    System.out.print("Take a guess: ");
    int guess =   input.nextInt();
    while (guess != answer)
    {
      if (guess > answer)
      {
        System.out.print("Your guess is too high! guess again");
        guess =   input.nextInt(); 
      }
      else if (guess < answer)
      {
         System.out.print("Your guess is low high! guess again");
         guess =   input.nextInt(); 
         
        


       } 
       else if (guess == answer)
     System.out.print("Your guess correct! Great Job!");
         guess =   input.nextInt(); 


     }
          
   }
} 