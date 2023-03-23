package homework;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
//        double a = 30;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pls pizza diameter: ");
        double a = sc.nextDouble();

        Pizza pizza = new Pizza(a);

    }
}
