package Primes;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller{
    public TextField Jin,Kin;
    public Button JButt,KButt;
    public TextArea Jout,Kout;
    public void primeJava(){
        int in;
        try {
            in = Integer.valueOf(Jin.getText());
        } catch(Exception e){
            Jout.setText("Enter a number.");
            in =0;
        }
        if(in!=0){
            Jout.setText(PrimeJava.primelist(in));
        }
    }
    public void primeKotlin(){
        int in;
        try {
            in = Integer.valueOf(Kin.getText());
        } catch(Exception e){
            Kout.setText("Enter a number.");
            in =0;
        }
        if(in!=0){
            Kout.setText(PrimeKotlin.Companion.primelist(in));
        }
    }
}
