/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheWorldOfTwoDomains;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class determines a program to draw arrow slits of the castle.
 * @author Vishal Thumar
 */
public class ArrowSlit {

    /**Declaration of x-position to draw the arrow slit**/
    private double x,

    /**Declaration of y-position to draw the arrow slit**/
    y,

    /**Declaration of the height of the arrow slit**/
    height;

    /**
     * A constructor of an arrow slit to draw an arrow slit.
     * @param x
     * @param y
     * @param height
     */
    public ArrowSlit(double x,double y,double height){
        this.height= height;
        this.x=x-(height/6);
        this.y=y-(height/2);
        
    }
    
    /**
     * A draw method to draw an arrow slit
     * @param gc
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(x,y,height/6,height);
    }
}