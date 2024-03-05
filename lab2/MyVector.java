public class MyVector {
    private double x, y;

    MyVector() {
    }

    MyVector(double x, double y) {
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
        return Math.sqrt(x*x + y*y);
    }

    public double angle() {
        return Math.atan2(y, x);
    }

    public void print() {
        System.out.println("(" + x + " i + " + y + " j)");
        System.out.println("(" + magnitude() + " [" + angle() + "])");
    }

    public MyVector add(MyVector v) {
        return new MyVector(x + v.x, y + v.y);
    }

    public MyVector sub(MyVector v) {
        return new MyVector(x - v.x, y - v.y);
    }
}