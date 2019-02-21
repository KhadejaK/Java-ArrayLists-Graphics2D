import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

/**
 * In this problem you are going write a class to model a traffic light that can cycle through colors, red, green, yellow. 
 * To do this, you will have to maintain the state of the traffic light. 
 * Maintaining state is one of the design pattern discussed in this week's lesson. 
 * The state of the TrafficLight indicates which light is lit. It changes every time the TrafficLight cycles.
 * @author KhadejaKhalid
 */
public class TrafficLight
{
   private int x;
   private int y;
   private int state;
   
   public static final int RED = 0;
   public static final int GREEN = 1;
   public static final int YELLOW = 2;
   
   public static final int WIDTH = 20;
   public static final int HEIGHT = 60;

   /**
    * Construct the light
    * @param x : x - coordinate
    * @param y : y - coordinate
    */
   public TrafficLight(int x, int y)
   {
      this.x = x;
      this.y = y;
      state = RED;
   }
   
   /**
    * changes the state (the color) in the following manner 
    */
   public void cycle()
   {
      if (state == RED)
         state = GREEN;
      else if (state == GREEN)
         state = YELLOW;
      else
         state = RED;    
   }
   
   /**
    * gets the color (the current state) of the light as a string "red", "green" or "yellow"
    * @return string representation of color
    */
   public String getLight()
   {
      String s = "";
      if (state == RED)
         s = "red";
      else if (state == GREEN)
         s = "green";
      else
         s = "yellow";
      return s;
   }
   
   /**
    * draws the traffic light and fills the circles with a different color when the light is on or off 
    * @param g2 : drawer
    */
   public void draw(Graphics2D g2)
   {
      Rectangle box = new Rectangle(x, y, WIDTH, HEIGHT);
      
      Color redOff = new Color(128,00,00);
      Color yellowOff = new Color(255,165,00);
      Color greenOff = new Color(85,107,47);
      
      Ellipse2D.Double firstLight = new Ellipse2D.Double(x, y, WIDTH, WIDTH);
      if (state == RED)
         g2.setColor(Color.RED);
      else
         g2.setColor(redOff);
      g2.fill(firstLight);
            
      Ellipse2D.Double secondLight = new Ellipse2D.Double(x, y+WIDTH, WIDTH, WIDTH);
      if (state == YELLOW)
         g2.setColor(Color.YELLOW);
      else
         g2.setColor(yellowOff);
      g2.fill(secondLight);
      
      Ellipse2D.Double thirdLight = new Ellipse2D.Double(x, y+WIDTH*2, WIDTH, WIDTH);
      if (state == GREEN)
         g2.setColor(Color.GREEN);
      else
         g2.setColor(greenOff);
      g2.fill(thirdLight);
      
      g2.setColor(Color.BLACK);
      g2.draw(box);
   }
}
