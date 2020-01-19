import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04_KhanFawaz
{
   public static void runTheRace(Racer arg)throws InterruptedException
   {     
      int counter = 1;
      System.out.println("This is a number"+ counter);
      Thread.sleep(500);
      arg.move();
      arg.turnRight();
      arg.shuttle(3,7);
     
     
   }
       
  
   
   public static void main(String[] args) throws InterruptedException
   {
      Display.openWorld("maps/shuttle.map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      Racer B = new Racer(1);
      Racer D = new Racer(4);
      Racer T = new Racer(7);
      T.shuttle(1,7);
      T.turnAround();
      T.sprint(2);
      T.jumpLeft();
      T.putBeeper();
      T.turnAround();
      T.shuttle(3,5);
      T.turnAround();
      T.sprint(4);
      T.jumpLeft();
      T.putBeeper();
      T.turnAround();
      T.shuttle(5,3);
      T.turnAround();
      T.sprint(6);
      T.jumpLeft();
      T.putBeeper();
      T.turnAround();
      T.move();
      
      B.shuttle(1,7);
      B.turnAround();
      B.sprint(2);
      B.jumpLeft();
      B.putBeeper();
      B.turnAround();
      B.shuttle(3,5);
      B.turnAround();
      B.sprint(4);
      B.jumpLeft();
      B.putBeeper();
      B.turnAround();
      B.shuttle(5,3);
      B.turnAround();
      B.sprint(6);
      B.jumpLeft();
      B.putBeeper();
      B.turnAround();
      B.move();
      
      D.shuttle(1,7);
      D.turnAround();
      D.sprint(2);
      D.jumpLeft();
      D.putBeeper();
      D.turnAround();
      D.shuttle(3,5);
      D.turnAround();
      D.sprint(4);
      D.jumpLeft();
      D.putBeeper();
      D.turnAround();
      D.shuttle(5,3);
      D.turnAround();
      D.sprint(6);
      D.jumpLeft();
      D.putBeeper();
      D.turnAround();
      D.move();

      
           
      
      


      

      
      
      
     
      



        
      
      
      
   }
}