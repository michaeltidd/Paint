import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class canvas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class canvas extends World
{
    brush cursor = new brush();
    /**
     * Constructor for objects of class canvas.
     * 
     */
    public canvas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(cursor, 300, 200);

        palette red = new red();
        addObject(red, 34, 24);

        palette blue = new blue();
        addObject(blue, 98, 24);
        prepare();
        
        palette black = new black();
        addObject(black, 162, 24);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
