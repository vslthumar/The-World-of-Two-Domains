/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheWorldOfTwoDomains;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class is a domain class which includes two castles in it.
 * This class determines a program to draw a domain with it's size and population.
 * @author Vishal Thumar
 */
public class Domain {

    /**Declaration of x-position to draw a domain of two castles**/
    private double x;

    /**Declaration of y-position to draw a domain of two castles**/
    private double y;

    /**Declaration of size variable of the domain **/
    private double size;

    /**Declaration of the name variable of the domain**/
    private String name;

    /**
     * Declaration of one object of the Castle class for the first castle
     */
    private Castle castle1,

    /**
     * Declaration of the second object of the Castle class for the second castle
     */
    castle2;
    
    
    /**
     * A method to determine name, bottom x location of the first castle, y location of the first castle
     * and color of the castles in one domain
     * @param name
     * @param x
     * @param y
     * @param color
     */
    public void State(String name,int x,int y,Color color){
        this.x=x;
        this.y=y;
        this.name=name;
        this.size =(Math.random()*5000+3000); // random number generator for the size of the domain
        
        castle1=new Castle(x,y-120,120,color); // calls an object with calculation the values to draw the first castle in the domain
        castle2=new Castle(x+120+(Math.random()*70+2),y-70,70,color);// calls an object with calculation the values to draw the second castle in the domain
        
        
    }

    /**
     * A draw method to draw domain with two castles and it's name,size & population
     * @param gc
     */
    public void draw(GraphicsContext gc) {
        castle1.draw(gc); // draws the first castle
        castle2.draw(gc); //draws the second castle
        gc.setFill(Color.BLACK); // set color for the text
        gc.fillText(name+" (Size:"+size+" m, Population:"+castle1.getDenizens()+")", x , y+15); //draws the text following a domain
    }
}
