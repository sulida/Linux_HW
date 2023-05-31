package homeWorkJavaPro.hw310523;

public class Phone {
    int number;
    String model;
    double weight;

    void receiveCall(String name){
        System.out.println("Calling: " + name);
    }

    public  int getNumber(int number) {
        return number;
    }
}
