import java.util.Scanner; 

public class Scratch{
  public static void main(String[] args){
    double[] values = new double[5];
    Scratch.variableArguments(1,2,3,4);
    int currentSize = 0;
    Scanner in = new Scanner(System.in); 
    while (in.hasNextDouble())
    {
      if (currentSize < values.length) 
      {
        values[currentSize] = in.nextDouble();
        currentSize++; 
      }else{
        System.out.println("Too many elements cannot add more!");
        break;
      }
    }
    System.out.println("Current Size: " + currentSize);
    for(int i = 0; i < currentSize; i++){
      System.out.println(values[i]);
    }
  }
  public static void variableArguments(int... values){
    System.out.println(values.length);
  } 
}