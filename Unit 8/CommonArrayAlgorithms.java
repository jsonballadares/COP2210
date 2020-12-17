import java.util.Scanner;
import java.util.Arrays;

public class CommonArrayAlgorithms {
  public static void main(String[] args) {
    int[] values = new int[10];
    for (int i = 0; i < values.length; i++) {
      values[i] = i * i;
    }
    printArray(values);
    sumAndAverage(values);
    maximumAndMinimum(values);
    linearSearch(values, 999);
    // removingAnElementInAnUnorderedArray(values,4,10);
    // removingAnElementInAnOrderedArray(values,4,10);
    // insertingAnElementInAnUnorderedArray(values,999,10);
    // insertingAnElementInAnOrderedArray(values,999,9,3);
    swapElements(values, 0, 9);
    int[] vals = Arrays.copyOf(values, values.length);
    boolean areSame = (vals == values);
    System.out.println("Are they the same: " + areSame);
    printArray(vals);
    int[] copy = copyArray(vals);
    areSame = (vals == copy);
    System.out.println("Are they the same: " + areSame);
    printArray(copy);
    int[] grownArray = growArray(copy, 15);
    printArray(grownArray);
    // readUserInput(5);
    // int[] inputs = new int[5];
    // inputs[0] = 666;
    // readArbitraryUserInput(inputs,1);
    // readAndResizeInputs(5);
    // largestInArray();
    // int[] test = new int[100];
    // System.out.println("Test contains " + countZeros(test) + " zeros!");
    // badInsert(values,3,values.length);
    double[] grades = { 8, 7, 8.5, 9.5, 7, 4, 10 };
    removeElement(grades, findMinimumElementPosition(grades), grades.length);
    int[] val = { 9, 13, 21, 4, 11, 7, 1, 3 };
    swapHalfs(val);
  }

