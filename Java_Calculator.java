import java.util.Scanner;

public class Java_Calculator 
{

    public static void main(String[] args) 
    {
        // double a;
        // double b;
        char operation = ' ';

        Scanner inp = new Scanner(System.in);

        System.out.println("---Java Calculator---");
        System.out.println();

        //operation = inp.next().charAt(0);
        while (operation != '~') 
        {
            
            System.out.println("Enter '~' to exit");
            System.out.print("Enter your preferred operator (+, -, *, /, %): ");
            operation = inp.next().charAt(0);
            if(operation == '~')
            {
                System.out.println("Thank you for using my program. Terminating...");
                break;
            }
            System.out.println("Enter first number: ");
            double a = inp.nextDouble();
            System.out.println("Enter second number: ");
            double b = inp.nextDouble();

            switch (operation) 
            {
                case '+':
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;

                case '-':
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                
                case '*':
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;

                case '/':
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;

                case '%':
                    System.out.println(a + " % " + b + " = " + (a % b));
                    break;
                
                default:
                    System.out.println("Please enter an operator based from the instructions only!");
                    break;
            }
        }
    }
}