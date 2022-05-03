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
        setImage(image);
    }
    /**
     * Act - do whatever the brush wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean erasing = false;
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){ 
            setLocation(mouse.getX(), mouse.getY());
            if(mouse.getButton() == 1){ //when you left click the mouse
                if(!erasing){
                    Actor paint = new paint(shade);
                    World world = getWorld();
                    world.addObject(paint, getX(), getY());
                }
                else{
                    Actor food = getOneObjectAtOffset(0,0,paint.class);
        
                    if(food != null){
                        World world = getWorld();
                        world.removeObject(food);
                    }
                }
            }
            if(mouse.getButton() == 1 && mouse.getX() < 64 && mouse.getY() < 44){
                shade = "redcirc.png";
                erasing = false;
            }
            else if(mouse.getButton() == 1 && 68 < mouse.getX() && mouse.getX() <  128 && mouse.getY() < 44){
                shade = "bluecirc.png";
                erasing = false;
            }
            else if(mouse.getButton() == 1 && 132 < mouse.getX() && mouse.getX() <  192 && mouse.getY() < 44){
                shade = "circ.png";
                erasing = false;
            }
            else if(mouse.getButton() == 1 && 196 < mouse.getX() && mouse.getX() <  256 && mouse.getY() < 44){
                shade = "greencirc.png";
                erasing = false;
            }
            else if(mouse.getButton() == 1 && 474 < mouse.getX() && mouse.getX() < 534 && mouse.getY() < 44){
                erasing = true;
            }
            else if(mouse.getButton() == 1 && 538 < mouse.getX() && mouse.getX() < 598 && mouse.getY() < 44){
                World world = getWorld();
                world.removeObjects(world.getObjects(paint.class));
            }
        }
    }
}
