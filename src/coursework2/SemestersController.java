
package coursework2;

import Classes.Modules;
import static coursework2.PreliminaryController.Marks2;
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
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vihanga Sangeeth
 */
public class SemestersController {
    public static ArrayList<Modules> Marks = new ArrayList<Modules>();
    
    //Semester 1
    //compulsary
    @FXML private TextField lblSC531;
    @FXML private TextField lblSC535;
    @FXML private TextField lblSC537;
    @FXML private TextField lblSC538;
    @FXML private TextField lblSC539;
    
    //optional
    @FXML private TextField lblSC532;
    @FXML private TextField lblSC533;
    @FXML private TextField lblSC534;
    @FXML private TextField lblSC536;
    @FXML private TextField lblSC540;
    @FXML private TextField lblSC541;
    @FXML private TextField lblSC542;
    @FXML private TextField lblSC543;
   
    //Semester 2
    //compulssary
    @FXML private TextField lblSC546;
    @FXML private TextField lblSC554;
    @FXML private TextField lblSC555;
    @FXML private TextField lblSC597;
    @FXML private TextField lblSC598;
    @FXML private TextField lblSC599;
    
    //optional
    @FXML private TextField lblSC547;
    @FXML private TextField lblSC548;
    @FXML private TextField lblSC549;
    @FXML private TextField lblSC550;
    @FXML private TextField lblSC551;
    @FXML private TextField lblSC552;
    @FXML private TextField lblSC553;
    @FXML private TextField lblSC556;
    @FXML private TextField lblSC557;
    @FXML private TextField lblSC558;
    @FXML private TextField lblSC559;
    @FXML private TextField lblSC560;
    @FXML private TextField lblSC561;
    
    //Semester 1
    //compulsary
    @FXML private CheckBox SC531c;
    @FXML private CheckBox SC535c;
    @FXML private CheckBox SC537c;
    @FXML private CheckBox SC538c;
    @FXML private CheckBox SC539c;
    
    //optional
    @FXML private CheckBox SC532c;
    @FXML private CheckBox SC533c;
    @FXML private CheckBox SC534c;
    @FXML private CheckBox SC536c;
    @FXML private CheckBox SC540c;
    @FXML private CheckBox SC541c;
    @FXML private CheckBox SC542c;
    @FXML private CheckBox SC543c;
   
    //Semester 2
    //compulssary
    @FXML private CheckBox SC546c;
    @FXML private CheckBox SC554c;
    @FXML private CheckBox SC555c;
    @FXML private CheckBox SC597c;
    @FXML private CheckBox SC598c;
    @FXML private CheckBox SC599c;
    
    //optional
    @FXML private CheckBox SC547c;
    @FXML private CheckBox SC548c;
    @FXML private CheckBox SC549c;
    @FXML private CheckBox SC550c;
    @FXML private CheckBox SC551c;
    @FXML private CheckBox SC552c;
    @FXML private CheckBox SC553c;
    @FXML private CheckBox SC556c;
    @FXML private CheckBox SC557c;
    @FXML private CheckBox SC558c;
    @FXML private CheckBox SC559c;
    @FXML private CheckBox SC560c;
    @FXML private CheckBox SC561c;
    
    //Semester 1
    @FXML private Label lbl531;
    @FXML private Label lbl532;
    @FXML private Label lbl533;
    @FXML private Label lbl534;
    @FXML private Label lbl535;
    @FXML private Label lbl536;
    @FXML private Label lbl537;
    @FXML private Label lbl538;
    @FXML private Label lbl539;
    @FXML private Label lbl540;
    @FXML private Label lbl541;
    @FXML private Label lbl542;
    @FXML private Label lbl543;
    
    //Semester 2
    @FXML private Label lbl546;
    @FXML private Label lbl547;
    @FXML private Label lbl548;
    @FXML private Label lbl549;
    @FXML private Label lbl550;
    @FXML private Label lbl551;
    @FXML private Label lbl552;
    @FXML private Label lbl553;
    @FXML private Label lbl554;
    @FXML private Label lbl555;
    @FXML private Label lbl556;
    @FXML private Label lbl557;
    @FXML private Label lbl558;
    @FXML private Label lbl559;
    @FXML private Label lbl560;
    @FXML private Label lbl561;
    @FXML private Label lbl597;
    @FXML private Label lbl598;
    @FXML private Label lbl599;
    
