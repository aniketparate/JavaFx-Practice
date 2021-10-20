package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.lang.ref.PhantomReference;


public class SceneController {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent event) {
        //System.out.println("UP");
        myCircle.setCenterY(y-=2);
    }
    public void down(ActionEvent event) {
        //System.out.println("DOWN");
        myCircle.setCenterY(y+=2);
    }
    public void left(ActionEvent event) {
        //System.out.println("LEFT");
        myCircle.setCenterX(x-=2);
    }
    public void right(ActionEvent event) {
        //System.out.println("RIGHT");
        myCircle.setCenterX(x+=2);
    }
}