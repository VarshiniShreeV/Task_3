import java.util.Scanner;
                 
public class JavaProgram
{
    public static void main(String args[])
  {
    int first, second, multiply;
    float devide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    
    multiply = first * second;
    devide = (float) first / second;

    
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
  }
}
