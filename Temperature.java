package homework;

import java.util.Scanner;

//При условии, что температура 1 больше 100 градусов, а температура 2 меньше 100 градусов, выводить true,
//в противном случае false

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pls temperature of the first flask: ");
        double temperature1 = sc.nextDouble();
        System.out.println("Enter pls temperature of the second flask: ");
        double temperature2 = sc.nextDouble();

        if (temperature1 > 100 && temperature2 < 100)
            System.out.println("True");
        else System.out.println("False");

    }
}
