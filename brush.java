import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class brush here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class brush extends Actor
{   
    private String shade = "circ.png";
    public brush(){
        GreenfootImage image = getImage();
        image.scale(18,32);
        setImage(image);
    }
    /**
     * Act - do whatever the brush wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){ 
            setLocation(mouse.getX(), mouse.getY());
            if(mouse.getButton() == 1){ //when you left click the mouse
                Actor paint = new paint(shade);
                World world = getWorld();
                world.addObject(paint, getX(), getY());
            }
            if(mouse.getButton() == 1 && mouse.getX() < 64 && mouse.getY() < 44){
                shade = "redcirc.png";
            }
            else if(mouse.getButton() == 1 && 68 < mouse.getX() && mouse.getX() <  128 && mouse.getY() < 44){
                shade = "bluecirc.png";
            }
            else if(mouse.getButton() == 1 && 132 < mouse.getX() && mouse.getX() <  192 && mouse.getY() < 44){
                shade = "circ.png";
            }
        }
    }
}
