package lab2;

public class MyVector {
    private double x, y;

    public MyVector() {
    }

    public MyVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public double angle() {
        return Math.atan2(y, x);
    }

    public void print() {
        System.out.printf("(%.2f i + %.2f j)\n", x, y);
        System.out.printf("(%.2f [%.2f])\n", magnitude(), angle());
    }

    public MyVector add(MyVector v) {
        return new MyVector(x + v.x, y + v.y);
    }

    public MyVector sub(MyVector v) {
        return new MyVector(x - v.x, y - v.y);
    }
}