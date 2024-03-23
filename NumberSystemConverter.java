import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive decimal value: ");
        int decimalValue = scanner.nextInt();

        System.out.println("value to which number system:");
        System.out.println("1 – Decimal to Binary");
        System.out.println("2 – Decimal to Octal");
        System.out.println("3 – Decimal to Hexadecimal");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        scanner.close();

        String convertedNumber = "";
        switch (choice) {
            case 1:
                convertedNumber = decimalToBinary(decimalValue);
                break;
            case 2:
                convertedNumber = decimalToOctal(decimalValue);
                break;
            case 3:
                convertedNumber = decimalToHexadecimal(decimalValue);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.printf("Equivalent of %d in %s is %s%n", decimalValue, choice == 1 ? "binary" : choice == 2 ? "octal" : "hexadecimal", convertedNumber);
    }

    private static String decimalToBinary(int decimalValue) {
        int[] binaryArray = new int[32];
        int index = 0;
        while (decimalValue > 0) {
            binaryArray[index++] = decimalValue % 2;
            decimalValue /= 2;
        }

        StringBuilder binaryStringBuilder = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            binaryStringBuilder.append(binaryArray[i]);
        }

        return binaryStringBuilder.toString();
    }

    private static String decimalToOctal(int decimalValue) {
        int[] octalArray = new int[11];
        int index = 0;
        while (decimalValue > 0) {
            octalArray[index++] = decimalValue % 8;
            decimalValue /= 8;
        }

        StringBuilder octalStringBuilder = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            octalStringBuilder.append(octalArray[i]);
        }

        return octalStringBuilder.toString();
    }

    private static String decimalToHexadecimal(int decimalValue) {
        char[] hexadecimalArray = new char[8];
        int index = 0;
        while (decimalValue > 0) {
            int rem = decimalValue % 16;
            if (rem < 10) {
                hexadecimalArray[index++] = (char) ('0' + rem);
            } else {
                hexadecimalArray[index++] = (char) ('A' + rem - 10);
            }
            decimalValue /= 16;
        }

        StringBuilder hexadecimalStringBuilder = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            hexadecimalStringBuilder.append(hexadecimalArray[i]);
        }

        return hexadecimalStringBuilder.toString();
    }
}