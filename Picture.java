/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square floor;
    private Person man;
    private Circle nube1;
    private Circle nube2;
    private Circle nube3;

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
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        
        floor = new Square();
        floor.makeVisible();
        floor.changeColor("green");
        floor.changeSize(1500);
        floor.moveVertical(130);
        floor.moveHorizontal(-500);
        
        sun.slowMoveVertical(0);
    }
   
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }
    public void moveSun(){
        sun.slowMoveVertical(110);
         wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            floor.changeColor("black");
    }
    public void newPerson(){
         man = new Person();
         man.moveHorizontal(-300);
         man.moveVertical(20);
         man.makeVisible();
         man.slowMoveHorizontal(170);
    }
    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    public void nube(){
            nube1 = new Circle();
            nube2 = new Circle();
            nube3 = new Circle();
            nube1.changeSize(40);
            nube2.changeSize(50);
            nube3.changeSize(40);
            nube1.moveHorizontal(-180);
            nube2.moveHorizontal(-200);
            nube3.moveHorizontal(-220);
            nube1.changeColor("black");
            nube2.changeColor("black");
            nube3.changeColor("black");
            nube1.makeVisible();
            nube2.makeVisible();
            nube3.makeVisible();
    }
    public void mueveNubes(){
    if (nube1 != null)
    {
            nube3.moveHorizontal(20);
            nube1.moveHorizontal(20);
            nube2.moveHorizontal(20);
            nube3.moveHorizontal(20);
            nube1.moveHorizontal(20);
            nube2.moveHorizontal(20);
            nube3.moveHorizontal(20);
            nube1.moveHorizontal(20);
            nube2.moveHorizontal(20);
            nube3.moveHorizontal(20);
            nube1.moveHorizontal(20);
            nube2.moveHorizontal(20);
            nube3.moveHorizontal(20);
            nube1.moveHorizontal(20);
            nube2.moveHorizontal(20);
            nube3.moveHorizontal(20);
            nube3.moveHorizontal(20);
            nube1.moveHorizontal(20);
            nube2.moveHorizontal(20);
            nube3.moveHorizontal(20);
            nube1.moveHorizontal(20);
            nube2.moveHorizontal(20);
            nube3.moveHorizontal(20);
            nube();
    }
    }
}
