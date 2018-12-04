  
package coursework2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Vihanga Sangeeth
 */
public class WelcomeController implements Initializable {

    @FXML
    private Button btnLec;
    @FXML
    private Button btnStu;
   

   
    @FXML
    private void Lecturer(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginLec.fxml"));
            Scene scene = new Scene(root);
            Stage stage= (Stage)(((Node)event.getSource()).getScene().getWindow());
            stage.setTitle("Welcome");
            stage.setScene(scene);
            stage.show(); 
    }
    
       @FXML
    private void Student(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StudentLogin.fxml"));
            Scene scene = new Scene(root);
            Stage stage= (Stage)(((Node)event.getSource()).getScene().getWindow());
            stage.setTitle("Welcome");
            stage.setScene(scene);
            stage.show(); 
    }
    
    
@Override
    public void initialize(URL url, ResourceBundle rb) {
      
       
    }  

}
 
