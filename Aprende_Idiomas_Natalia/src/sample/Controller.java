package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Random;

public class Controller {
    @FXML
    public Label lPalabraAlea;
    public Button bCargar;
    public Label lAcierto;
    public Label lFallos;
    public TextField miResultado;
    public Button bComprobar;
    public TextField lPalabra;
    public Button nuevaPalabra;
    public Button nuevaTraduccion;
    int n=0;
    int cont=0;
    int contFallos=0;

    ArrayList<String> diccionario= new ArrayList<String>();
    ArrayList<String> traduccion= new ArrayList<String>();

    public void Mipalabra(){
        Random r= new Random();
       diccionario.add(lPalabra.getText());
        traduccion.add( ltraduccion.getText());
                for(int i=0;i<diccionario.size();i++){
                    n=r.nextInt(diccionario.size());
                }

    }


    public void Mostrar(){
        lPalabraAlea.setText(diccionario.get(n));
    }

    public void comprobar(){
       if(traduccion.get(n).equals(miResultado)){
           cont++;

        }else{
           contFallos++;
       }
    }


}