    @FXML private Button btnENTER;
    @FXML private Button btnENTER1;
    @FXML private Button btnNEXT;
    
    
    private Modules modl = new Modules();

    Modules mod2 = new Modules();
    public static ArrayList<Modules> results = new ArrayList<Modules>();
    
     private static boolean validation;
    public static int credit=0;
    public static double GP=0;
    public static double GPA;
    public static String DegreeCourse="No Degree Awarded";
    
    public void EnterDetails (ActionEvent event) throws IOException {
      
        validation = true;
        

        //Semester1
        //Compulsary
        modl.setStudentID(EnterStudentDetailsController.StuID);
        modl.setSC531(getCmp(lblSC531));
        modl.setSC535(getCmp(lblSC535));
        modl.setSC537(getCmp(lblSC537));
        modl.setSC538(getCmp(lblSC538));
        modl.setSC539(getCmp(lblSC539));
        
        
        
        //Optional
        if(validate(lblSC532)){
            modl.setSC532(getOpt(lblSC532));
        }
        if(validate(lblSC533)){
            modl.setSC533(getOpt(lblSC533));
        }
        if(validate(lblSC534)){
            modl.setSC534(getOpt(lblSC534));
        }
        if(validate(lblSC536)){
            modl.setSC536(getOpt(lblSC536));
        }
        if(validate(lblSC540)){
            modl.setSC540(getOpt(lblSC540));
        }
        if(validate(lblSC541)){
            modl.setSC541(getOpt(lblSC541));
        }
        if(validate(lblSC542)){
            modl.setSC542(getOpt(lblSC542));
        }
        if(validate(lblSC543)){
            modl.setSC543(getOpt(lblSC543));
        }
        //Semester 2
        //Compulsary
        modl.setSC546(getCmp(lblSC546));
        modl.setSC554(getCmp(lblSC554));
        modl.setSC555(getCmp(lblSC555));
        modl.setSC597(getCmp(lblSC597));
        modl.setSC598(getCmp(lblSC598));
        modl.setSC599(getCmp(lblSC599));
        
        //Compulsary
        if(validate(lblSC547)){
            modl.setSC547(getOpt(lblSC547));
        }
        if(validate(lblSC548)){
            modl.setSC548(getOpt(lblSC548));
        }
        if(validate(lblSC549)){
            modl.setSC549(getOpt(lblSC549));
        }
        if(validate(lblSC550)){
            modl.setSC550(getOpt(lblSC550));
        }
        if(validate(lblSC551)){
            modl.setSC551(getOpt(lblSC551));
        }
        if(validate(lblSC552)){
            modl.setSC552(getOpt(lblSC552));
        }
        if(validate(lblSC553)){
            modl.setSC553(getOpt(lblSC553));
        }
        if(validate(lblSC556)){
            modl.setSC556(getOpt(lblSC556));
        }
        if(validate(lblSC557)){
            modl.setSC557(getOpt(lblSC557));
        }
        if(validate(lblSC558)){
            modl.setSC558(getOpt(lblSC558));
        }
        if(validate(lblSC559)){
            modl.setSC559(getOpt(lblSC559));
        }
        if(validate(lblSC560)){
            modl.setSC560(getOpt(lblSC560));
        }
        if(validate(lblSC561)){
            modl.setSC561(getOpt(lblSC561));
        }
        Marks.add(modl);
        
       
        System.out.println("Credits : " + credit);
        GPA = GP/credit;
        mod2.setFinalCredits(credit);
        mod2.setGPA(GPA);
        results.add(mod2);
        
        System.out.println("GPA : " + GPA);
        DegreeCourse = ViewDegreeCourse();
        
    } 
   
       
   public static boolean validate(TextField text){
        boolean valid = false;
        if(text.getText().length()>0){
            try{
                int x = Integer.parseInt(text.getText());
                valid = true;
            }catch (NumberFormatException event){
                text.setText("Invalid");
                validation = false;
            }
        }else{
            valid = true;
        }
        return valid;
    } 
   
   public static int getOpt(TextField text){
        int marks =-1;
        if(text.getText().length()>0){
            gradingCrd2(text);
            marks = Integer.parseInt(text.getText());
            if(marks>40){
                credit+=2;

            }
            else {
                credit+=0;
            }

        }
        return marks;
    }

