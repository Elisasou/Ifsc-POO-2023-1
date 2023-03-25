/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package at;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class ImcatFXMLController implements Initializable {

    @FXML
    private TextField nomeTextField;
    @FXML
    private Spinner<?> spinnerIdade;
    @FXML
    private MenuButton selecaoSexo;
    @FXML
    private TextField alturaTextFild;
    @FXML
    private TextField pesoTextField;
    @FXML
    private TextField buttonCalcularImc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    private void handleButtonCalcularImc(ActionEvent event) {
        String nome = nomeTextField.getText();
        int idade = Integer.parseInt(spinnerIdade.getText());
        float altura = Integer.parseFloat(alturaTextFild.getText());
        float peso = Integer.parseFloat(pesoTextField.getText());        
        float imc = calcularImc( pesoTextField, alturaTextFild);
        String classificacao = classificarImc(imc);  
        System.out.println("Nome...........: " + nomeTextField + "\n" +
                           "Idade..........: " + spinnerIdade + "\n" +
                           "Peso...........: " + pesoTextField + "\n" +
                           "Altura.........: " + alturaTextFild + "\n" +
                           "Seu Imc eh.....: " + imc + "\n" +
                           "classificacao..: " + classificacao );
    }
        
        public static String classificarImc(float imc) {
         if (imc < 18.5){
            return ("Adulto com baixo peso.");
        
        }else if (imc < 25){
            return("Adulto com peso adequado ");
        
        }else if (imc < 30 ){
             return("Adulto com sobrepeso ");
        
        }else
             return("Adulto com obesidade.");
    }
        public static float calcularImc(float pesoTextField, float alturaTextFild){
        float imc = (float) (pesoTextField / Math.pow(alturaTextFild,2.0));
        return imc;
        }
        
        
    }
