/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxcalculator;

import java.math.BigDecimal;
import java.math.BigInteger;
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

    @FXML
    private TextField display;
    
    BigInteger reg = new BigInteger("0");
    BigDecimal register = new BigDecimal(0);
    BigDecimal accum = new BigDecimal(0);
    
    enum Operator { none, add, sub, mul, div, mod, root, eq};
    Operator ope = Operator.none;
    
    @FXML
    private void handleNumberAction(ActionEvent event){
        Button b = (Button)event.getSource();
        BigInteger val = new BigInteger(b.getText());
        
        reg = reg.multiply(new BigInteger("10"));
        reg = reg.add(val);
        
        register = new BigDecimal(reg.toString());
        display.setText(register.toPlainString());
    }
    
    private void clear(){
        reg = new BigInteger("0");
        register = new BigDecimal("0");
    }
    @FXML
    private void handleACAction(ActionEvent event){
        clear();
        display.setText("0");
    }
    
    private void calc(){
        switch(ope){
            case none:
                accum = register;
                return;
            case add:
                accum = accum.add(register);
                break;
            case sub:
                break;
            case mul:
                break;
            case div:
                break;
            case mod:
                break;
            case root:
                break;
            case eq:
                break;
        }
        display.setText(accum.toPlainString());
    }
    
    @FXML
    private void handleAddAction(ActionEvent event){
        calc();
        clear();
        ope = Operator.add;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
