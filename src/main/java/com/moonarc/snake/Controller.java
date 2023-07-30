package com.moonarc.snake;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Controller {

    @FXML
    private Canvas displayCanvas;
    @FXML
    private BorderPane rootPane;
    private Scene scene;



//    @FXML
//    public void initialize(){
//        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                KeyCode key = keyEvent.getCode();
//                if(key == KeyCode.UP){
//                    System.out.println("Arriba");
//                } else if (key == KeyCode.DOWN) {
//                    System.out.println("Abajo");
//                } else if (key == KeyCode.LEFT) {
//                    System.out.println("Left");
//                } else if (key == KeyCode.RIGHT) {
//                    System.out.println("right");
//                }
//            }
//        });
//    }
//    public void start(ActionEvent e){
//
//        //captar las teclas direccionales...
//        //cambiar la animacion en funcion de la tecla presionada
//        //hacer la logica para el movimiento de la serpiente
//        // agregar comida al azar
//        // al cojer la comida aumente tamaño
//        // agregar colision con los bordes y el mismo cuerpo
//
//        System.out.println("Hola");
//    }


}