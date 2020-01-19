import edu.fcps.karel2.Display;
public class Racer extends Athlete
{
   public Racer()
   {
    
      super();
   }
   public Racer(int y)
   {
      super(1, y, Display.EAST, Display.INFINITY);
   }
   public void jumpRight()
   {
      turnLeft();
      move();
      turnRight();
      move();
      move();
      turnRight();
      move();
      turnLeft();
   }   
   public void jumpLeft()
   {
      turnRight();
      move();
      turnLeft();
      move();
      move();
      turnLeft();
      move();
      turnRight();
   }
   public void pick(int n)
   {
      for(int i = 1; i<=n; i++)
      {
         pickBeeper();
      
      }      
   }
   public void put(int n)
   {
      for (int i = 1; i<=n; i++)
      {
         putBeeper();
      }
   }
   public void sprint (int n)
   {
      for(int i = 1; i<=n; i++)
      {
         move();
      }
   }
   public void shuttle(int spaces, int beepers)
   {
      
      move();
      jumpRight();
      sprint(spaces);
      pick(beepers);
      
   }
       
   
}
