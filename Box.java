
public class Box {

    int height;
    int lenght;
    int width;

    public Box(int h, int l, int w) {

        height = h;
        lenght = l;
        width = w;

        System.out.println(h * l * w);

    }

    public Box(int h, int l) {

        height = h;
        lenght = l;
        width = 15;

        System.out.println(h * l * width);

    }
    public Box(int h) {

        height = h;
        lenght = 27;
        width = 15;

        System.out.println(h * lenght * width);

    }

    public Box() {

        height = 7;
        lenght = 27;
        width = 15;

        System.out.println(height * lenght * width);

    }
}
