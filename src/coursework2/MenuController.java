
package coursework2;

import java.awt.Desktop.Action;
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
public class MenuController implements Initializable {
    
    @FXML private Button btnEnterDetails;
    @FXML private Button btnViewMArks;
    @FXML private Button btnViewDetails;
    
    @FXML
    public void EnterDetails(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("EnterStudentDetails.fxml"));
            Scene scene = new Scene(root);
            Stage stage= (Stage)(((Node)event.getSource()).getScene().getWindow());
            stage.setTitle("");
            stage.setScene(scene);
            stage.show(); 
    }
    @FXML
    public void ViewMArks(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ViewModuleMarks.fxml"));
            Scene scene = new Scene(root);
            Stage stage= (Stage)(((Node)event.getSource()).getScene().getWindow());
            stage.setTitle("");
            stage.setScene(scene);
            stage.show(); 
    }
    @FXML
    public void ViewDetails(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ViewStudentDetails.fxml"));
            Scene scene = new Scene(root);
            Stage stage= (Stage)(((Node)event.getSource()).getScene().getWindow());
            stage.setTitle("");
            stage.setScene(scene);
            stage.show(); 
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