  public static void printArray(int[] arr) {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < arr.length; i++) {
      if (i > 0) {
        sb.append(", ");
      }
      sb.append(arr[i]);
    }
    sb.append("]");
    System.out.println(sb.toString());
  }

  public static void sumAndAverage(int[] arr) {
    int sum = 0;
    for (int x : arr) {
      sum += x;
    }
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + sum / arr.length);
  }

  public static void maximumAndMinimum(int[] arr) {
    double max = arr[0];
    double min = arr[0];
    for (int x : arr) {
      if (x > max) {
        max = x;
      }
      if (x < min) {
        min = x;
      }
    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
  }

  public static void linearSearch(int[] arr, int target) {
    int index = 0;
    boolean targetFound = false;
    while (index < arr.length && !targetFound) {
      if (target == arr[index]) {
        targetFound = true;
      } else {
        index++;
      }
    }
    if (targetFound) {
      System.out.print("Target " + target + " was found at index " + index + " in ");
      printArray(arr);
    } else {
      System.out.print("Target " + target + " was not found in ");
      printArray(arr);
    }
  }

  public static void removingAnElementInAnUnorderedArray(int[] arr, int pos, int currentSize) {
    System.out.println("Current Size: " + currentSize);
    printArray(arr);
    arr[pos] = arr[currentSize - 1];
    currentSize--;
    System.out.println("New Size: " + currentSize);
    printArray(arr);

  }

  public static void removingAnElementInAnOrderedArray(int[] arr, int pos, int currentSize) {

    System.out.println("Current Size: " + currentSize);
    printArray(arr);

    for (int i = pos + 1; i < currentSize; i++) {
      arr[i - 1] = arr[i];
    }

    currentSize--;
    System.out.println("New Size: " + currentSize);
    printArray(arr);

  }

  public static void insertingAnElementInAnUnorderedArray(int[] arr, int newElement, int currentSize) {
    printArray(arr);
    if (currentSize < arr.length) {
      currentSize++;
      arr[currentSize - 1] = newElement;
    } else {
      System.out.println("Cannot insert element!");
    }
    printArray(arr);
  }

  public static void insertingAnElementInAnOrderedArray(int[] arr, int newElement, int currentSize, int pos) {
    printArray(arr);
    if (currentSize < arr.length) {
      currentSize++;
      for (int i = currentSize - 1; i > pos; i--) {
        System.out.println("i: " + i);
        arr[i] = arr[i - 1];
      }
      arr[pos] = newElement;
    } else {
      System.out.println("Cannot insert element!");
    }
    printArray(arr);
  }

  public static void swapElements(int[] arr, int i, int j) {
    printArray(arr);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    printArray(arr);
  }

  public static int[] copyArray(int[] arr) {
    int[] temp = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    return temp;
  }

  public static int[] growArray(int[] values, int n) {
    int[] newValues = new int[n];
    for (int i = 0; i < n && i < values.length; i++) {
      newValues[i] = values[i];
    }
    return newValues;
  }

  public static void readUserInput(int numberOfInputs) {
    Scanner in = new Scanner(System.in);
    int[] inputs = new int[numberOfInputs];
    for (int i = 0; i < inputs.length; i++) {
      inputs[i] = in.nextInt();
    }
    System.out.print("User Inputed : ");
    in.close();
    printArray(inputs);
  }

  public static void readArbitraryUserInput(int[] inputs, int currentSize) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt() && currentSize < inputs.length - 1) {
      inputs[currentSize] = in.nextInt();
      currentSize++;
    }
    in.close();
    printArray(inputs);
  }

  public static void readAndResizeInputs(int initialSize) {
    Scanner in = new Scanner(System.in);
    int[] inputs = new int[initialSize];
    int currentSize = 0;
    while (in.hasNextInt()) {
      if (currentSize >= inputs.length) {
        System.out.println("Resizing Array!");
        System.out.print("Before: ");
        printArray(inputs);
        inputs = Arrays.copyOf(inputs, 2 * inputs.length); // reassign with larger array
        System.out.print("After: ");
      }
      inputs[currentSize++] = in.nextInt();
      printArray(inputs);
    }
    in.close();
  }

  public static int countZeros(int[] arrs) {
    int count = 0;
    for (int x : arrs) {
      if (x == 0) {
        count++;
      }
    }
    return count;
  }

  public static void largestInArray() {
    final int LENGTH = 100;
    double[] values = new double[LENGTH];
    int currentSize = 0;

    // Read inputs

    System.out.println("Please enter values, Q to quit:");
    Scanner in = new Scanner(System.in);
    while (in.hasNextDouble() && currentSize < values.length) {
      values[currentSize++] = in.nextDouble();
    }
    in.close();
    // Find the largest value

    double largest = values[0];
    for (int i = 1; i < currentSize; i++) {
      if (values[i] > largest) {
        largest = values[i];
      }
    }

    // Print all values and mark the largest
    for (int i = 0; i < currentSize; i++) {
      System.out.print(values[i]);
      if (values[i] == largest) {
        System.out.print(" <== largest value");
      }
      System.out.println();
    }
  }

  public static void badInsert(int[] values, int pos, int currentSize) {
    printArray(values);
    for (int i = pos; i < currentSize - 1; i++) {
      values[i + 1] = values[i];
    }
    printArray(values);
  }

  public static int findMinimumElementPosition(double[] arr) {
    int position = -1;

    if (arr.length < 1) {
      return position;
    }

    double minimum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < minimum) {
        minimum = arr[i];
        position = i;
      }
    }

    System.out.println("Minimum Element: " + minimum);
    System.out.println("Minimum Element Position: " + position);
    return position;
  }

  public static void removeElement(double[] arr, int pos, int currentSize) {
    for (int i = pos; i < currentSize - 1; i++) {
      arr[i] = arr[i + 1];
    }
    System.out.println(Arrays.toString(arr));
    currentSize--;
    double sum = 0;
    for (int i = 0; i < currentSize; i++) {
      sum += arr[i];
    }
    System.out.println("Sum: " + sum);
  }

  public static void swapHalfs(int[] arr) {
    int offset = arr.length / 2;
    for (int i = 0; i < arr.length / 2; i++) {
      swapElements(arr, i, i + offset);
    }
  }

}