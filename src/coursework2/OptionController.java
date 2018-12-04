
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
public class OptionController implements Initializable {
    
    @FXML private Button btnEnter;
    
     @FXML
    private void option(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EnterStudentDetails.fxml"));
            Scene scene = new Scene(root);
            Stage stage= (Stage)(((Node)event.getSource()).getScene().getWindow());
            stage.setTitle("Main Screen");
            stage.setScene(scene);
            stage.show(); 
    }

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
