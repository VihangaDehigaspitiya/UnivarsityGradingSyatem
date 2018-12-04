
package coursework2;

import Classes.Modules;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ViewModuleMarksController implements Initializable {
    
    //Preliminary
    @FXML private Label txtSC411;
    @FXML private Label txtSC412;
    @FXML private Label txtSC414;
    @FXML private Label txtSC415;
    @FXML private Label txtSC416;
    @FXML private Label txtSC417;
    @FXML private Label txtSC418;
    

    //Semester 1
    @FXML private Label lblSC531;
    @FXML private Label lblSC532;
    @FXML private Label lblSC533;
    @FXML private Label lblSC534;
    @FXML private Label lblSC535;
    @FXML private Label lblSC536;
    @FXML private Label lblSC537;
    @FXML private Label lblSC538;
    @FXML private Label lblSC539;
    @FXML private Label lblSC540;
    @FXML private Label lblSC541;
    @FXML private Label lblSC542;
    @FXML private Label lblSC543;
    
    //Semester 2
    @FXML private Label lblSC546;
    @FXML private Label lblSC547;
    @FXML private Label lblSC548;
    @FXML private Label lblSC549;
    @FXML private Label lblSC550;
    @FXML private Label lblSC551;
    @FXML private Label lblSC552;
    @FXML private Label lblSC553;
    @FXML private Label lblSC554;
    @FXML private Label lblSC555;
    @FXML private Label lblSC556;
    @FXML private Label lblSC557;
    @FXML private Label lblSC558;
    @FXML private Label lblSC559;
    @FXML private Label lblSC560;
    @FXML private Label lblSC561;
    @FXML private Label lblSC597;
    @FXML private Label lblSC598;
    @FXML private Label lblSC599;
    
    @FXML private Button btnSearch;
    @FXML private TextField txtStuID;
    @FXML private Button btnBack;
    
    //Preliminary
    int SC411;
    int SC412;
    int SC414;
    int SC415;
    int SC416;
    int SC417;
    int SC418;
    
    //Semester 1
    int SC531;
    int SC532;
    int SC533;
    int SC534;
    int SC535;
    int SC536;
    int SC537;
    int SC538;
    int SC539;
    int SC540;
    int SC541;
    int SC542;
    int SC543;
    
    //Semester 2
    int SC546;
    int SC547;
    int SC548;
    int SC549;
    int SC550;
    int SC551;
    int SC552;
    int SC553;
    int SC554;
    int SC555;
    int SC556;
    int SC557;
    int SC558;
    int SC559;
    int SC560;
    int SC561;
    int SC597;
    int SC598;
    int SC599;
    
    public void ShowModuleMarks(ActionEvent event)throws IOException{
        for(Modules mod : SemestersController.Marks ){
            if(Objects.equals(mod.getStudentID(),txtStuID.getText())){
                
               
                //Semester 1
                SC531 = mod.getSC531();
                SC532 = mod.getSC532();
                SC533 = mod.getSC533();
                SC534 = mod.getSC534();
                SC535 = mod.getSC535();
                SC536 = mod.getSC536();
                SC537 = mod.getSC537();
                SC538 = mod.getSC538();
                SC539 = mod.getSC539();
                SC540 = mod.getSC540();
                SC541 = mod.getSC541();
                SC542 = mod.getSC542();
                SC543 = mod.getSC543();
                
                //Semester 2
                SC546 = mod.getSC546();
                SC547 = mod.getSC547();
                SC548 = mod.getSC548();
                SC549 = mod.getSC549();
                SC550 = mod.getSC550();
                SC551 = mod.getSC551();
                SC552 = mod.getSC552();
                SC553 = mod.getSC553();
                SC554 = mod.getSC554();
                SC555 = mod.getSC555();
                SC556 = mod.getSC556();
                SC557 = mod.getSC557();
                SC558 = mod.getSC558();
                SC559 = mod.getSC559();
                SC560 = mod.getSC560();
                SC561 = mod.getSC561();
                SC597 = mod.getSC597();
                SC598 = mod.getSC598();
                SC599 = mod.getSC599();
                
                
                
                //Semester 1
                lblSC531.setText(String.valueOf(SC531));
                lblSC532.setText(String.valueOf(SC532));
                lblSC533.setText(String.valueOf(SC533));
                lblSC534.setText(String.valueOf(SC534));
                lblSC535.setText(String.valueOf(SC535));
                lblSC536.setText(String.valueOf(SC536));
                lblSC537.setText(String.valueOf(SC537));
                lblSC538.setText(String.valueOf(SC538));
                lblSC539.setText(String.valueOf(SC539));
                lblSC540.setText(String.valueOf(SC540));
                lblSC541.setText(String.valueOf(SC541));
                lblSC542.setText(String.valueOf(SC542));
                lblSC543.setText(String.valueOf(SC543));
                
                //Semester 2
                lblSC546.setText(String.valueOf(SC546));
                lblSC547.setText(String.valueOf(SC547));
                lblSC548.setText(String.valueOf(SC548));
                lblSC549.setText(String.valueOf(SC549));
                lblSC550.setText(String.valueOf(SC550));
                lblSC551.setText(String.valueOf(SC551));
                lblSC552.setText(String.valueOf(SC552));
                lblSC553.setText(String.valueOf(SC553));
                lblSC554.setText(String.valueOf(SC554));
                lblSC555.setText(String.valueOf(SC555));
                lblSC556.setText(String.valueOf(SC556));
                lblSC557.setText(String.valueOf(SC557));
                lblSC558.setText(String.valueOf(SC558));
                lblSC559.setText(String.valueOf(SC559));
                lblSC560.setText(String.valueOf(SC560));
                lblSC561.setText(String.valueOf(SC561));
                lblSC597.setText(String.valueOf(SC597));
                lblSC598.setText(String.valueOf(SC598));
                lblSC599.setText(String.valueOf(SC599));
                
            }
        }
    
     for(Modules modl : PreliminaryController.Marks2 ){
            if(Objects.equals(modl.getStudentID(),txtStuID.getText())){
                
                //Preliminary
                SC411 = modl.getSC411();
                SC412 = modl.getSC412();
                SC414 = modl.getSC414();
                SC415 = modl.getSC415();
                SC416 = modl.getSC416();
                SC417 = modl.getSC417();
                SC418 = modl.getSC418();
                
                //Preliminary
                txtSC411.setText(String.valueOf(SC411));
                txtSC412.setText(String.valueOf(SC412));
                txtSC414.setText(String.valueOf(SC414));
                txtSC415.setText(String.valueOf(SC415));
                txtSC416.setText(String.valueOf(SC416));
                txtSC417.setText(String.valueOf(SC417));
                txtSC418.setText(String.valueOf(SC418));
            }
     }
    
    }
    @FXML 
        public void actionBackPage(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("Menu.fxml"));
            
           Scene scene=new Scene(root);
           Stage stage=(Stage)(((Node)event.getSource()).getScene().getWindow());
           stage.setScene(scene);
           stage.show(); 
    
   
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
