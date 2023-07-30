package com.moonarc.snake;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Start {
    private double linePositionX = 0;
    private double linePositionY = 0;
    private double lineSpeed = 2;
    public void update(Canvas displayCanvas){
        GraphicsContext drwn = displayCanvas.getGraphicsContext2D();
//        drwn.setFill(Color.RED);
//        drwn.setLineWidth(8);
//        drwn.strokeLine(100, 200, 300, 200);
//        System.out.println("gaaa");
//        LTR leftToRight = new LTR();
//        leftToRight.ltr(drwn,linePositionX,lineSpeed);
//        AnimationTimer animationTimerH = new AnimationTimer() {
//            @Override
//            public void handle(long l) {
//                drwn.clearRect(0,0,605,403);
//
//                drwn.setStroke(Color.RED);
//                drwn.setLineWidth(3);
//                drwn.strokeLine(605/2,linePositionY,605/2,linePositionY+200);
//                linePositionY += lineSpeed;
//                if(linePositionY>=403){
//                    System.out.println("Muerto");
//                     linePositionY=0;
//                }
//            }
//        };
//        animationTimerW.start();
//        animationTimerH.start();
    }
}
