public class Main {
    public static void main(String[] args) {
        MyVector v1 = new MyVector(3, 4);
        MyVector v2 = new MyVector(1, 2);

        // Test getters
        System.out.println("v1.getX() = " + v1.getX());
        System.out.println("v1.getY() = " + v1.getY());

        // Test setters
        v1.setX(5);
        v1.setY(6);
        System.out.println("After setting, v1.getX() = " + v1.getX());
        System.out.println("After setting, v1.getY() = " + v1.getY());

        // Test magnitude and angle
        System.out.println("v1.magnitude() = " + v1.magnitude());
        System.out.println("v1.angle() = " + v1.angle());

        // Test add and subtract
        MyVector v3 = v1.add(v2);
        MyVector v4 = v1.sub(v2);
        v3.print();
        v4.print();
    }
}