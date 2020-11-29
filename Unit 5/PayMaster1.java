/*  File: Paymaster1.java

 Class PayCheck computes gross pay for an hourly worker, given the employee
 name, hours worked, and hourly rate of pay.  "Time-and-a-half" is paid for 
 all hours worked in excess of MAX_REGULAR hours.

 The data are entered by the user of the test class, PayMaster1.

 Demonstrates the single-alternative "if" statement.

 */

import javax.swing.JOptionPane;

/**
 * Computes gross pay for an hourly worker, given hours worked and rate of pay
 */
class PayCheck
{
    // instance var's
    private String name;            // employee name
    private double hoursWorked;     // total hours worked for the week
    private double payRate;         // hourly rate of pay
    private static final int MAX_REGULAR = 40;
    // hours worked in excess of this are overtime

    /**
     * Create a PayCheck object.
     *
     * @param name the employee name
     * @param hoursWorked the number of hours worked
     * @param payRate the hourly rate of pay
     */
    public PayCheck(String name, double hoursWorked, double payRate)
    {
        this.name = name;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Compute and return the gross pay.
     *
     * @return the gross pay
     */
    public double getGross()
    {
        // pay regular rate for ALL hours worked, including overtime
        double grossPay = hoursWorked * payRate;

        if (hoursWorked > MAX_REGULAR) // if there was overtime...
        {
            // compute overtime hours
            double overtimeHours = hoursWorked - MAX_REGULAR;

            // pay "half again" the rate for the overtime hours worked
            double overtimePay = overtimeHours * (payRate * 0.5);

            // add overtime pay to gross
            grossPay = grossPay + overtimePay;
        }

        return grossPay;
    }

    /**
     * "Get" method for employee name.
     *
     * @return the employee name
     */
    public String getName()
    {
        return name;
    }

    /**
     * "Get" method for employee hours worked.
     *
     * @return the hours worked
     */
    public double getHours()
    {
        return hoursWorked;
    }

    /**
     * "Get" method for employee rate of pay..
     *
     * @return the hourly rate of pay
     */
    public double getRate()
    {
        return payRate;
    }
}

public class PayMaster1
{

    public static void main(String[] args)
    {
        // get data from user
        String name = JOptionPane.showInputDialog("Enter employee name:");

        String input = JOptionPane.showInputDialog("Enter hours worked:");
        double hours = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter hourly rate of pay:");
        double rate = Double.parseDouble(input);

        // create object using data entered
        PayCheck check = new PayCheck(name, hours, rate);

        // print pay check info
        System.out.println("Employee: " + check.getName()
                           + "\nHours worked: " + check.getHours()
                           + "\nHourly rate: "
                           + String.format("$%7.2f", check.getRate())
                           + "\nGross pay:   "
                           + String.format("$%7.2f", check.getGross()));
        System.exit(0);
    }
}

/*  sample output from 3 runs:

 Employee: Warren Peace
 Hours worked: 35.0
 Hourly rate: $  10.00
 Gross pay:   $ 350.00

 Employee: Sue Doku
 Hours worked: 50.0
 Hourly rate: $  15.00
 Gross pay:   $ 825.00

 Employee: Ana Robic
 Hours worked: 40.0
 Hourly rate: $  20.00
 Gross pay:   $ 800.00

 */