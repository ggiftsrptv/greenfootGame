import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class howto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class howto extends Actor
{
    
    /**
     * Act - do whatever the howto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeWorld();
    }
    
    /**
     * This method will change the world from class Homepage to HowToPlay
     * 
     */
    public void changeWorld(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new HowToPlay());
        }
    }
}
