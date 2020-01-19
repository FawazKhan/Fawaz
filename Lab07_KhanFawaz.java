import java.util.Scanner;
import java.util.Random;

public class Lab07_KhanFawaz
{

   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      Random num = new Random();
      System.out.println("How many grades do you want to enter");
      int numberOfGrades = input.nextInt();
      double pointsEarned= 0;
      double pointsTotal= 0;
            
      for(int counter = 1;counter <= numberOfGrades;counter++)
      {
         System.out.println("How many points did you earn on Assignment #" + counter + ";");
         pointsEarned= pointsEarned + input.nextDouble();
         
         System.out.println(pointsEarned);
         
      
         System.out.println(" How many points possible on assignment"+ counter +";");
         pointsTotal = pointsTotal + input.nextDouble();
         System.out.println(pointsTotal);
         
      }
      double percentage=(pointsEarned/pointsTotal*100);
      System.out.println(percentage);
      
         if (percentage>=90) {
            System.out.println("You got an A!");
                                 
         }else if(percentage >= 80){
            System.out.println("You got a B!");
         
               
         }else if(percentage >= 70){
            System.out.println("You got a C!");
                 
         }else if(percentage >= 60){
            System.out.println("You got a D!");
         }else if(percentage >= 50){
            System.out.println("You got an F!");
         }
   }
}
