package lab3;

import lab2.MyVector;
import javafx.geometry.Point2D;

public class Main {
    public static void main(String[] args) {
        // Test My2DLine
        My2DLine line = new My2DLine(1, 2, 3, 4);
        line.print();
        MyVector vector = new MyVector(1, 2);
        Point2D point = new Point2D(3, 4);
        My2DLine line2 = new My2DLine(point, vector);
        line2.print();
        // Test MyStringBuffer
        MyStringBuffer buffer = new MyStringBuffer("Hello, world!");
        buffer.print();
        buffer.erase(7, 6);
        buffer.print();
        buffer.insert(7, "there");
        buffer.print();
        // Test MyString
        MyString str = new MyString("Hello, world!");
        str.print();
        str = str.erase(7, 7);
        str.print();
        str = str.insert(7, "there");
        str.print();
    }
}