   public static int getCmp(TextField text){
        int marks =0;
        try{
            marks = Integer.parseInt(text.getText());
            gradingCrd2(text);
            if(marks>40){
                credit+=2;
            }
            else {
                credit+=0;
            }
        }catch (NumberFormatException event){
            validation = false;
            text.setText("Invalid Data");
        }
        return marks;
    }

   public static int getSeminar(TextField text){
        int marks =0;
        try{
            marks = Integer.parseInt(text.getText());
            gradingCrd1(text);
            if(marks>40){
                credit+=1;
            }
            else {
                credit+=0;
            }
        }catch (NumberFormatException e){
            validation = false;
            text.setText("Invalid Data");
        }
        return marks;
    }

   public static int findIndustrial(TextField text){
        int marks =0;
        try{
            marks = Integer.parseInt(text.getText());
            gradingIndustrial(text);
            if(marks>40){
                credit+=15;
            }
            else {
                credit+=0;
            }
        }catch (NumberFormatException event){
            validation = false;
            text.setText("Invalid Data");
        }
        return marks;
    }

   public static int findResearch(TextField text){
        int marks =0;
        try{
            marks = Integer.parseInt(text.getText());
            gradingResearch(text);
            if(marks>40){
                credit+=30;
            }
            else {
                credit+=0;
            }
        }catch (NumberFormatException event){
            validation = false;
            text.setText("Invalid Data");
        }
        return marks;
    }

   public static double gradingResearch(TextField text){
        int grade = 0;
        if(text.getText().length()>0) {
            grade = Integer.parseInt(text.getText());

            double gradepoint;
            if (grade > 84) {
                gradepoint = 4;
            } else if (grade > 69) {
                gradepoint = 3.67;
            } else if (grade > 64) {
                gradepoint = 3.33;
            } else if (grade > 59) {
                gradepoint = 3.00;
            } else if (grade > 54) {
                gradepoint = 2.67;
            } else if (grade > 44) {
                gradepoint = 2.33;
            } else if (grade > 39) {
                gradepoint = 2.00;
            } else if (grade > 34) {
                gradepoint = 1.67;
            } else if (grade > 29) {
                gradepoint = 1.00;
            } else {
                gradepoint = 0.00;
            }
            GP += gradepoint * 30;
        }

        return GP;
    }

   public static double gradingIndustrial(TextField text){
        int grade = 0;
        if(text.getText().length()>0) {
            grade = Integer.parseInt(text.getText());

            double gradepoint;
            if (grade > 84) {
                gradepoint = 4;
            } else if (grade > 69) {
                gradepoint = 3.67;
            } else if (grade > 64) {
                gradepoint = 3.33;
            } else if (grade > 59) {
                gradepoint = 3.00;
            } else if (grade > 54) {
                gradepoint = 2.67;
            } else if (grade > 44) {
                gradepoint = 2.33;
            } else if (grade > 39) {
                gradepoint = 2.00;
            } else if (grade > 34) {
                gradepoint = 1.67;
            } else if (grade > 29) {
                gradepoint = 1.00;
            } else {
                gradepoint = 0.00;
            }
            GP += gradepoint * 15;
        }

        return GP;
    }

   public static double gradingCrd2(TextField text){
        int grade = 0;
        if(text.getText().length()>0) {
            grade = Integer.parseInt(text.getText());

            double gradepoint;
            if (grade > 84) {
                gradepoint = 4;
            } else if (grade > 69) {
                gradepoint = 3.67;
            } else if (grade > 64) {
                gradepoint = 3.33;
            } else if (grade > 59) {
                gradepoint = 3.00;
            } else if (grade > 54) {
                gradepoint = 2.67;
            } else if (grade > 44) {
                gradepoint = 2.33;
            } else if (grade > 39) {
                gradepoint = 2.00;
            } else if (grade > 34) {
                gradepoint = 1.67;
            } else if (grade > 29) {
                gradepoint = 1.00;
            } else {
                gradepoint = 0.00;
            }
            GP += gradepoint * 2;
        }

        return GP;
    }

