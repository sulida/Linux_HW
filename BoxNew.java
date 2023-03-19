package homework;

public class BoxNew {

    int height;
    int lenght;
    int width;

    public BoxNew(int h, int l, int w) {

        this(h,l);              //вызывает конструктор с 2мя параметрами
        this.height = h;
        this.lenght = l;
        this.width = w;

        System.out.println(h * l * w);    //объем коробки

    }

    public BoxNew(int h, int l) {

        this(h);                      //вызывает конструктор с 1 параметром
        this.height = h;
        this.lenght = l;
        width = 15;

        System.out.println(h * l * width);

    }

    public BoxNew(int h) {

        this();                           //вызывает конструктор без параметров
        this.height = h;
        lenght = 27;
        width = 15;

        System.out.println(h * lenght * width);

    }

    public BoxNew() {

        height = 7;
        lenght = 27;
        width = 15;

        System.out.println(height * lenght * width);

    }
}
