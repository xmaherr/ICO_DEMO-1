import static java.lang.Math.PI;

public class Circle implements Shape{
    @Override
    public double area(int r) {
        return 3.14*r*r ;
    }

    @Override
    public double area(int l, int y) {
        return 0;
    }
}
