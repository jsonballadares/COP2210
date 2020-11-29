package asg3;

/**
 * Your GradeChanger class will enable the user to replace a student’s given grade 
 * in a course with a new one, to add a new course grade, and to compute the GPA.
 */
public class GradeChanger {

    /**
    *  two private instance variables that store the total credits earned in all 
    *  courses (an int) and the total grade points earned (a double)
    */
    private int totalCreditsEarned;
    private double totalGradePointsEarned;

    /**
     * A constructor with two parameters – total credits and GPA – which will be used to initialize the instance variables
     * total grade points is not a construction parameter; GPA is. Your constructor will initialize total grade points 
     * to GPA x total credits
     * @param totalCredits your current amount of credits earned in all courses
     * @param gradePointAverage your current grade point average
     */
    public GradeChanger(int totalCredits, double gradePointAverage){
        this.totalCreditsEarned = totalCredits;
        this.totalGradePointsEarned = this.totalCreditsEarned * gradePointAverage;
        System.out.println("Creating " + this.getClass().getName() + " with TotalCreditsEarned: " + this.totalCreditsEarned + " TotalGradePointsEarned: " + this.totalGradePointsEarned + " GPA: " + gradePointAverage);
    }

    /**
     * An accessor (“get”) method that returns the total credits
     * @return the total credits earned
     */
    public int getTotalCredits(){
        return totalCreditsEarned;
    }

    /**
     * An accessor (“get”) method that returns the total grade points
     * @return the total grade points earned
     */
    public double getTotalGPA(){
        return totalGradePointsEarned / (double) totalCreditsEarned;
    }

    /**
     * A mutator (“set”) method that adds the grade for a new course. 
     * This method will have 2 parameters – the number of credits and the numeric grade earned.
     * @param numberOfCredits number of credits for the class
     * @param numericGrade the grade
     */
    public void addGrade(int numberOfCredits,double numericGrade){
        this.totalCreditsEarned += numberOfCredits;
        this.totalGradePointsEarned += numberOfCredits * numericGrade;
        //this.totalGradePointsEarned += numericGrade * (numericGrade * (double) numberOfCredits);
        System.out.println("After Adding Grade With numberOfCredits: " + numberOfCredits + " numericGrade: " + numericGrade + " totalCreditsEarned: " + this.totalCreditsEarned + " totalGradePointsEarned: " + this.totalGradePointsEarned);
    }

    /**
     * 6.	A mutator method that replaces the current grade for a course with a new grade. 
     * This method will have 4 parameters – the old number of credits, the old numeric grade, 
     * the new number of credits, and the new numeric grade 
     * @param oldNumberOfCredits the old number of credits 
     * @param oldNumericGrade the old numeric grade
     * @param newNumberOfCredits the new number of credits
     * @param newNumericGrade the new numeric grade
     */
    public void replaceCurrentGrade(int oldNumberOfCredits,double oldNumericGrade,int newNumberOfCredits,double newNumericGrade){
        this.totalCreditsEarned -= oldNumberOfCredits;
        this.totalGradePointsEarned -= oldNumericGrade;
        this.addGrade(newNumberOfCredits, newNumericGrade);
    }
}
