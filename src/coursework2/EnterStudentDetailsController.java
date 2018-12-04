
package coursework2;

import Classes.StudentDetails;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vihanga Sangeeth
 */
public class EnterStudentDetailsController{
    public static ArrayList<StudentDetails> studetails = new ArrayList<StudentDetails>();
    
    @FXML TextField txtFirstname = new TextField();
    @FXML private TextField txtLastname;
    @FXML private TextField txtStuID;
    @FXML private TextField txtAge;
    @FXML private Button btnNext;
    @FXML private Label lblInvalid;
    
    public static String StuID = "";
    
 public void StoreDetails(ActionEvent event)throws IOException{
        
     boolean validID = SameID(txtStuID);
        boolean validAge=validation(txtAge);
        
        if(!validID) {
            if (validAge) {
     
     StudentDetails stu = new StudentDetails();
        
       
        stu.setStuFirstName(txtFirstname.getText());
        stu.setStuLastName(txtLastname.getText());
        stu.setStuID(txtStuID.getText());
        StuID = txtStuID.getText();
        stu.setStuAge(Integer.parseInt(txtAge.getText()));
        studetails.add(stu);
        
        
        Parent root= FXMLLoader.load(getClass().getResource("Preliminary.fxml"));
        Scene scene = new Scene(root);
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

     }
}
}
 public static boolean SameID(TextField txt){
        boolean retBool=false;
        String inId = txt.getText();
        for(StudentDetails st:studetails){
            if(st.getStuID().equals(inId)){
                retBool = true;
            }
        }if(retBool){
            txt.setText("ID exists");
        }
        return retBool;

    }

    public static boolean validation(TextField txt){
        boolean valid = false;
        if (txt.getText().length() > 0) {
            try {
                int i = Integer.parseInt(txt.getText());
                valid = true;
            } catch (NumberFormatException e) {
                txt.setText("Invalid");
            }
        }
        return valid;
    }

}