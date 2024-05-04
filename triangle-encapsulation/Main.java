

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Triangle tr = new Triangle();

        float base = 0;
        float height = 0;

        System.out.print("Input base of the triangle: ");
        base = sc.nextFloat();
        System.out.print("Input height of the triangle: ");
        height = sc.nextFloat();

        tr.setBase(base);
        tr.setHeight(height);

        System.out.print("Base of the triangle is: "   + Float.toString(tr.getBase()) + "\n");
        System.out.print("Height of the triangle is: " + Float.toString(tr.getHeight()) + "\n");
        System.out.print("Area of the triangle is: "   + Float.toString(tr.getArea()) + "\n");

        sc.close();
    }   
}