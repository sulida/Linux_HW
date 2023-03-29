package homework;

import java.util.Scanner;
// Разработайте алгоритм, который будет получать значение населения того или иного города, а так же идентификатора страны и определять насколько большой город в зависимости от страны.
//Например, для Германии город с населением до 100к человек маленький, до 400к человек средний, больше 1кк человек - большой. Для Франции, до 200к маленький, до 500к - средний, более 1.5кк - большой.

public class SizeOfCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pls your country (France or Germany): ");
        String country = scanner.next();
        System.out.println("Enter pls the population of your city: ");
        int p = scanner.nextInt();
        scanner.close();

        if (country.equals("France")) {
            if (p > 0 && p < 100) {
                System.out.println("This is  a small town");
            } else {
                if (p >= 100 && p < 400) {
                    System.out.println("This is a middle town");
                } else {
                    if (p > 1000000) {
                        System.out.println("This is a big city");
                    } else {
                        System.out.println("This is a wrong data");
                    }
                }
            }
        } else if (country.equals("Germany")) {
            if (p > 0 && p < 200) {
                System.out.println("This is  a small town ");
            } else {
                if (p >= 200 && p < 400) {
                    System.out.println("This is a middle town");
                } else if (p > 1500000) {
                    System.out.println("This is a big city");
                } else System.out.println("This is a wrong data");
            }
        } else System.out.println("This is a wrong data");
    }
}















