import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    
    /**
     * Act - do whatever the star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        changeWorld();
    }    
    
    /**
     * This method will change the world from class Homepage to Playing
     * and this method will call method pause of class Homepage
     */
    public void changeWorld(){
        if(Greenfoot.mouseClicked(this)){
            Homepage.pause();
            Greenfoot.setWorld(new Playing());
        }
    }
    
}
