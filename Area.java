abstract class Shape {
    abstract double computeArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

public class Area {
    public static void main(String[] args) {
        // Example 1
        Square square1 = new Square(4);
        System.out.println("Area of square1: " + square1.computeArea());

        Rectangle rectangle1 = new Rectangle(5, 3);
        System.out.println("Area of rectangle1: " + rectangle1.computeArea());

        Triangle triangle1 = new Triangle(6, 2);
        System.out.println("Area of triangle1: " + triangle1.computeArea());

        Circle circle1 = new Circle(3);
        System.out.println("Area of circle1: " + circle1.computeArea());

        // Example 2
        Square square2 = new Square(7);
        System.out.println("Area of square2: " + square2.computeArea());

        Rectangle rectangle2 = new Rectangle(8, 4);
        System.out.println("Area of rectangle2: " + rectangle2.computeArea());

        Triangle triangle2 = new Triangle(5, 3);
        System.out.println("Area of triangle2: " + triangle2.computeArea());

        Circle circle2 = new Circle(5);
        System.out.println("Area of circle2: " + circle2.computeArea());

        // Example 3
        Square square3 = new Square(10);
        System.out.println("Area of square3: " + square3.computeArea());

        Rectangle rectangle3 = new Rectangle(9, 6);
        System.out.println("Area of rectangle3: " + rectangle3.computeArea());

        Triangle triangle3 = new Triangle(4, 3);
        System.out.println("Area of triangle3: " + triangle3.computeArea());

        Circle circle3 = new Circle(7);
        System.out.println("Area of circle3: " + circle3.computeArea());
    }
}