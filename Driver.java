import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Driver{
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   try{
   System.out.println("1: Login");
   System.out.println("2: New Account");
   int loginChoice = input.nextInt();

   if (loginChoice == 1){
      
   }
   else if (loginChoice == 2){

   }
}
   catch(Exception loginError){
      System.out.println("Please enter a valid selection");
   }
   
}
}