   public static double gradingCrd1(TextField text){
        int grade = 0;
        if(text.getText().length()>0) {
            grade = Integer.parseInt(text.getText());

            double gradepoint;
            if (grade > 84) {
                gradepoint = 4;
            } else if (grade > 69) {
                gradepoint = 3.67;
            } else if (grade > 64) {
                gradepoint = 3.33;
            } else if (grade > 59) {
                gradepoint = 3.00;
            } else if (grade > 54) {
                gradepoint = 2.67;
            } else if (grade > 44) {
                gradepoint = 2.33;
            } else if (grade > 39) {
                gradepoint = 2.00;
            } else if (grade > 34) {
                gradepoint = 1.67;
            } else if (grade > 29) {
                gradepoint = 1.00;
            } else {
                gradepoint = 0.00;
            }
            GP += gradepoint * 1;
        }

        return GP;
    }

    public static String ViewDegreeCourse(){
        if(GPA >= 3.70 && GPA <= 4.00){
            if(credit >= 25){
                DegreeCourse = "MSc by Coursework / Research / Coursework and Research with Distinction";
            }
        }
        if(GPA >= 3.50 && GPA <= 3.69){
            if(credit >= 25){
                DegreeCourse = "MSc by Coursework / Research / Coursework and Research with Merit";
            }
        }
        if(GPA >= 3.0 && GPA <= 3.49){
            if(credit >= 25){
                DegreeCourse = "MSc by Coursework / Research / Coursework and Research with Pass";
            }
        }
        if(GPA >= 2.75 && GPA <= 2.99){
            if(credit >= 25){
                DegreeCourse = "Postgraduate Diploma in Computer Science ";
            }
        }
        return DegreeCourse;
    }
@FXML
 public void NextMenu(ActionEvent event)throws IOException{
        try{

Parent root= FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root);
        Stage stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
 }catch (Exception event2) {
            event2.printStackTrace();
        }
        }

 public void EnterDetailsSem1 (ActionEvent event) throws IOException {
      ArrayList<Integer> markslist = new ArrayList<>();
        ArrayList<CheckBox> attendence = new ArrayList<>();
        ArrayList<Label> messages = new ArrayList<>();

        try{
            
        //Semester1
        modl.setStudentID(EnterStudentDetailsController.StuID);
        modl.setSC531(Integer.parseInt(lblSC531.getText()));
        modl.setSC535(Integer.parseInt(lblSC535.getText()));
        modl.setSC537(Integer.parseInt(lblSC537.getText()));
        modl.setSC538(Integer.parseInt(lblSC538.getText()));
        modl.setSC539(Integer.parseInt(lblSC539.getText()));
        
        if (lblSC532.getText().isEmpty()) {
            modl.setSC532(0);
        }
        else {
            modl.setSC532(Integer.parseInt(lblSC532.getText()));
        }
        if (lblSC533.getText().isEmpty()) {
            modl.setSC533(0);
        }
        else {
            modl.setSC533(Integer.parseInt(lblSC533.getText()));
        }
        if (lblSC534.getText().isEmpty()) {
            modl.setSC534(0);
        }
        else {
            modl.setSC534(Integer.parseInt(lblSC534.getText()));
        }
        if (lblSC536.getText().isEmpty()) {
            modl.setSC536(0);
        }
        else {
            modl.setSC536(Integer.parseInt(lblSC536.getText()));
        }
        if (lblSC540.getText().isEmpty()) {
            modl.setSC540(0);
        }
        else {
            modl.setSC540(Integer.parseInt(lblSC540.getText()));
        }
        if (lblSC541.getText().isEmpty()) {
            modl.setSC541(0);
        }
        else {
            modl.setSC541(Integer.parseInt(lblSC541.getText()));
        }
        if (lblSC542.getText().isEmpty()) {
            modl.setSC542(0);
        }
        else {
            modl.setSC542(Integer.parseInt(lblSC542.getText()));
        }
        if (lblSC543.getText().isEmpty()) {
            modl.setSC543(0);
        }
        else {
            modl.setSC543(Integer.parseInt(lblSC543.getText()));
        }
        Marks2.add(modl);
     
        
        markslist.add(modl.getSC531());
        markslist.add(modl.getSC532());
        markslist.add(modl.getSC533());
        markslist.add(modl.getSC534());
        markslist.add(modl.getSC535());
        markslist.add(modl.getSC536());
        markslist.add(modl.getSC537());
        markslist.add(modl.getSC538());
        markslist.add(modl.getSC539());
        markslist.add(modl.getSC540());
        markslist.add(modl.getSC541());
        markslist.add(modl.getSC542());
        markslist.add(modl.getSC543());
        
        messages.add(lbl531);
        messages.add(lbl532);
        messages.add(lbl533);
        messages.add(lbl534);
        messages.add(lbl535);
        messages.add(lbl536);
        messages.add(lbl537);
        messages.add(lbl538);
        messages.add(lbl539);
        messages.add(lbl540);
        messages.add(lbl541);
        messages.add(lbl542);
        messages.add(lbl543);
       
        attendence.add(SC531c);
        attendence.add(SC532c);
        attendence.add(SC533c);
        attendence.add(SC534c);
        attendence.add(SC535c);
        attendence.add(SC536c);
        attendence.add(SC537c);
        attendence.add(SC538c);
        attendence.add(SC539c);
        attendence.add(SC540c);
        attendence.add(SC541c);
        attendence.add(SC542c);
        attendence.add(SC543c);
 
        for (int i=0; i<markslist.size(); i++) {

                if (markslist.get(i) < 0 || markslist.get(i) > 100) {
                    messages.get(i).setText("Marks should be between 0 - 100");
                }
                else if (markslist.get(i) >= 40 && attendence.get(i).isSelected()) {
                    messages.get(i).setText("Pass");
                }
                else if (markslist.get(i) >= 40) {
                    messages.get(i).setText("80% attendance is required");
                }
                else {
                    messages.get(i).setText("Fail");
                }
                }
        }catch (Exception event2) {
                Alert message= new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Invalid input "
                    + " Please input a valid Input");
            message.showAndWait();

                lblSC531.setText("");
                lblSC532.setText("");
                lblSC533.setText("");
                lblSC534.setText("");
                lblSC535.setText("");
                lblSC536.setText("");
                lblSC537.setText("");
                lblSC538.setText("");
                lblSC539.setText("");
                lblSC540.setText("");
                lblSC541.setText("");
                lblSC542.setText("");
                lblSC543.setText("");
        }

 }
 public void EnterDetailsSem2 (ActionEvent event) throws IOException {
      ArrayList<Integer> markslist = new ArrayList<>();
        ArrayList<CheckBox> attendence = new ArrayList<>();
        ArrayList<Label> messages = new ArrayList<>();

        try{
             
        //Semester 2
        modl.setStudentID(EnterStudentDetailsController.StuID);
        modl.setSC546(Integer.parseInt(lblSC546.getText()));
        modl.setSC554(Integer.parseInt(lblSC554.getText()));
        modl.setSC555(Integer.parseInt(lblSC555.getText()));
        modl.setSC597(Integer.parseInt(lblSC597.getText()));
       // modl.setSC598(Integer.parseInt(lblSC598.getText()));
       // modl.setSC599(Integer.parseInt(lblSC599.getText()));
        
        if (lblSC547.getText().isEmpty()) {
            modl.setSC547(0);
        }
        else {
            modl.setSC547(Integer.parseInt(lblSC547.getText()));
        }
        if (lblSC548.getText().isEmpty()) {
            modl.setSC548(0);
        }
        else {
            modl.setSC548(Integer.parseInt(lblSC548.getText()));
        }
        if (lblSC549.getText().isEmpty()) {
            modl.setSC549(0);
        }
        else {
            modl.setSC549(Integer.parseInt(lblSC549.getText()));
        }
        if (lblSC550.getText().isEmpty()) {
            modl.setSC550(0);
        }
        else {
            modl.setSC550(Integer.parseInt(lblSC550.getText()));
        }
        if (lblSC551.getText().isEmpty()) {
            modl.setSC551(0);
        }
        else {
            modl.setSC551(Integer.parseInt(lblSC551.getText()));
        }
        if (lblSC552.getText().isEmpty()) {
            modl.setSC552(0);
        }
        else {
            modl.setSC552(Integer.parseInt(lblSC552.getText()));
        }
        if (lblSC553.getText().isEmpty()) {
            modl.setSC553(0);
        }
        else {
            modl.setSC553(Integer.parseInt(lblSC553.getText()));
        }
        if (lblSC556.getText().isEmpty()) {
            modl.setSC556(0);
        }
        else {
            modl.setSC556(Integer.parseInt(lblSC556.getText()));
        }
        if (lblSC557.getText().isEmpty()) {
            modl.setSC557(0);
        }
        else {
            modl.setSC557(Integer.parseInt(lblSC557.getText()));
        }
        if (lblSC558.getText().isEmpty()) {
            modl.setSC558(0);
        }
        else {
            modl.setSC558(Integer.parseInt(lblSC558.getText()));
        }
        if (lblSC559.getText().isEmpty()) {
            modl.setSC559(0);
        }
        else {
            modl.setSC559(Integer.parseInt(lblSC559.getText()));
        }
        if (lblSC560.getText().isEmpty()) {
            modl.setSC560(0);
        }
        else {
            modl.setSC560(Integer.parseInt(lblSC560.getText()));
        }
        if (lblSC561.getText().isEmpty()) {
            modl.setSC561(0);
        }
        else {
            modl.setSC561(Integer.parseInt(lblSC561.getText()));
        }
        Marks2.add(modl);
        
        markslist.add(modl.getSC546());
        markslist.add(modl.getSC547());
        markslist.add(modl.getSC548());
        markslist.add(modl.getSC549());
        markslist.add(modl.getSC550());
        markslist.add(modl.getSC551());
        markslist.add(modl.getSC552());
        markslist.add(modl.getSC553());
        markslist.add(modl.getSC554());
        markslist.add(modl.getSC555());
        markslist.add(modl.getSC556());
        markslist.add(modl.getSC557());
        markslist.add(modl.getSC558());
        markslist.add(modl.getSC559());
        markslist.add(modl.getSC560());
        markslist.add(modl.getSC561());
        markslist.add(modl.getSC597());
        //markslist.add(modl.getSC598());
        //markslist.add(modl.getSC599());
        
        messages.add(lbl546);
        messages.add(lbl547);
        messages.add(lbl548);
        messages.add(lbl549);
        messages.add(lbl550);
        messages.add(lbl551);
        messages.add(lbl552);
        messages.add(lbl553);
        messages.add(lbl554);
        messages.add(lbl555);
        messages.add(lbl556);
        messages.add(lbl557);
        messages.add(lbl558);
        messages.add(lbl559);
        messages.add(lbl560);
        messages.add(lbl561);
        messages.add(lbl597);
        messages.add(lbl598);
        messages.add(lbl599);
        
        attendence.add(SC546c);
        attendence.add(SC547c);
        attendence.add(SC548c);
        attendence.add(SC549c);
        attendence.add(SC550c);
        attendence.add(SC551c);
        attendence.add(SC552c);
        attendence.add(SC553c);
        attendence.add(SC554c);
        attendence.add(SC555c);
        attendence.add(SC556c);
        attendence.add(SC557c);
        attendence.add(SC558c);
        attendence.add(SC559c);
        attendence.add(SC560c);
        attendence.add(SC561c);
        attendence.add(SC597c);
        //attendence.add(SC598c);
        //attendence.add(SC599c);

        for (int i=0; i<markslist.size(); i++) {

                if (markslist.get(i) < 0 || markslist.get(i) > 100) {
                    messages.get(i).setText("Marks should be between 0 - 100");
                }
                else if (markslist.get(i) >= 40 && attendence.get(i).isSelected()) {
                    messages.get(i).setText("Pass");
                }
                else if (markslist.get(i) >= 40) {
                    messages.get(i).setText("80% attendance is required");
                }
                else {
                    messages.get(i).setText("Fail");
                }
                }
        }catch (Exception event2) {
                Alert message= new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Invalid input "
                    + " Please input a valid Input");
            message.showAndWait();

                lblSC546.setText("");
                lblSC547.setText("");
                lblSC548.setText("");
                lblSC549.setText("");
                lblSC550.setText("");
                lblSC551.setText("");
                lblSC552.setText("");
                lblSC553.setText("");
                lblSC554.setText("");
                lblSC555.setText("");
                lblSC556.setText("");
                lblSC557.setText("");
                lblSC558.setText("");
                lblSC559.setText("");
                lblSC560.setText("");
                lblSC561.setText("");
                lblSC597.setText("");
                //lblSC598.setText("");
                //lblSC599.setText("");
       
        
        }
 
 
 }
}