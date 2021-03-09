import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String args[]) throws IOException {

        System.out.println("welcome to my calculator");
        System.out.println("press 1 for square root operation");
        System.out.println("press any other key to exit from the calculator");
        int keyPressed;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        keyPressed=Integer.parseInt(br.readLine());
        if(keyPressed==1) {
            System.out.println("press enter number:");
            double num=Integer.parseInt(br.readLine());
            squareRoot(num);
        }
    }
    public static void squareRoot(double num){
        if(num<0)
            System.out.println("real square root exists only for positive numbers");
        else
            System.out.println(Math.sqrt(num));
    }
}
