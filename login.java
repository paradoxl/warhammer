import java.util.Scanner;

public class login {
   public void loginMenu() {
      Scanner input = new Scanner(System.in);
      Account create = new Account();

      System.out.println("1: Login");
      System.out.println("2: New Account");
      int loginChoice = input.nextInt();

      if (loginChoice == 1) {

      } else if (loginChoice == 2) {
         create.createAccount();
      }

   }

}
