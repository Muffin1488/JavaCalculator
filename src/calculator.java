import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.InputMismatchException;


public class calculator {
    public static void main(String[] args) {


try {
    double num1,  num2;
    String operator;
    Scanner input = new Scanner(System.in);
    System.out.println("enter first number");
    num1 = input.nextDouble();
    System.out.println("enter operator");
    operator = input.next();
    System.out.println("enter second number");
    num2 = input.nextDouble();

    if (operator == "+") {
        System.out.println(num1 + num2);
    } else if (operator == "-") {
        System.out.println(num1 - num2);
    } else if (operator == "*") {
        System.out.println(num1 * num2);
    } else if (operator == "/") {
        System.out.println(num1 / num2);
    }

}catch (InputMismatchException e){
    System.out.println("Wrong operator");
}catch (ArithmeticException e){
    System.out.println("cant defide by zero");
}catch (Exception e){
    System.out.println("Error");
}
    }
}
