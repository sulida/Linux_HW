import com.auto.germany.Car;
import com.auto.germany.Person;
import org.w3c.dom.ls.LSOutput;

public class FirstEx {
    public static void main(String[] args) {
        Car a = new Car();
        System.out.println(a.weight);
        System.out.println(a.model);
        System.out.println(a.year);
        System.out.println(Car.yearofBirth);


        System.out.println();
        Car aNew = new Car();
        aNew.year = 2023;

        System.out.println(aNew.weight);
        System.out.println(aNew.model);
        System.out.println(aNew.year);
        System.out.println(Car.yearofBirth);

        System.out.println();

        Person b = new Person();
        System.out.println(b.name);
        System.out.println(b.surname);
        System.out.println(b.yearofBirth);

    }





}
