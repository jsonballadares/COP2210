import java.awt.Rectangle;
import java.io.PrintStream;

public class Practice{
    public static void main(String[] args){
        String greeting = "Hello, World!";
        System.out.println(greeting.toLowerCase());
        int numberOfCharacters = greeting.length();
        System.out.println(numberOfCharacters);
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        System.out.println(bigRiver);
        System.out.println(river.replace("issipp", "our"));
        System.out.println(river.replace("p", "r"));
        System.out.println(new Rectangle().getWidth());

        Rectangle box = new Rectangle(5, 10, 20, 30); 
        System.out.println("Before: " + box.getX()); 
        box.translate(25, 40);
        System.out.println("After: " + box.getX());

        box = new Rectangle(5, 10, 20, 30);
        System.out.println("Before: " + box.getWidth()); 
        box.translate(25, 40); 
        System.out.println("After: " + box.getWidth());

        greeting = "Hello"; 
        System.out.println(greeting.toUpperCase()); 
        System.out.println(greeting);

        box = new Rectangle(5, 10, 20, 30);
        box.translate(-5,-10);
        System.out.println(box);

        box.setSize(40,40);
        System.out.println(box);

        String helloSpace = " Hello, Space ! ";
        System.out.println(helloSpace.trim());

        String name = "Hello, World";
        PrintStream ps = System.out;
        ps.println(name.toUpperCase());
        ps.println(name.replace("H","h"));
        ps.println(name.replace(",",""));

        String word = "Basket";
        int len = word.length();
        System.out.println(len);
        word = word + "ball";
        len = word.length();
        System.out.println(len);
        word = "";
        len = word.length();
        System.out.println(len);
        
        String florida = "Florida";
        System.out.println(florida.substring(1,5));
        System.out.println(florida.indexOf("da"));

        String magic = "Abracadabra!";
        String words = "ada" ;
		System.out.println(magic.substring(magic.indexOf(words),11));
    }
}