/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheWorldOfTwoDomains;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class determines a program to draw the castle with decorations,the gate and arrow slits.
 * @author Vishal Thumar
 */
public class Castle {

    /**Declaration of x-position of top left corner of the castle**/
    private double x,

    /**Declaration of x-position of top left corner of the castle**/
    y,

    /**Declaration of the size variable of the castle**/
    size;

    /**Declaration of denizens variable for the castle**/
    private int denizens;

    /**Declaration of color variable to set color of the castle**/
    private Color color;

    /**Declaration of title to set title of the castle**/
    private String title;

    /**
     *Declaration of the object of Gate class to draw gate within the castle
     */
    private Gate gate;

    /**
     *Declaration of the objects of ArrowSlit class to draw arrow slits within the castle
     */
    private ArrowSlit arrowSlit1, arrowSlit2;
    
    /**
     * A constructor of Castle class to form castles of domains.
     * @param x
     * @param y
     * @param size
     * @param color
     */
    public Castle(double x,double y,double size,Color color){
        this.size=size;
        this.x=x;
        this.y=y;
        this.color=color;
        this.title=""; // blanck title for the castle
        this.denizens=(int) (Math.random()*3000+2000); //generating random number of denizens
        gate=new Gate(x+(size/4)+(size/6.5),y+size-(size/3),size/3); //calculate & determine values and calling an object to form a gate within a castle
        arrowSlit1=new ArrowSlit(x+(size/4)+(size/8),y+(size/4)+((size-(size/6))/4),size/8); //calculate & determine values and calling an object to form an arrow slit within a castle
        arrowSlit2=new ArrowSlit(x+((size/2)+(size/8)),y+(size/4)+((size-(size/6))/4),size/8); //calculate & determine values and calling an object to form the second arrow slit within a castle
    }
    
    /**
     * The second constructor of Castle class to form a queen's castle
     * @param x
     * @param y
     * @param title
     * @param color
     */
    public Castle(double x,double y,String title,Color color){
        this.size=200; //set size to extra large for queen's castle
        this.x=x;
        this.y=y;
        this.color=color;
        this.title=title;
        gate=new Gate(x+(size/4)+(size/6.5),y+size-(size/3),size/3); //calculate & determine values and calling an object to form a gate within the queen's castle
        arrowSlit1=new ArrowSlit(x+(size/4)+(size/8),y+(size/4)+((size-(size/6))/4),size/8); //calculate & determine values and calling an object to form an arrow slit within the queen's castle
        arrowSlit2=new ArrowSlit(x+((size/2)+(size/8)),y+(size/4)+((size-(size/6))/4),size/8); //calculate & determine values and calling an object to form the second arrow slit within the queen's castle
        
        
    }

    /**
     * return the size of the castle
     * @return
     */
    public double getSize() {
        return size;
    }

    /**
     * return the value of denizens lives in the castles
     * @return
     */
    public int getDenizens() {
        return denizens;
    }
    
    /**
     * A draw method to calculate all the values and to draw a castle 
     * with the gate and two arrow slits within.
     * @param gc
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(x+(size/4),y+(size/6),size/2,size-(size/6)); 
        
        gc.fillRect(x,y+size-(size/8),size,size/8);
        
        gc.fillRect(x+(size/4),y,size/6,size/6);
        gc.fillRect(x+(size-(size/4)-(size/6)),y,size/6,size/6);
        
        gate.draw(gc); //draws the gate
        arrowSlit1.draw(gc); // draws the first arrow slit
        arrowSlit2.draw(gc); // draws the second arrow slit
        
        gc.setStroke(Color.BLACK); //set the color of the title
        gc.fillText(title, x+(size/4), y-10); // draws the text title over a castle
    }
}