import java.util.Scanner;

class Methods {
    public static int gcd(int x, int y) {
        // Initialize z as the remainder of x divided by y.
        int z = x % y;

        // Use a while loop to find the GCD.
        while (z > 0) {
            // Update x to y, y to z, and calculate a new value for z (remainder of x divided by y).
            x = y;
            y = z;
            z = x % y;
        }

        // When z becomes 0, y contains the GCD, so return y.
        return y;
    }

    public static void main(String[] args) {
        // Create a new Scanner object.
        Scanner scanner = new Scanner(System.in);

        // Get the two integers from the user.
        System.out.print("Enter first integer: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = scanner.nextInt();

        // Print the GCD of the two integers.
        System.out.printf("The greatest common divisor for %d and %d is %d%n", n1, n2, gcd(n1, n2));

        // Close the Scanner object.
        scanner.close();
    }
}
