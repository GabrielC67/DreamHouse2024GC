package rocks.zipcode.dreamhouse;

import java.awt.*;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass;
    private Square driveway;
    private Circle cwindow1;
    private Square sky;
    private Square wall;
    private Square porch;
    private Square porch2;
    private Square porch3;
    private Square porch4;
    private Square porch5;
    private Square doorS;
    private Circle doorC;
    private Square window;
    private Square window2;
    private Square window3;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {

        sky = new Square();
        sky.changeColor("cyan");
        sky.changeSize(300);
        sky.moveHorizontal(-60);
        sky.moveVertical(-50);
        sky.makeVisible();

        sun = new Circle();
        sun.changeColor("orange");
        sun.moveHorizontal(180);
        sun.moveVertical(110);
        sun.changeSize(60);
        sun.makeVisible();

        grass = new Square();
        grass.changeColor("green");
        grass.changeSize(300);
        grass.moveVertical(150);
        grass.moveHorizontal(-60);
        grass.makeVisible();

        wall = new Square();
        wall.moveVertical(65);
        wall.changeSize(120);
        wall.changeColor("blue");
        wall.makeVisible();

        cwindow1 = new Circle();
        cwindow1.changeSize(30);
        cwindow1.makeVisible();
        cwindow1.changeColor("black");
        cwindow1.moveHorizontal(60);
        cwindow1.moveVertical(75);

        driveway = new Square();
        driveway.changeColor("gray");
        driveway.changeSize(100);
        driveway.moveHorizontal(-100);
        driveway.moveVertical(150);
        driveway.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.changeSize(23);
        window.moveHorizontal(10);
        window.moveVertical(130);
        window.makeVisible();

        window2 = new Square();
        window2.changeColor("black");
        window2.changeSize(27);
        window2.moveHorizontal(75);
        window2.moveVertical(90);
        window2.makeVisible();

        window3 = new Square();
        window3.changeColor("black");
        window3.changeSize(35);
        window3.moveHorizontal(70);
        window3.moveVertical(130);
        window3.makeVisible();

        doorS = new Square();
        doorS.changeSize (23);
        doorS.changeColor("black");
        doorS.moveVertical(145);
        doorS.moveHorizontal(40);
        doorS.makeVisible();

        doorC = new Circle();
        doorC.changeSize(24);
        doorC.makeVisible();
        doorC.changeColor("black");
        doorC.moveHorizontal(79);
        doorC.moveVertical(123);

        porch = new Square();
        porch.changeColor("white");
        porch.changeSize(15);
        porch.moveVertical(170);
        porch.makeVisible();

        porch2 = new Square();
        porch2.changeColor("white");
        porch2.changeSize(15);
        porch2.moveVertical(170);
        porch2.moveHorizontal(15);
        porch2.makeVisible();

        porch3 = new Square();
        porch3.changeColor("white");
        porch3.changeSize(15);
        porch3.moveVertical(170);
        porch3.moveHorizontal(30);
        porch3.makeVisible();

        porch4 = new Square();
        porch4.changeColor("white");
        porch4.changeSize(15);
        porch4.moveVertical(170);
        porch4.moveHorizontal(45);
        porch4.makeVisible();

        porch5 = new Square();
        porch5.changeColor("white");
        porch5.changeSize(15);
        porch5.moveVertical(170);
        porch5.moveHorizontal(60);
        porch5.makeVisible();

        roof = new Triangle();
        roof.changeSize(60, 160);
        roof.changeColor("black");
        roof.moveHorizontal(70);
        roof.moveVertical(50);
        roof.makeVisible();



    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            sky.changeColor("white");
            grass.changeColor("black");
            cwindow1.changeColor("white");
            driveway.changeColor("white");
            window2.changeColor("white");
            window3.changeColor("white");
            doorS.changeColor("white");
            doorC.changeColor("white");
            porch.changeColor("white");
            porch2.changeColor("white");
            porch3.changeColor("white");
            porch4.changeColor("white");
            porch5.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            sky.changeColor("cyan");
            sun.changeColor("orange");
            grass.changeColor("green");
            wall.changeColor("blue");
            cwindow1.changeColor("black");
            driveway.changeColor("gray");
            window.changeColor("black");
            window2.changeColor("black");
            window3.changeColor("black");
            doorS.changeColor("black");
            porch.changeColor("white");
            porch2.changeColor("white");
            porch3.changeColor("white");
            porch4.changeColor("white");
            porch5.changeColor("white");
            roof.changeColor("black");
        }
    }

}
