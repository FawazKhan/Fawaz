import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03_KhanFawaz
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(5);
      
      Climber Bill = new Climber(8);
      Climber Winford = new Climber(8);
      
      Bill.climbUpRight();
      Winford.climbUpRight();
      Bill.climbDownRight();
      Winford.climbDownRight();
      Bill.pickBeeper();
      Bill.climbUpLeft();
      Winford.climbUpLeft();
      Bill.climbDownLeft();
      Winford.climbDownLeft();
      
      
   }

}
    
