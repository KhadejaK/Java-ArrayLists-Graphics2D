import java.awt.Graphics;
import java.awt.Graphics2D;


import javax.swing.JComponent;

public class TrafficLightComponent extends JComponent
{

   private static final long serialVersionUID = 1L;
   
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      TrafficLight signal = new TrafficLight( 10, 20);
      signal.draw(g2);
      String colorWord = (signal.getLight());
      g2.drawString(colorWord, 10, 100);

      
      TrafficLight signal2 = new TrafficLight( 60, 20);
      signal2.cycle();
      signal2.draw(g2);
      colorWord = signal2.getLight();
      g2.drawString(colorWord, 60, 100);
      
      TrafficLight signal3 = new TrafficLight( 110, 20);
      signal3.cycle();
      signal3.cycle();
      signal3.draw(g2);
      colorWord = signal3.getLight();
      g2.drawString(colorWord, 110, 100);
      
      TrafficLight signal4 = new TrafficLight( 160, 20);
      signal4.cycle();
      signal4.cycle();
      signal4.cycle();
      signal4.draw(g2);
      colorWord = signal4.getLight();
      g2.drawString(colorWord, 160, 100);  
   }   
}