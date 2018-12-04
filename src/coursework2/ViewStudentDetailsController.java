
package coursework2;

import Classes.StudentDetails;
import java.io.IOException;
import java.util.Objects;
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


public class ViewStudentDetailsController{
    
    @FXML private Label lblFirstName;
    @FXML private Label lblLastName;
    @FXML private Label lblStuID;
    @FXML private Label lblAge;
    @FXML private Label lblCredits;
    @FXML private Label lblGPA;
    @FXML private Label lblDegree;
    
    @FXML private Button btnSearchD;
    @FXML private Button btnBack;
    @FXML private TextField txtStuID;
    
    String firstname;
    String lastname;
    int age;
    String ID;
    
    public void ViewDeatils(){
        for(StudentDetails stu : EnterStudentDetailsController.studetails)
            if(Objects.equals(stu.getStuID(), txtStuID.getText())){
                firstname = stu.getStuFirstName();
                lastname = stu.getStuLastName();
                age = stu.getStuAge();
                ID = stu.getStuID();
                //degree = stu.getViewDegreeCourse();
                
                lblFirstName.setText(firstname);
                lblLastName.setText(lastname);
                lblStuID.setText(String.valueOf(ID));
                lblAge.setText(String.valueOf(age));
                //lblDegree.setText(degree);
            }
        final int credit = SemestersController.credit;
        final double GPA=SemestersController.GPA;
        lblGPA.setText(String.valueOf(GPA));
        lblCredits.setText(String.valueOf(credit));
        final String Degree = SemestersController.DegreeCourse;
        lblDegree.setText(Degree);
    }
        
        
         /*for (int i=0; i<EnterStudentDetailsController.studetails.size(); i++) {
            
            if(Objects.equals(EnterStudentDetailsController.studetails.get(i).getStuID(), txtStuID.getText())) {
                firstname = EnterStudentDetailsController.studetails.get(i).getStuFirstName();
                lastname  = EnterStudentDetailsController.studetails.get(i).getStuLastName();
                age  = EnterStudentDetailsController.studetails.get(i).getStuAge();
                ID = EnterStudentDetailsController.studetails.get(i).getStuID();
            }
            
                lblFirstName.setText(firstname);
                lblLastName.setText(lastname);
                lblStuID.setText(String.valueOf(ID));
                lblAge.setText(String.valueOf(age));
            lblGPA.setText(String.valueOf(SemestersController.results.get(i).getGPA()));
        lblCredits.setText(String.valueOf(SemestersController.results.get(i).getFinalCredits()));
        } 
        
        for(StudentDetails stu : EnterStudentDetailsController.studetails)
            if(Objects.equals(stu.getStuID(), txtStuID.getText())){
                firstname = stu.getStuFirstName();
                lastname = stu.getStuLastName();
                age = stu.getStuAge();
                ID = stu.getStuID();
                //degree = stu.getViewDegreeCourse();
                
                lblFirstName.setText(firstname);
                lblLastName.setText(lastname);
                lblStuID.setText(String.valueOf(ID));
                lblAge.setText(String.valueOf(age));
                //lblDegree.setText(degree);
            }
        final int credit = SemestersController.credit;
        final double GPA=SemestersController.GPA;
        lblGPA.setText(String.valueOf(GPA));
        lblCredits.setText(String.valueOf(credit));
        final String Degree = SemestersController.DegreeCourse;
        lblDegree.setText(Degree);
        
        
     */   
        
    
        @FXML 
        public void actionBackPage(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("Menu.fxml"));
            
           Scene scene=new Scene(root);
           Stage stage=(Stage)(((Node)event.getSource()).getScene().getWindow());
           stage.setScene(scene);
           stage.show(); 
    
   
    }


    
    }
    


  
    
    
