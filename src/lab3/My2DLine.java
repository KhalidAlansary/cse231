package lab3;

import javafx.geometry.Point2D;
import lab2.MyVector;

public class My2DLine {
    private Point2D point;
    private MyVector vector;

    public My2DLine(Point2D point, MyVector vector) {
        this.point = point;
        this.vector = vector;
    }

    public My2DLine(double x, double y, double i, double j) {
        this.point = new Point2D(x, y);
        this.vector = new MyVector(i, j);
    }

    public void print() {
        System.out.printf("Point: (%.2f, %.2f)\n", point.getX(), point.getY());
        System.out.printf("Vector: (%.2f i + %.2f j)\n", vector.getX(), vector.getY());
    }

}
