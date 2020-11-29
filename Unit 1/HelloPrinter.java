import javax.swing.JOptionPane;
import java.net.URL;
import javax.swing.ImageIcon;

public class HelloPrinter
{
    
    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL( "http://horstmann.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }

   public static void firstTenPositiveIntegersSum(){
        int sum = 0;
        for(int i = 0; i < 10; i++){
            System.out.print((i+1) + "+ ");
            sum = sum + (i+1);
        }
        System.out.println();
        System.out.print("Sum: " + sum);
   }
   public static void firstTenPositiveIntegersProduct(){
    int sum = 1;
    for(int i = 0; i < 10; i++){
        System.out.print((i+1) + "x ");
        sum = sum * (i+1);
    }
    System.out.println();
    System.out.print("Sum: " + sum);
    }
    public static void printInterestBalance(){
        double balance = 1000;
        double interest = .05;
        for(int i = 0; i < 3; i++){
            balance = ((balance*interest)+balance);
            System.out.println("Year: " + i + " Balance: " + balance);
        }
    }
    public static void printJasonInBox(){
        System.out.print("-----------\n");
        System.out.print("|  Jason  |\n");
        System.out.print("-----------\n");
    }

    public static void printNameWithStars(){
        System.out.println();
        System.out.println("           *************        ************");
        System.out.println("                  **            **        *");
        System.out.println("                  **            **       *");
        System.out.println("                  **            **     *");
        System.out.println("                  **            **    *");
        System.out.println("                  **            **  *");
        System.out.println("          **      **            **    *");
        System.out.println("            **    **            **     *");
        System.out.println("              **  **            **       *");
        System.out.println("                ****            ***********");
    }

    public static void printNameMorseCode(){
        System.out.println(".--- .- ... --- -.");
    }


}