/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author n231055a
 */
public class FXMLDocumentController implements Initializable {
    
    private int register=0;
    private boolean opeAdd=false;
    @FXML
    private TextField accumulater;
    
    @FXML
    private void KeyAction(ActionEvent event) {
        Button b = (Button)event.getSource();
        if(opeAdd == true){
            accumulater.setText("0");
            opeAdd = false;
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
