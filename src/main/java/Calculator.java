import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String args[]) throws IOException {
        System.out.println("welcome to my calculator");
        while(true) {
            System.out.print("press  1--for square root operation    2--for factorial    3--for logarithm");
            System.out.println("    4--for power function\npress any other key for the exit manual");
            int keyPressed;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            keyPressed = Integer.parseInt(br.readLine());
            if (keyPressed == 1) {
                System.out.println("enter the number to calculate square root: ");
                double num = Double.parseDouble(br.readLine());
                squareRoot(num);
            }
            else if (keyPressed == 2) {
                System.out.println("enter the number to calculate factorial: ");
                int num = Integer.parseInt(br.readLine());
                System.out.println("factorial of "+num+" is: "+factorial(num));
            }
            else if (keyPressed == 3) {
                System.out.println("enter the number to calculate natural logarithm(base e): ");
                double num = Double.parseDouble(br.readLine());
                cal_natural_log(num);
            }
            else if (keyPressed == 4) {
                System.out.println("enter the base and exponent to calculate the power of base value: ");
                System.out.println("enter the base value: ");
                double base_num, exp_num;
                base_num = Double.parseDouble(br.readLine());
                System.out.println("enter the exponent value: ");
                exp_num = Double.parseDouble(br.readLine());
                cal_pow(base_num, exp_num);
            }
            else{
                System.out.println("press 1 to use calculator again\npress any other number to exit");
                if(Integer.parseInt(br.readLine())!=1) {
                    System.out.println("Thank you and see you again");
                    break; // breaking from infinite while loop
                }
            }
        }// end of infinite while loop
    }
    public static void squareRoot(double num){
        if(num<0)
            System.out.println("real square root exists only for positive numbers");
        else
            System.out.println("square root of "+num+" is: "+Math.sqrt(num));
    }
    public static int factorial(int n)
    {
        if(n<0){
            System.out.println("factorial doesn't exist for negative numbers");
            return -1;
        }
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }
    public static void cal_natural_log(double num){
        if(num<0)
            System.out.println("enter positive numbers only");
        else
            System.out.println("natural log value of "+num+" is: "+Math.log(num));
    }
    public static void cal_pow(double base_num, double exp_num){
        System.out.println(base_num + " to the power "+exp_num+ " is: "+Math.pow(base_num, exp_num));
    }

}
