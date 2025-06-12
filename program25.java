class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

public class program25{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        System.out.println(r.getArea());
    }
}
