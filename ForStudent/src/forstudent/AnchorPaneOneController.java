/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forstudent;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Click
 */
public class AnchorPaneOneController implements Initializable {

    // ama nasandni variablaka 
    private static String name;
    @FXML
    private TextField txtName;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        AnchorPaneOneController.name = name;
    }

    @FXML
    private void MyEvent(ActionEvent event) {
        setName(txtName.getText());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        try {
            Parent newRoot = FXMLLoader.load(getClass().getResource("/forstudent/AnchorPaneTwo.fxml"));
            stage.getScene().setRoot(newRoot);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
