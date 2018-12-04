/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vihanga Sangeeth
 */
public class LoginLecController implements Initializable {
    
    @FXML private TextField txtUsername;
    @FXML private TextField txtPassword;
    @FXML private Button btnLogin;
    @FXML private Button btnBack;
 
    static String userName;

    @FXML 
    private void login(ActionEvent evt) throws IOException{
        userName= txtUsername.getText();
        String password=txtPassword.getText();
        
        if(userName.equals("admin") && password.equals("123")){
            Parent root = FXMLLoader.load(getClass().getResource("Option.fxml"));
            Scene scene = new Scene(root);
            
            Stage stage= (Stage) (((Node) evt.getSource()).getScene().getWindow());
            stage.setTitle("Main Screen");
            stage.setScene(scene);
            stage.show();            
        }
        else{
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Check your username and password");
            message.showAndWait();
        }
    }
    
     @FXML private void actionBackPage(ActionEvent event) throws IOException{
   Parent root=FXMLLoader.load(getClass().getResource("Welcome.fxml"));
            
           Scene scene=new Scene(root);
           Stage stage=(Stage)(((Node)event.getSource()).getScene().getWindow());
           stage.setTitle("Main Value");
           stage.setScene(scene);
           stage.show(); 
    
   
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
