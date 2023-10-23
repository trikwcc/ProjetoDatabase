package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class dashboradControl {

    @FXML
    private AnchorPane main_form;   
    @FXML
    private ComboBox<?> active;
    @FXML
    private Button addCriminal_AddBtn;
    @FXML
    private ComboBox<?> addCriminal_AorE;
    @FXML
    private Button addCriminal_ClearBtn;
    @FXML
    private Button addCriminal_DeleteBtn;
    @FXML
    private TextField addCriminal_Due;
    @FXML
    private ImageView addCriminal_Image;
    @FXML
    private Button addCriminal_ImportBtn;
    @FXML
    private TextField addCriminal_TimeServed;
    @FXML
    private Button addCriminal_UpdateBtn;
    @FXML
    private Button addCriminal_btn;
    @FXML
    private TableColumn<?, ?> addCriminal_col_AorI;
    @FXML
    private TableColumn<?, ?> addCriminal_col_Due;
    @FXML
    private TableColumn<?, ?> addCriminal_col_criminalID;
    @FXML
    private TableColumn<?, ?> addCriminal_col_firstName;
    @FXML
    private TableColumn<?, ?> addCriminal_col_gender;
    @FXML
    private TableColumn<?, ?> addCriminal_col_lastName;
    @FXML
    private TableColumn<?, ?> addCriminal_col_setArrest;
    @FXML
    private TableColumn<?, ?> addCriminal_col_timeServed;
    @FXML
    private TextField addCriminal_firstName;
    @FXML
    private ComboBox<?> addCriminal_gender;
    @FXML
    private TextField addCriminal_lastName;
    @FXML
    private TextField addCriminal_search;
    @FXML
    private ComboBox<?> addCriminal_setArrest;
    @FXML
    private TableView<?> addCriminal_tableView;
    @FXML
    private ImageView addPolice_Image;
    @FXML
    private TableView<?> addPolice_TableView;
    @FXML
    private TextField addPolice_Username;
    @FXML
    private Button addPolice_addBtn;
    @FXML
    private Button addPolice_btn;
    @FXML
    private Button addPolice_clearBtn;
    @FXML
    private TableColumn<?, ?> addPolice_col_Username;
    @FXML
    private TableColumn<?, ?> addPolice_col_active;
    @FXML
    private TableColumn<?, ?> addPolice_col_firstName;
    @FXML
    private TableColumn<?, ?> addPolice_col_gender;
    @FXML
    private TableColumn<?, ?> addPolice_col_lastName;
    @FXML
    private TableColumn<?, ?> addPolice_col_peopleArrested;
    @FXML
    private TableColumn<?, ?> addPolice_col_policeID;
    @FXML
    private TableColumn<?, ?> addPolice_col_started;
    @FXML
    private TableColumn<?, ?> addPolice_col_timeWorked;
    @FXML
    private Button addPolice_deleteBtn;
    @FXML
    private TextField addPolice_firstName;
    @FXML
    private ComboBox<?> addPolice_gender;
    @FXML
    private Button addPolice_importBtn;
    @FXML
    private TextField addPolice_lastName;
    @FXML
    private TextField addPolice_search;
    @FXML
    private Button addPolice_updateBtn;
    @FXML
    private Button close;
    @FXML
    private ComboBox<?> criminal_AorE;
    @FXML
    private Button criminal_Clear;
    @FXML
    private Label criminal_Due;
    @FXML
    private ComboBox<?> criminal_Gender;
    @FXML
    private TextField criminal_ID;
    @FXML
    private TableView<?> criminal_TableView;
    @FXML
    private Label criminal_firstName;
    @FXML
    private Label criminal_lastName;
    @FXML
    private ComboBox<?> criminal_setArrest;
    @FXML
    private Label criminal_timeServed;
    @FXML
    private Button criminal_update;
    @FXML
    private TableColumn<?, ?> gerenciarC_col_AorE;
    @FXML
    private TableColumn<?, ?> gerenciarC_col_criminalId;
    @FXML
    private TableColumn<?, ?> gerenciarC_col_due;
    @FXML
    private TableColumn<?, ?> gerenciarC_col_firstName;
    @FXML
    private TableColumn<?, ?> gerenciarC_col_gender;
    @FXML
    private TableColumn<?, ?> gerenciarC_col_lastName;
    @FXML
    private TableColumn<?, ?> gerenciarC_col_setToArrest;
    @FXML
    private TableColumn<?, ?> gerenciarC_col_timeServed;
    @FXML
    private Button gerenciarCrim_btn;
    @FXML
    private TableColumn<?, ?> gerenciarD_col_Username;
    @FXML
    private TableColumn<?, ?> gerenciarD_col_active;
    @FXML
    private TableColumn<?, ?> gerenciarD_col_firstName;
    @FXML
    private TableColumn<?, ?> gerenciarD_col_gender;
    @FXML
    private TableColumn<?, ?> gerenciarD_col_lastName;
    @FXML
    private TableColumn<?, ?> gerenciarD_col_policeID;
    @FXML
    private TableColumn<?, ?> gerenciarD_col_startedOn;
    @FXML
    private Button gerenciarPol_btn;
    @FXML
    private Button home_btn;
    @FXML
    private BarChart<?, ?> home_chart;
    @FXML
    private Label home_totalCriminal;
    @FXML
    private Label home_totalPolice;
    @FXML
    private Label home_totalWorked;
    @FXML
    private Button logout;
    @FXML
    private Button minimise;
    @FXML
    private TextField policeId;
    @FXML
    private Button police_clear;
    @FXML
    private Label police_firstName;
    @FXML
    private Label police_gender;
    @FXML
    private Label police_lastName;
    @FXML
    private TableView<?> police_tableView;
    @FXML
    private Button police_update;
    @FXML
    private TextField police_username;
    @FXML
    private Label usename;

    
    public void minimize() {
    	Stage stage = (Stage)main_form.getScene().getWindow();
    	stage.setIconified(true);
    }
    
    public void initialize(URL location, ResourceBundle resources) {
    	throw new UnsupportedOperationException("Not supported yet.s");
    }
}
