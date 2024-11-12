public class Rectangle implements  Shape{
//    static int x=0;
//    int num=0;
    Rectangle(){
//        x++;
//        num=x;
//        System.out.println(x+"new Rec :)");
    }
    @Override
    public double area(int l) {
        return l*l;
    }

    @Override
    public double area(int l, int y) {
        return l*y;
    }
}
