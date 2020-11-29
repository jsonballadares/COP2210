import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      // Construct a rectangle and draw it
      Rectangle box = new Rectangle(5, 10, 20, 30);
      g2.setColor(Color.CYAN);
      g2.draw(box);

      // Move rectangle 15 units to the right and 25 units down
      box.translate(15, 25);

      // Draw moved rectangle
      g2.setColor(Color.PINK);
      g2.draw(box);

      Rectangle square = new Rectangle(100, 100, 30, 30);
      g2.setColor(Color.LIGHT_GRAY);
      g2.draw(square);

      Ellipse2D.Double ellipse = new Ellipse2D.Double(300, 300, 40, 40);
      g2.setColor(Color.YELLOW);
      g2.draw(ellipse);

      Line2D.Double segment = new Line2D.Double(55, 55, 85, 85);
      g2.setColor(Color.ORANGE);
      g2.draw(segment);

      segment = new Line2D.Double(new Point2D.Double(0,0),new Point2D.Double(400,800));
      g2.setColor(Color.RED);
      g2.draw(segment);

      Color magenta = new Color(255, 0, 255);
      g2.setColor(magenta);
      g2.drawString("Message", 50, 100);

      Ellipse2D.Double center = new Ellipse2D.Double(75, 75, 50, 50);
      g2.draw(center);
      System.out.println(center.getCenterX());
      System.out.println(center.getCenterY());

      Line2D.Double segment1 = new Line2D.Double(0, 0, 10, 30);
      g2.setColor(Color.green);
      g2.draw(segment1);

      g2.setColor(Color.DARK_GRAY);
      Line2D.Double segment2 = new Line2D.Double(10, 30, 20, 0);
      g2.draw(segment2);

      g2.drawString("V", 300, 300);

      System.out.println(Color.BLUE);

      g2.setColor(Color.RED);
      g2.fill(new Rectangle(0, 0, 200, 200));
      g2.setColor(Color.YELLOW);
      g2.fill(new Rectangle(50, 50, 100, 100));
      
   }
}
