import java.util.Formatter;
import java.util.Scanner;

public class Account {
    private String username;
    private String password;
    private String test;
    Scanner input = new Scanner(System.in);
    // sudo username and password for realism

    public void createAccount(){
        System.out.println("Please enter your userName");
        username = input.nextLine();
        System.out.println("Thanks! you have selected : " + username);

        System.out.println("Please choose a password");
        password = input.nextLine();
        System.out.println("Please re-enter your password");
        test = input.nextLine();

        if(password == test){
            System.out.println("Thanks! your password has been set");
        }
        else{
            System.out.println("The passwords did not match");
            password = "null";
        }
    }


    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){

        return password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    
}
