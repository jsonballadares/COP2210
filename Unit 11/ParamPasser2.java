//  File:  ParamPasser2.java

//  In Java, all parameters are passed by value.  I.e. The parameter in the 
//  method called is a copy of the actual argument in the calling statement.

//  This program shows this to be true for object variables, which store 
//  object references (i.e. the address of the object).

//  If you change the reference stored in the parameter (i.e. make it point
//  to a different object) the actual argument is unaffected because you 
//  changed the reference stored in the copy only. See method demo1.

//  However, by modifying the object pointed to by the parameter you are
//  modifying the object pointed to by the argument because both 
//  are pointing to the same object! See method demo2.

/**
 * A class to represent a car.
 */
class Ride {
    private String make; // the make of the car (e.g., "Porsche")
    private String color; // the color of the car (e.g., "Pink")

    /**
     * Creates a Ride object.
     *
     * @param make  the make of the car
     * @param color the color of the car
     */
    public Ride(String make, String color) {
        this.make = make;
        this.color = color;
    }

    /**
     * Paint a Ride object a new color.
     *
     * @param newColor the new color to paint the car
     */
    public void paint(String newColor) {
        color = newColor;
    }

    /**
     * Convert a Ride object to a String
     *
     * @return a string containing the Ride's make and color
     */
    public String toString() {
        return color + " " + make;
    }
}

/**
 * Test class shows that object variables are always passed by value.
 */
public class ParamPasser2 {
    /**
     * Try to make a Ride obj variable parameter point to a different Ride obj
     *
     * @param sweet a Ride object variable parameter
     */
    public static void demo1(Ride sweet) {
        sweet = new Ride("Maserati", "magenta");
        System.out.println("\nIn method demo1, explicit parameter \"sweet\"" + " changed to a " + sweet.toString());
    }

    /**
     * Modify the Ride obj variable parameter by painting it.
     *
     * @param lowRider a Ride object variable parameter to be painted
     */
    public static void demo2(Ride lowRider) {
        lowRider.paint("purple");
        System.out.println(
                "\nIn method demo2, after painting, the explicit" + " parameter is now a " + lowRider.toString());
    }

    public static void main(String[] args) {
        Ride sweet = new Ride("Porsche", "pink");

        System.out.println("In main, created a " + sweet.toString());
        System.out.println("\n(Passing it to method demo1)");

        ParamPasser2.demo1(sweet); // or just, demo1(sweet) ;

        System.out.println(
                "\nBack in main, returned from demo1, argument " + "\"sweet\" is still a " + sweet.toString() + "!");
        System.out.println("(Cannot change the reference stored in the "
                + "argument by changing the \nreference stored in the parameter/copy)");

        demo2(sweet); // or, ParamPasser2.demo2(sweet) ;

        System.out.println(
                "\nBack in main, returned from demo2, argument " + "\"sweet\" is now a " + sweet.toString() + "!");
        System.out.println("(CAN modify the object pointed to by the argument"
                + " by modifying the object \npointed to by the parameter, "
                + "because they both point to the same object!)");
    }
}

/*
 * program output
 * 
 * In main, created a pink Porsche
 * 
 * (Passing it to method demo1)
 * 
 * In method demo1, explicit parameter "sweet" changed to a magenta Maserati
 * 
 * Back in main, returned from demo1, argument "sweet" is still a pink Porsche!
 * (Cannot change the reference stored in the argument by changing the reference
 * stored in the parameter/copy)
 * 
 * In method demo2, after painting, the explicit parameter is now a purple
 * Porsche
 * 
 * Back in main, returned from demo2, argument "sweet" is now a purple Porsche!
 * (CAN modify the object pointed to by the argument by modifying the object
 * pointed to by the parameter, because they both point to the same object!)
 * 
 */