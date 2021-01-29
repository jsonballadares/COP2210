//  File:  ParamPasser.java

//  In Java, all parameters are passed by value.  

//  This program shows that the primitive types are passed by value.
//  Two ints are passed to a method that tries - unsuccessfully -
//  to "swap" them.

public class ParamPasser {
    public void trySwap(int first, int second) {
        int temp = first;
        first = second;
        second = temp;

        System.out.println("\nIn method trySwap, after swapping:  " + "first = " + first + ", second = " + second);
    }

    public static void main(String args[]) {
        // declare and initialize 2 "local" vars

        int first = 37;
        int second = 73;

        // print initial values

        System.out.println("Initial values of ints:  first = " + first + ", second = " + second);

        ParamPasser demo = new ParamPasser();

        // attempt a swap

        demo.trySwap(first, second);

        // print values after swap attempt

        System.out.println("\nAfter return from method trySwap:  " + "first = " + first + ", second = " + second);
    }
}

/*
 * Program output:
 * 
 * Initial values of ints: first = 37, second = 73
 * 
 * In method trySwap, after swapping: first = 73, second = 37
 * 
 * After return from method trySwap: first = 37, second = 73
 * 
 */