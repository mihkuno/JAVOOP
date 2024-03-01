
/*
 * INSTRUCTIONS
 * The user will input a Philippine amount, then the said amount will be converted 
 * to different currencies namely: US Dollar, Euro, Yuan, Koruna, Krone, Sheqel and Dinar
 * 
 * Suppose, 1.000 US Dollar is equivalent to 
 *    43.33089 Php
 *    0.734719 Euro 
 *    6.346934 Yuan
 *    18.77263 Koruna 
 *    5.449007 Krone 
 *    3.726334 Sheqel 
 *    0.274588 Dinar
 */

import java.util.Scanner;  

class Operations {
   public static void main(String[] args) throws Exception {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Philippine Peso: ");

      double peso_amount   = sc.nextDouble();
      double dollar_amount = peso_amount   / 43.33089;
      double euro_amount   = dollar_amount * 0.734719;
      double yuan_amount   = dollar_amount * 6.346934;
      double koruna_amount = dollar_amount * 18.77263;
      double krone_amount  = dollar_amount * 5.449007;
      double sheqel_amount = dollar_amount * 3.726334;
      double dinar_amount  = dollar_amount * 0.274588;

      sc.close();

      System.out.println("The amount is equivalent to: ");
      System.out.println("US Dollar: " + Double.toString(dollar_amount));
      System.out.println("Euro: "      + Double.toString(euro_amount));
      System.out.println("Yuan: "      + Double.toString(yuan_amount));
      System.out.println("Koruna: "    + Double.toString(koruna_amount));
      System.out.println("Krone: "     + Double.toString(krone_amount));
      System.out.println("Sheqel: "    + Double.toString(sheqel_amount));
      System.out.println("Dinar: "     + Double.toString(dinar_amount));
   }
}