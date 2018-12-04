
package coursework2;



import Classes.Modules;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vihanga Sangeeth
 */
public class PreliminaryController {
    
    public static ArrayList<Modules> Marks2 = new ArrayList<Modules>();
    
    @FXML private TextField txtSC411;
    @FXML private TextField txtSC412;
    @FXML private TextField txtSC414;
    @FXML private TextField txtSC415;
    @FXML private TextField txtSC416;
    @FXML private TextField txtSC417;
    @FXML private TextField txtSC418;
    
    @FXML private CheckBox SC411a;
    @FXML private CheckBox SC412a;
    @FXML private CheckBox SC414a;
    @FXML private CheckBox SC415a;
    @FXML private CheckBox SC416a;
    @FXML private CheckBox SC417a;
    @FXML private CheckBox SC418a;
    
    @FXML private Label lblSC411;
    @FXML private Label lblSC412;
    @FXML private Label lblSC414;
    @FXML private Label lblSC415;
    @FXML private Label lblSC416;
    @FXML private Label lblSC417;
    @FXML private Label lblSC418;
    
    @FXML private Button btnEnter;
    @FXML private Button btnNext;
    @FXML private Label lblInvalid;
    
    private Modules modl = new Modules();
    
    
    @FXML
    public void PreliminaryEnter(ActionEvent event)throws IOException{
       
       
       ArrayList<Integer> markslist = new ArrayList<>();
        ArrayList<Label> passorFail = new ArrayList<>();
        ArrayList<CheckBox> attendence = new ArrayList<>();
        
        try{
        
        modl.setStudentID(EnterStudentDetailsController.StuID);
        modl.setSC411(Integer.parseInt(txtSC411.getText()));
        modl.setSC412(Integer.parseInt(txtSC412.getText()));
        modl.setSC414(Integer.parseInt(txtSC414.getText()));
        modl.setSC415(Integer.parseInt(txtSC415.getText()));
        modl.setSC416(Integer.parseInt(txtSC416.getText()));
        modl.setSC417(Integer.parseInt(txtSC417.getText()));
        modl.setSC418(Integer.parseInt(txtSC418.getText()));
        Marks2.add(modl);
        
        markslist.add(modl.getSC411());
        markslist.add(modl.getSC412());
        markslist.add(modl.getSC414());
        markslist.add(modl.getSC415());
        markslist.add(modl.getSC416());
        markslist.add(modl.getSC417());
        markslist.add(modl.getSC418());
        
        passorFail.add(lblSC411);
        passorFail.add(lblSC412);
        passorFail.add(lblSC414);
        passorFail.add(lblSC415);
        passorFail.add(lblSC416);
        passorFail.add(lblSC417);
        passorFail.add(lblSC418);
        
        attendence.add(SC411a);
        attendence.add(SC412a);
        attendence.add(SC414a);
        attendence.add(SC415a);
        attendence.add(SC416a);
        attendence.add(SC417a);
        attendence.add(SC418a);
        
        for (int i=0; i<markslist.size(); i++) {

                if (markslist.get(i) < 0 || markslist.get(i) > 100) {
                    passorFail.get(i).setText("Marks should be between 0 - 100");
                }
                else if (markslist.get(i) >= 40 && attendence.get(i).isSelected()) {
                    passorFail.get(i).setText("Pass");
                }
                else if (markslist.get(i) >= 40) {
                    passorFail.get(i).setText("80% attendance is required");
                }
                else {
                    passorFail.get(i).setText("Fail");
                }
            }

        }catch (Exception event2) {
            
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Invalid input "
                    + " Please input a valid Input");
            message.showAndWait();
            
            txtSC411.setText("");
            txtSC412.setText("");
            txtSC414.setText("");
            txtSC415.setText("");
            txtSC416.setText("");
            txtSC417.setText("");
            txtSC418.setText("");
        }
      
    }
      
       @FXML
        public void NextSemester(ActionEvent event)throws IOException{
        try{  
        Parent root= FXMLLoader.load(getClass().getResource("Semesters.fxml"));
        Scene scene = new Scene(root);
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        }catch (Exception event2) {
            event2.printStackTrace();
        }
        if(txtSC411.getText().isEmpty()){
           txtSC411.setText("0");
        }
        if(txtSC412.getText().isEmpty()){
           txtSC412.setText("0");
        }
        if(txtSC414.getText().isEmpty()){
           txtSC414.setText("0");
        }
        if(txtSC415.getText().isEmpty()){
           txtSC415.setText("0");
        }
        if(txtSC416.getText().isEmpty()){
           txtSC416.setText("0");
        }
        if(txtSC417.getText().isEmpty()){
           txtSC417.setText("0");
        }
        if(txtSC418.getText().isEmpty()){
           txtSC418.setText("0");
        } 
        
        }
        
}
      
 
       
    
