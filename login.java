import java.util.Scanner;

public class login {
   public void loginMenu() {
      Scanner input = new Scanner(System.in);
      Account create = new Account();

      System.out.println("1: Login");
      System.out.println("2: New Account");
      System.out.println("3: Reset username and password");
      int loginChoice = input.nextInt();

      if (loginChoice == 1) {
         String unInput = input.nextLine();
         String upInput = input.nextLine();
         
      } else if (loginChoice == 2) {
         create.createAccount();
      } else if (loginChoice == 3){
      String  newUser = input.nextLine();
      String  newPass = input.nextLine();
         create.setUsername(newUser);
         create.setPassword(newPass);
      }

   }

}
