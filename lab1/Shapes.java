class Rectangle {
    private double l, w;

    Rectangle(double length, double width) {
        l = length;
        w = width;
    }

    public double getArea() {
        return l * w;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}

class Circle {
    private double r;

    Circle(double radius) {
        r = radius;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5.5);
        System.out.println("Area of rectangle: " + r.getArea());

        Square s = new Square(10);
        System.out.println("Area of square: " + s.getArea());

        Circle c = new Circle(3.2);
        System.out.println("Area of circle: " + c.getArea());
    }
}
