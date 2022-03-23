import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.stage.Stage;  
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;

public class Driver extends Application { 
   @Override     
   public void start(Stage primaryStage) throws Exception {     
       
    TextField textField1 = new TextField("Enter your name");
    Label label1 = new Label("Name: ");
    HBox box = new HBox(5);
    box.setPadding(new Insets(25, 5 , 5, 50));
    box.getChildren().addAll(label1, textField1);
    Scene scene1 = new Scene(box, 595, 150, Color.BEIGE);
      //creating a Group object 
      Group group = new Group(); 
       
      //Creating a Scene by passing the group object, height and width   
      Scene scene = new Scene(group ,600, 300); 
      
      //setting color to the scene 
      scene.setFill(Color.BLACK);  
      
      //Setting the title to Stage. 
      primaryStage.setTitle("Menu"); 
   
      //Adding the scene to Stage 
      primaryStage.setScene(scene); 
      primaryStage.setScene(scene1);
       
      //Displaying the contents of the stage 
      primaryStage.show(); 
   }    
   public static void main(String args[]){          
      launch(args);     
   }         
} 