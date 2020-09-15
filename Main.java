import java.util.Scanner;

/**
 * Determines which number is larger 
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);

    // ask the user for two numbers
    System.out.println("Please enter an integer:");
    int firstInt = input.nextInt();

    System.out.println("Please enter another integer:");
    int secondInt = input.nextInt();

    if (firstInt > secondInt) {
      System.out.println("The biggest number is " + firstInt + ".");
    } else if (firstInt == secondInt) {
      System.out.println("There is no biggest number.");
    } else {
      System.out.println("The biggest number is " + secondInt + ".");
    }
    
  }
}
