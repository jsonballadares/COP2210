//  File:  AssignmentDemo.java

//  Shows the effect of the assignment operator "=" when applied to object
//  variables.  Remember that an object variable stores a "reference to" an
//  object (i.e. the address of the object).

/**
 * A class to represent a car of a specific make and color.
 */
class Car 
{
	// instance variables
	private String make ;		// the make of the car				 
	private String color ;		// the color
	
	/**
	 * Creates a car object.
	 * @param theMake the make of the car
	 * @param theColor the color of the car
	 */
	public Car(String theMake, String theColor)	
	{				
		make = theMake ;
		color = theColor ;
	}
		
	/**
	 * Paint car object a new color.
	 * @param newColor the new color
	 */
	public void paint(String newColor)
	{	
		color = newColor ;
	}
	
	/**
	 * Converts a Car object to a String.
	 * @return a String containing the make and color of the car object
	 */
	public String toString()	
	{								
		return color + " " + make ; 
	}
}

/**
 * Test class shows effect of assignment statement in Java.
 */
public class AssignmentDemo 
{
	public static void main(String args[]) 
	{
		Car myCar = new Car("Tesla", "Teal") ;
		
		Car yourCar = new Car("Maserati", "Magenta") ;					
		
		System.out.println( "myCar is a " + myCar.toString() ) ;
		
		System.out.println( "yourCar is a " + yourCar.toString() ) ;

		yourCar = myCar ; 		
		// Note: now both obj var's point to same car object
        
      System.out.println("\nAfter assigning \"yourCar = myCar\"...\n") ;
		
		System.out.println( "myCar is a " + myCar.toString() ) ;
		
		System.out.println( "yourCar is a " + yourCar.toString() ) ;

		// paint my car purple
      myCar.paint("Teaberry") ;			
        
      System.out.println("\nAfter painting ONLY my car Teaberry...\n") ;
		
		System.out.println( "myCar is a " + myCar.toString() ) ;
		
		System.out.println( "yourCar is a " + yourCar.toString() ) ;
	}	                   
}

/*  program output:

myCar is a Teal Tesla
yourCar is a Magenta Maserati

After assigning "yourCar = myCar"...

myCar is a Teal Tesla
yourCar is a Teal Tesla

After painting ONLY my car Teaberry...

myCar is a Teaberry Tesla
yourCar is a Teaberry Tesla

*/
