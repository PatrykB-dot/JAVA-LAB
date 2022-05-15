package com.example.lab_2;

import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    public CheckBox steelChoice;
    public CheckBox stainlessChoice;
    public TextField thickButton;
    public TextField heightButton;
    public TextField radiusButton;
    public Text finalText;

    public double calculateCapacity() {
        double radius = Double.parseDouble( radiusButton.getText() );
        double height = Double.parseDouble( heightButton.getText() );
        // koszt za kg blachy stalowej - 4.4 zł
        // koszt za kg blachy stalowej - 5 zł
        //---------------------------------------------------
        //obliczanie V - Pp*V
        double pi = 3.14;
        double firstResult = (radius*radius)*height*pi;
        // return (int) pi*firstResult;
        return firstResult;
    }
    // obliczanie masy
    public double calculateWeight() {
        double thickness = Double.parseDouble( thickButton.getText() );
        double capacity = calculateCapacity();
        return (capacity*thickness)/1000;
    }
    public double calculatePrice() {
        double firstPrice = 4.4;
        double secondPrice = 5;
        double finalPrice = 0;
        double weight = calculateWeight();
        if(steelChoice.isSelected()) {
            finalPrice = weight*firstPrice;
        } else if (stainlessChoice.isSelected()) {
            finalPrice = weight*secondPrice;
        }
        return finalPrice;
    }

    public void calculatedButtonClicked() {

        String price=String.valueOf(calculatePrice());

        finalText.setText(price);
    }
}