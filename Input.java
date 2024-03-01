import java.util.Scanner;

public class Input {
   public static void main(String[] args) throws Exception {
      // object to get input from user
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter your username: ");
      String username = sc.nextLine();
      sc.close();
      System.out.println("Username is: " + username);
   }
}
