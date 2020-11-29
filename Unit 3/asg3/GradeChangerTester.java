package asg3;

public class GradeChangerTester {
    public static void main(String[] args) {
        int givenNumberOfCredits = 60;
        double givenGradePointAverage = 3.0;
        int firstNumberOfCredits = 3;
        double firstNumericGrade = 3.67;
        int secondNumberOfCredits = 4;
        double secondNumericGrade = 4.0;

        GradeChanger gradeChanger = new GradeChanger(givenNumberOfCredits, givenGradePointAverage);
        System.out.println("Initial Total Credits: " + gradeChanger.getTotalCredits());
        System.out.println("Initial GPA: " + gradeChanger.getTotalGPA());
        gradeChanger.addGrade(firstNumberOfCredits,firstNumericGrade);
        System.out.println("New Total Credits: " + gradeChanger.getTotalCredits());
        System.out.println("New GPA: " + gradeChanger.getTotalGPA());
        gradeChanger.addGrade(secondNumberOfCredits,secondNumericGrade);
        System.out.println("New Total Credits: " + gradeChanger.getTotalCredits());
        System.out.println("New GPA: " + gradeChanger.getTotalGPA());
        gradeChanger.replaceCurrentGrade(3, 4.0, 3, 3.0);
        System.out.println("New Total Credits: " + gradeChanger.getTotalCredits());
        System.out.println("New GPA: " + gradeChanger.getTotalGPA());
    }
    
}
