/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheWorldOfTwoDomains;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class determines a program to draw a gate of the castle.
 * @author Vishal Thumar
 */
public class Gate {

    /** Declaration of height variable for gate**/
    private double height,

    /**Declaration of x-position of top left corner of the gate**/
    x,

    /**Declaration of y-position of top left corner of the gate**/
    y;

    /**
     * A Constructor of gate to draw a gate
     * @param x
     * @param y
     * @param height
     */
    public Gate(double x,double y,double height){
        this.x=x;
        this.y=y;
        this.height=height;
    }
    
    /**
     * A draw method to draw a gate
     * @param gc
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(x,y,height/1.5,height);
    }
}
