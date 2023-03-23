package homework;

import java.util.Scanner;

public class ConverterApp {
    //вывод конвертации градусов Цельсия в Кельвин и Фаренгейт
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pls number degrees Celsius: ");
        double a = sc.nextDouble();
        Converter converter = new Converter(a);

    }
}
