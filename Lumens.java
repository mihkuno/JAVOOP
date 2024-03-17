import java.util.Scanner;

public class Lumens {
    public static void main(String[] args) {
        int lumens;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter watts: ");

        int watts = scanner.nextInt();

        scanner.close();

        switch (watts) {
            case 15:
                lumens = 125;
                break;
            case 25:
                lumens = 215;
                break;
            case 40:
                lumens = 500;
                break;
            case 60:
                lumens = 880;
                break;
            case 75:
                lumens = 1000;
                break;
            case 100:
                lumens = 1675;
                break;
            default:
                lumens = -1; // Not in the table
                break;
        }

        System.out.println("Brightness (in Lumens): " + lumens);
    }
}
