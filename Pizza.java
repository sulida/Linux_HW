package homework;

// Расчет площади пиццы = П * r ^2 = П * (d / 2) ^2
public class Pizza {

    public Pizza(double input) {
        double result = (mult(pow(div(input))));
        System.out.println("Pizza area = " + result);
    }

    public double div(double x) {
        return x / 2;
    }

    public double pow(double y) {
        return Math.pow(y, 2);
    }

    public double mult(double z) {
        return Math.PI * z;
    }


}
