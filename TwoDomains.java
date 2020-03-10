/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheWorldOfTwoDomains;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;

/**
 * This is the main class which draws two domains and a queen's castle with proper title, names,size and population.
 * @author Vishal Thumar
 */
public class TwoDomains extends Application {

    /**
     * Start method for graphics to draw the world of two domains.
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(950, 600); // Set canvas Size in Pixels
        stage.setTitle("The World of 'Two Domains'"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        
        int colorRed, colorBlue; //Declaration of colors to determine values for the queen's castle
        Random rand = new Random(); //A random object to make queen's castle color random
        boolean b = rand.nextBoolean(); //a boolean variable declation and making it's value random
        
        // if else statement to apply colors randomly for queen's castle
        if (b) { 
            colorRed = 0; //setting red value to the lowest
            colorBlue = 255; //set blue value to the highest
        } else {
            colorRed = 255; //setting red value to the highest
            colorBlue = 0; //setting blue value to the lowest
        }

        gc.setFill(Color.LIGHTGREEN); //set background color to light green
        gc.fillRect(0, 0, 950, 600); //apply backgrown color to whole canvas
        Domain d1 = new Domain(); // makes an object of the Domain class
        Domain d2 = new Domain(); //makes the second object of the Domain class
        
        // makes an object of the Castle class and calls a constructor to draw a queens castle
        Castle c1 = new Castle(350, (int) (50 + (Math.random() * 320)), "The Westros Queen!", Color.rgb(colorRed, 0, colorBlue));

        //calls the cunstructor of the domain class and set values to make two domains with castles within
        d1.State("Winterfell", 20, (int) (150 + (Math.random() * 400)), Color.BLUE);
        d2.State("Highgarden", 600, (int) (150 + (Math.random() * 400)), Color.RED);

        d1.draw(gc); //draws first domain
        d2.draw(gc); //draws secon domain
        c1.draw(gc); //draws queen's castle

        stage.show(); 
    }

    /**
     * The main method to launch the application
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
