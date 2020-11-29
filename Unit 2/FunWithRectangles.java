// File: FunWithRectangles.java

// Modified CH program shows variable declarations, assignment statements,
// object creation, how to call accessor and mutator methods, and working 
// with multiple objects
import java.awt.Rectangle;		// for Java's Rectangle class

public class FunWithRectangles 
{
    public static void main(String[] args) 
    {
        // variable declarations
        double xValue;	  // x-coordinate of upper-left corner
        double yValue;	  // y-coordinate of upper-left corner
        double width;	  // width of a Rectangle
        double height;	  // height of a Rectangle
        double area;	  // area of a Rectangle

        // create 2 Rectangle objects
        Rectangle bigBox = new Rectangle(5, 10, 20, 30);
        Rectangle smallBox = new Rectangle(37, 73, 10, 5);

        // call accessor methods to get bigBox data
        xValue = bigBox.getX();
        yValue = bigBox.getY();
        width = bigBox.getWidth();
        height = bigBox.getHeight();

        area = width * height;	// compute bigBox area

        System.out.println("The upper-left corner of bigBox is at ("
                + xValue + "," + yValue + ")\n");
        System.out.println("bigBox has an area of " + area + "  (" + width
                + " * " + height + ")");

        // call mutator method to move bigBox
        bigBox.translate(5, -10);

        System.out.println("\nAfter \"bigBox.translate(5,-10)\", "
                + "bigBox is now at ("
                + bigBox.getX() + "," + bigBox.getY() + ")\n");

        System.out.println("smallBox is at (" + smallBox.getX() + ","
                + smallBox.getY() + ")\n...and has width of "
                + smallBox.getWidth() + " and height of "
                + smallBox.getHeight());

        // now let's put smallBox on top of bigBox!  I.e., we will set
        // the x and y of smallBox to the same x and y as bigBox.  We will use
        // the method setRect().  One problem: setRect() takes 4 parameters (x,
        // y, width, and height) and resets all 4 instance variables. 
        // No problem: we just reset smallBox's x and y to the x and y of 
        // bixBox, and "reset" smallBox's width and height to their
        // current values!

        // get x and y of bigBox
        xValue = bigBox.getX();
        yValue = bigBox.getY();

        // reset smallBox
        smallBox.setRect(xValue, yValue, smallBox.getWidth(),
                smallBox.getHeight());

        System.out.println("\nAfter moving, smallBox is at (" + smallBox.getX()
                + "," + smallBox.getY() + ")");
        System.out.println("...but still has width of " + smallBox.getWidth()
                + " and height of " + smallBox.getHeight() + "\n");
    }
}
/* program output:

The upper-left corner of bigBox is at (5.0,10.0)

bigBox has an area of 600.0  (20.0 x 30.0)

After "bigBox.translate(5,-10)", bigBox is now at (10.0,0.0)

smallBox is at (37.0,73.0)
...and has width of 10.0 and height of 5.0

After moving, smallBox is at (10.0,0.0)
...but still has width of 10.0 and height of 5.0

 */