package homework;

public class Converter {
    //Конвертируем градусы Цельсия в градусы Кельвин и в Фаренгейт

    public Converter(double input) {

        System.out.println("In Kelvin = " + CelsiusToKelvin(input));
        System.out.println("In Fahrenheit = " + CelsiusToFahrenheit(input));
    }

    public double CelsiusToKelvin(double x) {
        return x + 273.15;
    }

    public double CelsiusToFahrenheit(double y) {
        return (y * 9 / 5) + 32;
    }

}
