import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) throws IOException {
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
                double result= squareRoot(num);
                if(result>=0) {
                    logger.info("square root of " + num + " is: " + result);
                    System.out.println("square root of " + num + " is: " + squareRoot(num));
                }
                else {
                    logger.info("real square root exists only for positive numbers");
                    System.out.println("real square root exists only for positive numbers");
                }
            }
            else if (keyPressed == 2) {
                System.out.println("enter the number to calculate factorial: ");
                int num = Integer.parseInt(br.readLine());
                System.out.println("factorial of "+num+" is: "+factorial(num));
            }
            else if (keyPressed == 3) {
                System.out.println("enter the number to calculate natural logarithm(base e): ");
                logger.info("calculating natural logarithm");
                double num = Double.parseDouble(br.readLine());
                if(num<0) {
                    System.out.println("enter positive numbers only");
                    logger.info("logarithm can't be calculated for negative numbers");
                }
                else
                    System.out.println("natural log value of "+num+" is: "+cal_natural_log(num));

            }
            else if (keyPressed == 4) {
                System.out.println("enter the base and exponent to calculate the power of base value: ");
                System.out.println("enter the base value: ");
                double base_num, exp_num;
                base_num = Double.parseDouble(br.readLine());
                System.out.println("enter the exponent value: ");
                exp_num = Double.parseDouble(br.readLine());
                System.out.println(base_num + " to the power "+exp_num+ " is: "+cal_pow(base_num, exp_num));
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
    public static double squareRoot(double num){
        logger.info("[calculating square root], given num is: "+ num);
        if(num<0)
            return Double.NaN;
        double result= Math.sqrt(num);
        logger.info("the square root is: "+result);
        return result;
    }
    public static double factorial(int n)
    {
        logger.info("[calculating factorial], given num is : "+ n);
        if(n<0){
            logger.info("factorial doesn't exist for negative numbers");
            System.out.println("factorial doesn't exist for negative numbers");
            return Double.NaN;
        }
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }
    public static double cal_natural_log(double num){
        logger.info("[calculating natural logarithm], given num is : "+ num);
        if(num==0)
            return Double.NEGATIVE_INFINITY;
        else if(num<0)
            return Double.NaN;
        double result= Math.log(num);
        logger.info("the natural log result is: "+ result);
        return result;
    }
    public static double cal_pow(double base_num, double exp_num){
        logger.info("[calculating exponentiation], given base, exp are : "+ base_num+", "+exp_num);
        if(base_num==0 && exp_num==0)
            return Double.NaN;
        double result= Math.pow(base_num, exp_num);
        logger.info("the result is: "+ result);
        return result;
    }

}
