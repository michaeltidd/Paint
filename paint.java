import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paint extends Actor
{   
    private String shade;
    public paint(String shade){
        GreenfootImage img = new GreenfootImage(shade);
        setImage(img);
    }
    /**
     * Act - do whatever the paint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        
    }
}
